package com.company.View;

import com.company.manager.ManagerJuegos;

import java.util.Scanner;

public class PantallaPrincipal {
    public void mostrar(ManagerJuegos managerJuegos) {
        System.out.println("VideoGapp");
        System.out.println("a) Ultimos videojuegos añadidos");
        System.out.println("b) Mas valorados");
        System.out.println("c) Buscar ");
        System.out.println("d) Mis favoritos");
        System.out.println("e) Añadir videojuego");
        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();
        if ("a" .equals(opcion)){
            PantallaUltimos pantallaUltimos = new PantallaUltimos();
            pantallaUltimos.mostrar();

        } else if ("b" .equals(opcion)){
            PantallaValorados pantallaValorados = new PantallaValorados();
            pantallaValorados.mostrar();

        } else if ("c" .equals(opcion)){
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuegos);

        }  else if ("d" .equals(opcion)) {
            PantallaFavoritos pantallaFavoritos=new PantallaFavoritos();
            pantallaFavoritos.mostrar();
        }  else if ("e" .equals(opcion)) {
                PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
                pantallaCrearJuego.mostrar(managerJuegos);

        }
    }
}
