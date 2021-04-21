package programa.controladores.entidades;

public abstract class RedeBase {

    protected Ip IP_1;
    protected Ip IP_2;
    protected Ip IP_3;
    protected Ip IP_4;

    public void setNextIp(Ip next) {
        if (IP_1 == null) {
            this.IP_1 = validaPrimeiroBloco(next.getValor());
        } else if (IP_2 == null) {
            this.IP_2 = validaSegundoBloco(next.getValor());
        } else if (IP_3 == null) {
            this.IP_3 = validaTerceiroBloco(next.getValor());
        } else {
            this.IP_4 = validaQuartoBloco(next.getValor());
        }
        if (next.next != null) { setNextIp(next.next); }
    }

    abstract Ip validaPrimeiroBloco(final int ip);
    abstract Ip validaSegundoBloco(final int ip);
    abstract Ip validaTerceiroBloco(final int ip);
    abstract Ip validaQuartoBloco(final int ip);

    @Override
    public String toString() {
        return String.format("%d.%d.%d.%d", IP_1.getValor(), IP_2.getValor(), IP_3.getValor(), IP_4.getValor());
    }
}
