package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscar {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        System.out.println("::Como quieres bucar::");
        System.out.println("a)Genero");
        System.out.println("b)Plataforma");
        System.out.println("c)Titulo");
        System.out.println("d)Volver pantalla principal");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();

        if ("a" .equals(opcion)){
        PantallaGenero pantallaGenero =new PantallaGenero();
        PantallaGenero.mostrar(managerJuego);

        } else if ("b" .equals(opcion)){
            PantallaPlataforma pantallaPlataforma =new PantallaPlataforma();
            pantallaPlataforma.mostrar(managerJuego);

        } else if ("c" .equals(opcion)){
            PantallaBuscarPorTitulo pantallaBuscarPorTitulo = new PantallaBuscarPorTitulo();
            pantallaBuscarPorTitulo.mostrar(managerJuego);
        }else if ("d".equals(opcion)) {
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego, managerUsuarios);
        }


    }

}
