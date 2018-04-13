package com.company.View;

import com.company.model.Genero;
import com.company.model.Plataforma;

import java.util.Scanner;

public class Buscar {
    public void buscar(){
        System.out.println("Como quieres bucar");
        System.out.println("a)Genero");
        System.out.println("b)Plataforma");
        System.out.println("c)Titulo");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();

        if ("a" .equals(opcion)){
            Genero genero =new Genero();


        } else if ("b" .equals(opcion)){
            Plataforma plataforma =new Plataforma();


        } else if ("c" .equals(opcion)){
            Titulo titulo = new Titulo();

        }


    }

}
