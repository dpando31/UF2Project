package com.company.View;


import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;
public class PantallaGenero {

    public static void mostrar(ManagerJuego managerJuego , ManagerUsuarios managerUsuarios ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buscar por el genero");
        System.out.println("Deportes");
        System.out.println("Shooter");
        System.out.println("Driver");
        System.out.println("Sandbox");
        System.out.println("FPS");
        System.out.println("Aventura");
        System.out.println("Battle Royale");
        System.out.println("Volver pantalla principal");

        System.out.println("Elige un genero");
        String genero = scanner.nextLine();

        if ("1".equals(genero)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }

        managerJuego.consultarGenero(genero);
        boolean valido = managerJuego.consultarGenero(genero);



        System.out.println("Elige un juego");
        String juegos = scanner.nextLine();
        managerJuego.consultarTitulo(juegos);
        boolean validos = managerJuego.consultarTitulo(juegos);
        System.out.println("1)Volver pantalla principal");
        String principal = scanner.nextLine();

        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }

    }
}