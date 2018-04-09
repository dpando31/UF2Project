package com.company.view;

import com.company.manager.Managerusuarios;

import java.util.Scanner;

public class Pantallaacceder {
    public void acceder(Managerusuarios managerusuarios){
        Scanner scanner =new Scanner(System.in);

        System.out.println("acceder");

        System.out.println("nombre");
        String nombre=scanner.nextLine();

        System.out.println("contraseña");
        String contraseña=scanner.nextLine();

        Managerusuarios.verificar(nombre,contraseña);
        String resultado = managerusuarios.verificar(nombre,contraseña);
        if (resultado .equals("verdadero")){
            Pantallaprincipal pantallaprincipal=new Pantallaprincipal();
            pantallaprincipal.principal(managerusuarios);
        }
        if (resultado .equals("no")){
            Pantallaprincipal pantallaprincipal=new Pantallaprincipal();
            pantallaprincipal.principal(managerusuarios);
        }
    }
}
