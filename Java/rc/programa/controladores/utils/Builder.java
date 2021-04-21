package programa.controladores.utils;

import programa.controladores.entidades.Ip;
import programa.controladores.entidades.RedeBase;
import programa.controladores.entidades.RedeClasseA;
import programa.controladores.entidades.RedeClasseB;
import programa.controladores.exception.RedeBuilderException;
import java.util.ArrayList;
import java.util.List;

public class Builder <T> {

    private final Class<T> type;
    private final List<Ip> ips = new ArrayList<>();

    public Builder(Class<T> type) {
        this.type = type;
    }

    public Builder addIp(final Ip ip) {
        this.ips.add(ip);
        return this;
    }

    public T build() {

        if (ips.size() > 4) {
            throw new RedeBuilderException();
        }

        RedeBase rede;
        if (this.type.getName().equals(RedeClasseA.class.getName())) {
            rede = new RedeClasseA();
        } else {
            rede = new RedeClasseB();
        }

        ips.forEach(rede::setNextIp);
        return (T) rede;
    }
}
