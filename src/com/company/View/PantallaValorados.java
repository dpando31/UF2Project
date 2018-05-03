package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaValorados {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        System.out.println("Valoracion");


        for  (int i = 0; i<3 && i<managerJuego.videojuegos.length; i++) {
            if(managerJuego.videojuegos[i] != null) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("                  FICHA DEl Juego                                      ");
                System.out.println("Nombre:               | \t" + managerJuego.videojuegos[i].nombre              );
                System.out.println("Valoracion :          | \t" + managerJuego.videojuegos[i].valoracion             );
                System.out.println("-----------------------------------------------------------------------");

            }
        }
        System.out.println("1)Volver pantalla principal");
        Scanner scanner = new Scanner(System.in);
        String principal = scanner.nextLine();


        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else{
            System.out.println("Error opcion no valida");
            System.out.println("1)Volver pantalla principal");
            String principals = scanner.nextLine();
            if ("1".equals(principals)) {
                PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
            }
        }

    }
}
