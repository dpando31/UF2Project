package com.company.View;


import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscarPorTitulo {

    public void mostrar(ManagerJuego managerJuego,ManagerUsuarios managerUsuarios ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon un titulo");
        String titulo = scanner.nextLine();
        managerJuego.consultarTitulo(titulo);

        boolean valido = managerJuego.consultarTitulo(titulo);

        if(false == (valido)){
            System.out.println("No esta el juego");
        }
        System.out.println("1)Volver menu principal");
        System.out.println("2)Añadir a favoritos ");


        String titulos = scanner.nextLine();


        if ("1".equals(titulos)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("2".equals(titulos)) {
            managerJuego.favotirtos(titulos);
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }



    }
}
