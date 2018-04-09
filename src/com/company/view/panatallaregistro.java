package com.company.view;

import com.company.manager.Managerusuarios;
import com.company.model.Usuario;

import java.util.Scanner;

public class panatallaregistro {
    public void registro(Managerusuarios managerusuarios){
        Scanner scanner =new Scanner(System.in);
        Usuario[] usuarios  = new Usuario [1000];
        System.out.println("registro");

        System.out.println("nombre");
        String nombre=scanner.nextLine();

        System.out.println("contraseña");
        String contraseña=scanner.nextLine();

        managerusuarios.crearUsuario(nombre,contraseña);


        Pantallaprincipal pantallaprincipal =new Pantallaprincipal();
        pantallaprincipal.principal();
    }
}
