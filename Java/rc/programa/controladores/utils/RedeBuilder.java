package programa.controladores.utils;

import programa.controladores.entidades.RedeClasseA;
import programa.controladores.entidades.RedeClasseB;

public class RedeBuilder {

    private static final Builder<RedeClasseA> redeFactoryClasseA = new Builder<>(RedeClasseA.class);
    private static final Builder<RedeClasseB> redeFactoryClasseB = new Builder<>(RedeClasseB.class);

    public static Builder<RedeClasseA> getRedeFactoryClasseA() {
        return redeFactoryClasseA;
    }

    public static Builder<RedeClasseB> getRedeFactoryClasseB() {
        return redeFactoryClasseB;
    }
}
