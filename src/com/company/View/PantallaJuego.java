package com.company.View;

import com.company.ManagerJuegos.ManagerJuego;

import java.util.Scanner;

public class PantallaJuego {
    public void mostrar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pantalla Juego");
        System.out.println("Introduce Puntuacion");
        String puntuacion = scanner.nextLine();

        ManagerJuego managerJuego = new ManagerJuego();
        managerJuego.crear(nombre);

        managerJuego.consultar();
    }
}
