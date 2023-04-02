package br.com.alura;

import java.util.ArrayList;

public class Clase1 {

    public static void main(String[] args) {
        String variable1="ejemplo1";
        String variable2="ejemplo2";
        String variable3="ejemplo3";
        String variable4="ejemplo4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        System.out.println(lista);
        lista.set(2, "ejemplo alterado");
        System.out.println(lista);

        System.out.println(lista.size());
    }
}
