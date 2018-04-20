package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaCrearJuego {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir el nombre del videojuego");
        String nombre = scanner.nextLine();

        System.out.println("Introducir la fecha de lanzamiento del videojuego");
        String fechaLanzamiento = scanner.nextLine();

        System.out.println("Introducir el genero del videojuego");
        String genero = scanner.nextLine();

        System.out.println("Introducir la plataforma del videojuego");
        String plataforma = scanner.nextLine();

        System.out.println("Introducir el desarrollador del videojuego");
        String desarrollador = scanner.nextLine();

        System.out.println("Introducir el editor del videojuego");
        String editor = scanner.nextLine();

        System.out.println("Introducir el motorGrafico del videojuego");
        String motorGrafico = scanner.nextLine();

        System.out.println("Introducir el pegi del videojuego");
        String pegi = scanner.nextLine();

        System.out.println("Introducir el precio del videojuego");
        String precio = scanner.nextLine();


        managerJuego.crearJuego(nombre,fechaLanzamiento,genero,plataforma,desarrollador,editor,motorGrafico,pegi,precio);

        boolean valido = managerJuego.crearJuego(nombre,fechaLanzamiento,genero,plataforma,desarrollador,editor,motorGrafico,pegi,precio);

        if(true == (valido)){
            System.out.println("Ya se ha añadido el juego");
        }else {
            System.out.println("Ya esta");
        }
    }
}
