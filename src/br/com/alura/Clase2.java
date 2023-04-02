package br.com.alura;

import java.util.ArrayList;

public class Clase2 {

    public static void main(String[] args) {
        String variable1 = "clase1";
        String variable2 = "clase2";
        String variable3 = "clase3";
        String variable4 = "clase4";

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        System.out.println(listaString);
//      formas de recorrer una lista
//        for (int i = 0; i < listaString.size() ; i++) {
//            System.out.println(listaString.get(i));
//        }

//        for (String clase : listaString) {
//            System.out.println(clase);
//        }
//      foreach recuerso de lambdas, a partir de java 8
        listaString.forEach(clase->{
            System.out.println(clase);
        });
    }
}
