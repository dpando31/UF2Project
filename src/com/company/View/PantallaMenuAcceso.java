package com.company.View;

import java.util.Scanner;

public class PantallaMenuAcceso {
    public void mostrar(){
        System.out.println("MENU ACCESO");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        switch (opcion){
            case "a":
                PantallaRegistro pantallaRegistro = new PantallaRegistro();
                pantallaRegistro.mostrar();
                break;
            case "b":
                PantallaAcceso pantallaAcceso = new PantallaAcceso();
                pantallaAcceso.mostrar();
                break;
        }
    }
}
