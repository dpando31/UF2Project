package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaUltimos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios, PantallaPrincipal pantallaPrincipal) {
        System.out.println("Eston son los ultimos juegos");
        System.out.println("1) Far Cry 5");
        System.out.println("2) Fortnite");
        System.out.println("3) Batman The Enemy Within");
        System.out.println("4) DKC Tropical Freeze");
        System.out.println("5) Hellblade Senua Sacrifice");
        System.out.println("6) Infernium");
        System.out.println("7) Monster Hunter World");
        System.out.println("8) Los Pilares de la Tierra");
        System.out.println("9) God of War");
        System.out.println("10) Sea of Thieves");

        for  (int i = 0; i< managerJuego.juego.length; i++) {
            System.out.println(managerJuego.juego[i]);
        }
    }


}
