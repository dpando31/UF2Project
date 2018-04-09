package com.company.view;

import com.company.manager.Managerusuarios;

import java.util.Scanner;

public class Pantalla {
    Scanner scanner =new Scanner(System.in);

    public void iniciar( Managerusuarios managerusuarios){
        System.out.println("menu principal");
        System.out.println("a)registre");
        System.out.println("b)acceder");
        String opcion=scanner.nextLine();

        if ("a" .equals(opcion)){
            panatallaregistro panatallaregistro =new panatallaregistro();
            panatallaregistro.registro(managerusuarios);
        } else if ("b" .equals(opcion)){
            Pantallaacceder pantallaacceder = new Pantallaacceder();
            pantallaacceder.acceder(managerusuarios);
        }


    }
}
