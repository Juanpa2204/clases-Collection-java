package com.alura;


import com.alura.modelo.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Ruby", 30);
        Curso curso3 = new Curso("Java", 20);
        Curso curso4 = new Curso("Php", 50);
        Curso curso2 = new Curso("JavaScript", 10);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        //cursos.sort(Comparator.comparing(Curso::getNombre));
        //Collections.sort(cursos, Comparator.comparing(Curso::getNombre));
        List<Curso> cursoList = cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursoList);
    }
}
