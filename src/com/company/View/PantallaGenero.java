package com.company.View;


import com.company.manager.ManagerJuego;

import java.util.Scanner;
public class PantallaGenero {

    public static void mostrar(ManagerJuego managerJuego) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buscar por el genero");
        System.out.println("1.Deporte");
        System.out.println("2.Aventura");
        System.out.println("3.Accion");
        System.out.println("4.ciencia ficcion");
        System.out.println("5.Carreras");
        System.out.println("6.Estrategia");
        System.out.println("7.Lucha");
        System.out.println("8.Simulacion");
        System.out.println("9.Arcade");
        System.out.println("Elige un genero");
        String genero = scanner.nextLine();

        if ("1".equals(genero )) {
            System.out.println("Has elegido deporte");

        } else if ("2".equals(genero )) {
            System.out.println("Has elegido aventura");


        } else if ("3".equals(genero )) {
            System.out.println("Has elegido accion");


        } else if ("4".equals(genero )) {
            System.out.println("Has elegido ciencia ficcion");

        } else if ("5".equals(genero )) {
            System.out.println("Has elegido carreras");


        } else if ("6".equals(genero )) {
            System.out.println("Has elegido Estrategia");


        } else if ("7".equals(genero )) {
            System.out.println("Has elegido Lucha");


        }  else if ("8".equals(genero )) {
            System.out.println("Has elegido ciencia Simulacion");


        }else if ("9".equals(genero )) {
            System.out.println("Has elegido Arcade");


        }

    }
}