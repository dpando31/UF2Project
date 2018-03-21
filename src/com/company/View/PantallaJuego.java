package com.company.View;

import com.company.manager.ManagerJuego;

import java.util.Scanner;

public class PantallaJuego {
    public void mostrar(ManagerJuego managerJuego){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pantalla Juego");
        System.out.println("Introduce nombre");
        String nombre = scanner.nextLine();


        managerJuego.crear(nombre);

        System.out.println("Videojuego Creado");
    }
}