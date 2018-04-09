package com.company.View;

import com.company.*;

import java.util.Scanner;

public class Pantallaprincipal {
    public void principal() {
        System.out.println("VideoGapp");
        System.out.println("a)Ultimos videojuegos añadidos");
        System.out.println("b)Mas valorados");
        System.out.println("c)Buscar ");
        System.out.println("b)Mis favoritos");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();
        if ("a" .equals(opcion)){
            Ultimos ultimos =new Ultimos();
            ultimos.ultimos();

        } else if ("b" .equals(opcion)){
            Valorados valorados =new Valorados();
            valorados.valor();

        } else if ("c" .equals(opcion)){
            Buscar buscar=new Buscar();
            buscar.buscar();

        }  else if ("d" .equals(opcion)) {
            Favoritos favoritos =new Favoritos();
            favoritos.favoritos();

        }

    }
}
