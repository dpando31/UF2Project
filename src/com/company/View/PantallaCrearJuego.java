package com.company.View;

import com.company.manager.ManagerJuego;

import java.util.Scanner;

public class PantallaCrearJuego {
    public void mostrar(ManagerJuego managerJuego,PantallaPrincipal pantallaPrincipa){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon el nombre del juego que quieras añadir");
        String nombre = scanner.nextLine();





        managerJuego.Crearjuego(nombre);

        boolean valido = managerJuego.Crearjuego(nombre);

        if(true == (valido)){
            System.out.println("Ya se ha añadido el juego");
        }else {
            System.out.println("Ya esta");
        }



    }
}
