package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaRegistro {
    public void mostrar(ManagerUsuarios managerUsuarios, ManagerJuego managerJuego){
        System.out.println("REGISTRO");

        System.out.println("Usuario:");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        //Pedir email nombre, ....

        managerUsuarios.crearUsuario(usuario, password);

        System.out.println("Usuario registrado");

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.mostrar(managerJuego,managerUsuarios);


    }
}
