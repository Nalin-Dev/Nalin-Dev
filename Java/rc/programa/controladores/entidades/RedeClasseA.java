package programa.controladores.entidades;

public class RedeClasseA extends RedeBase {

    private static final int PRIMEIRO_IP = 10;

    @Override
    Ip validaPrimeiroBloco(int ip) {
        return new Ip(ValidacaoIP.isValidoMin(ip, PRIMEIRO_IP));
    }

    @Override
    Ip validaSegundoBloco(int ip) {
        return new Ip(ip);
    }

    @Override
    Ip validaTerceiroBloco(int ip) {
        return new Ip(ip);
    }

    @Override
    Ip validaQuartoBloco(int ip) {
        return new Ip(ip);
    }
}
