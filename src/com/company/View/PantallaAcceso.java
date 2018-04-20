package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceso {
    void mostrar( ManagerUsuarios managerUsuarios ,ManagerJuego managerJuego,PantallaPrincipal pantallaPrincipal){
        System.out.println("ACCEDER");
        System.out.println("Usuario:");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();


        boolean valido = managerUsuarios.comprobarUsuario(usuario, password);

        if(true == (valido)){
            pantallaPrincipal.mostrar(managerJuego , managerUsuarios,pantallaPrincipal);

        }
    }
}
