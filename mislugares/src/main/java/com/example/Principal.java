package com.example;

/**
 * Created by Adi on 01/05/2018.
 */

public class Principal {
    public static void main(String[] main) {
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3,TipoLugar.EDUCACION);
        System.out.println("Lugar " + lugar.toString());
    }
}
