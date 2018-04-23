package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaUltimos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        System.out.println("Eston son los ultimos juegos");


        for  (int i = 0; i< managerJuego.juego.length; i++) {
            if(managerJuego.juego[i] != null) {
                System.out.println(managerJuego.juego[i].nombre);

            }
        }
    }
}