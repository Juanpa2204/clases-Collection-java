package com.alura;

import com.alura.modelo.Alumno;
import com.alura.modelo.Curso;
import java.util.Collection;
import java.util.HashSet;

public class Clase15 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("historia", 30);

        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Pepito los palotes","002");
        Alumno alumno3 = new Alumno("Juan Carlos","003");
        Alumno alumno4 = new Alumno("pedro Pedrito","004");
        Alumno alumno5 = new Alumno("Gustavo sanchez","005");
        Alumno alumno6 = new Alumno("Marcia Maria","006");
        Alumno alumno7 = new Alumno("Claudia patricia","007");

       // Collection<Alumno> listaAlumnos = new HashSet<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(curso1.verificaAlumno(alumnoNuevo));
    }
}
