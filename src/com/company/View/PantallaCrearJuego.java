package com.company.View;

import com.company.manager.ManagerJuegos;

import java.util.Scanner;

public class PantallaCrearJuego {
    public void mostrar(ManagerJuegos managerJuegos){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pantalla Juego");
        System.out.println("Introduce nombre");
        String nombre = scanner.nextLine();


        managerJuegos.crear(nombre);

        System.out.println("Videojuego Creado");
    }
}