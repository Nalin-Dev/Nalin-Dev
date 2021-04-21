package programa.controladores.entidades;

public class RedeClasseB extends RedeBase {

    private static final int PRIMEIRO_IP = 172;
    private static final int SEGUNDO_IP = 16;

    @Override
    Ip validaPrimeiroBloco(int ip) {
        return new Ip(ValidacaoIP.isValidoEquals(ip, PRIMEIRO_IP));
    }

    @Override
    Ip validaSegundoBloco(int ip) {
        return new Ip(ValidacaoIP.isValidoMax(ip, SEGUNDO_IP));
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
