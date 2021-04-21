package programa.controladores.exception;

public class IPException extends RuntimeException {
    private static final String MENSAGEM = "Erro ao tentar criar ip, tamanho não permitido";

    public IPException(Throwable cause) {
        super(MENSAGEM, cause);
    }

    public IPException( ) {
        super(MENSAGEM);
    }
}
