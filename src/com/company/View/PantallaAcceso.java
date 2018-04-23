package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceso {
    void mostrar( ManagerUsuarios managerUsuarios ,ManagerJuego managerJuego){
        System.out.println("ACCEDER");
        System.out.println("Usuario:");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();


        boolean valido = managerUsuarios.comprobarUsuario(usuario, password);

        if(true == (valido)){
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego , managerUsuarios);

        }else {
            PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
            pantallaMenuAcceso.mostrar(managerJuego, managerUsuarios);
        }
    }
}
