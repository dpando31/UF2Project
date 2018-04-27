package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaPlataforma {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que plataforma estas buscando?");
        System.out.println("1.PC");
        System.out.println("2.Playstation");
        System.out.println("3.Microsoft");
        System.out.println("4.Nintendo");
        System.out.println("Elige una consola");

        String plataforma = scanner.nextLine();
        managerJuego.consultarPlataforma(plataforma);
        boolean validos = managerJuego.consultarPlataforma(plataforma);


        System.out.println("Elige un videojuegos");
        String plataformatitulo = scanner.nextLine();
        managerJuego.consultarPlataformaTitulo(plataformatitulo);

        boolean valido = managerJuego.consultarPlataformaTitulo(plataformatitulo);

        System.out.println("1)Volver pantalla principal");
        System.out.println("2)Añadir a favoritos ");

        String principal = scanner.nextLine();


        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("2".equals(principal)) {
            managerJuego.favoritos(principal);
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }



    }


}