package com.company;

import java.util.Scanner;
public class Genero {

    int   genero;
    private Scanner scanner;

    void  buscar (){

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
        genero =scanner.nextInt();



    }
    void igual(){
        if (genero == 1){
            System.out.println("Has elegido deporte");

        }

        if (genero == 2){
            System.out.println("Has elegido aventura");

        }

        if (genero == 3){
            System.out.println("Has elegido accion");
        }

        if (genero == 4){
            System.out.println("Has elegido ciencia ficcion");
        }

        if (genero == 5){
            System.out.println("Has elegido carreras");
        }

        if (genero == 6){
            System.out.println("Has elegido Estrategia");
        }

        if (genero == 7){
            System.out.println("Has elegido Lucha");

        }

        if (genero == 8){
            System.out.println("Has elegido ciencia Simulacion");

        }

        if (genero == 9) {
            System.out.println("Has elegido Arcade");
        }
    }
}

