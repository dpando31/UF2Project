package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaFavoritos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);


        for  (int i = 0; i<managerJuego.favoritos.length; i++) {

            if(managerJuego.favoritos[i] != null) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("                  Pantalla Favoritos                                    ");
                System.out.println("Nombre:               | \t" + managerJuego.favoritos[i].nombre              );
                System.out.println("-----------------------------------------------------------------------");

            }
        }
        System.out.println("                    1)Menu principal                                    ");
        String favoritos = scanner.nextLine();

        if ("1".equals(favoritos)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }



    }
}