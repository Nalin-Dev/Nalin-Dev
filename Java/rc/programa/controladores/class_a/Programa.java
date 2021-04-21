package programa.controladores.class_a;

import programa.controladores.entidades.Ip;
import programa.controladores.entidades.RedeBase;
import programa.controladores.entidades.RedeClasseA;
import programa.controladores.entidades.RedeClasseB;
import programa.controladores.utils.RedeBuilder;

public class Programa {
    public static void main(String[] args) {
        RedeBase classeA = (RedeClasseA) RedeBuilder.getRedeFactoryClasseA()
                .addIp(new Ip(10))
                .addIp(new Ip(0))
                .addIp(new Ip(0))
                .addIp(new Ip(0))
                .build();

        System.out.println(classeA.toString());

        RedeBase classeB = (RedeClasseB) RedeBuilder.getRedeFactoryClasseB()
                .addIp(new Ip(172))
                .addIp(new Ip(168))
                .addIp(new Ip(0))
                .addIp(new Ip(0))
                .build();

        System.out.println(classeB.toString());
    }
}
