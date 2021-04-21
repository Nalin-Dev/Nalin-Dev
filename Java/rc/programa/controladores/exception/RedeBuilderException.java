package programa.controladores.exception;

public class RedeBuilderException extends RuntimeException {
    private static final String MENSAGEM = "Erro ao tentar criar rede, excedeu numero de blocos maximo 4.";

    public RedeBuilderException(Throwable cause) {
        super(MENSAGEM, cause);
    }

    public RedeBuilderException( ) {
        super(MENSAGEM);
    }
}
