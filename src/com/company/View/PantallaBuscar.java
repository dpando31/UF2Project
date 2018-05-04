package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscar {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        System.out.println("::  Elige el metodo de busqueda: ::");
        System.out.println("a) Título");
        System.out.println("b) Plataforma");
        System.out.println("c) Genero");
        System.out.println("d) Volver pantalla principal");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();

        if ("a" .equals(opcion)|| "A".equals(opcion)){
            PantallaBuscarPorTitulo pantallaBuscarPorTitulo = new PantallaBuscarPorTitulo();
            pantallaBuscarPorTitulo.mostrar(managerJuego,managerUsuarios);

        } else if ("b" .equals(opcion)|| "B".equals(opcion)){
            PantallaPlataforma pantallaPlataforma =new PantallaPlataforma();
            pantallaPlataforma.mostrar(managerJuego,managerUsuarios);

        } else if ("c" .equals(opcion)|| "C".equals(opcion)){
            PantallaGenero pantallaGenero =new PantallaGenero();
            PantallaGenero.mostrar(managerJuego,managerUsuarios);

        } else if ("d".equals(opcion)|| "D".equals(opcion)) {
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego, managerUsuarios);
        }else{
            System.out.println("Error opcion no valida");
            PantallaBuscar pantallaBuscar =new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego,managerUsuarios);

        }


    }

}
