package com.company.view;

import com.company.Genero;
import com.company.Plataforma;

import java.util.Scanner;

public class Pantallaprincipal {
    public void principal() {
        System.out.println("VideoGapp");
        System.out.println("a)Ultimoas videojuegos añadidos");
        System.out.println("b)Mas valorados");
        System.out.println("c)Buscar genero");
        System.out.println("b)Mis favoritos");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();
        if ("a" .equals(opcion)){
            Plataforma plataforma =new Plataforma();


        } else if ("b" .equals(opcion)){


        } else if ("c" .equals(opcion)){
            Genero genero =new Genero();

        }  else if ("d" .equals(opcion)) {


        }

    }
}
