package com.company.View;

import com.company.manager.ManagerJuego;

import java.util.Scanner;

public class PantallaCrearJuego {
    public void mostrar(ManagerJuego managerJuego){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon el nombre del juego que quieras añadir");
        String nombre = scanner.nextLine();

        System.out.println("Genero del juego");
        String genero = scanner.nextLine();

        System.out.println("Pon la plataforma del juego");
        String plataforma = scanner.nextLine();




        managerJuego.Crearjuego(nombre);

        boolean valido = managerJuego.Crearjuego(nombre);

        if(true == (valido)){
            System.out.println("Ya se ha añadido el juego");
        }



    }
}
