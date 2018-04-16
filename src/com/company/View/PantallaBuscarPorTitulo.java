package com.company.View;


import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscarPorTitulo {

    void mostrar(ManagerJuego managerJuego) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon un titulo");
        String titulo = scanner.nextLine();
        managerJuego.consultar(titulo);

        boolean valido = managerJuego.consultar(titulo);

        if(false == (valido)){
            System.out.println("No esta el juego");
        }

    }
}
