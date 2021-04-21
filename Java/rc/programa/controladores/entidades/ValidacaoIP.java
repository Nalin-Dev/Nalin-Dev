package programa.controladores.entidades;

import programa.controladores.exception.IPException;

public class ValidacaoIP {
    public static Integer isValidoMax(final int valor, final int max) {
        if (valor > max || valor < 0) {
            throw new IPException();
        }
        return valor;
    }

    public static Integer isValidoMin(final int valor, final int min) {
        if (valor < min || valor < 0) {
            throw new IPException();
        }
        return valor;
    }

    public static Integer isValidoBeetwen(final int valor, final int min, final int max) {
        if (valor < min || valor > max) {
            throw new IPException();
        }
        return valor;
    }

    public static Integer isValidoEquals(final int valor, final int other) {
        if (valor != other) {
            throw new IPException();
        }
        return valor;
    }
}
