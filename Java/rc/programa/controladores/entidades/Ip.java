package programa.controladores.entidades;

import programa.controladores.exception.IPException;

public class Ip {

    private final Integer ip;

    public Ip next;

    public Ip(final Integer ip) {
        if (ip >= 0 && ip <= 255) {
            this.ip = ip;
        } else {
            throw new IPException();
        }
    }

    public Integer getValor() {
        return this.ip;
    }

    public Ip setNext(Ip next) {
        this.next = next;
        return this;
    }
}
