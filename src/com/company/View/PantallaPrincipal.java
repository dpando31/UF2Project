package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaPrincipal {
    public void mostrar(ManagerJuego managerJuego , ManagerUsuarios managerUsuarios ) {
        System.out.println("VideoGapp");
        System.out.println("a) Ultimos videojuegos añadidos");
        System.out.println("b) Mas valorados");
        System.out.println("c) Buscar ");
        System.out.println("d) Mis favoritos");
        System.out.println("e) Añadir videojuego");
        System.out.println("f) Salir cuenta");
        System.out.println("g) Salir del programa");


        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.nextLine();
        if ("a".equals(opcion)) {
            PantallaUltimos pantallaUltimos = new PantallaUltimos();
            pantallaUltimos.mostrar(managerJuego);

        } else if ("b".equals(opcion)) {
            PantallaValorados pantallaValorados = new PantallaValorados();
            pantallaValorados.mostrar(managerJuego);

        } else if ("c".equals(opcion)) {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego);

        } else if ("d".equals(opcion)) {
            PantallaFavoritos pantallaFavoritos = new PantallaFavoritos();
            pantallaFavoritos.mostrar(managerJuego);
        } else if ("e".equals(opcion)) {
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego);

        } else if ("f".equals(opcion)) {
         PantallaMenuAcceso pantallaMenuAcceso =new PantallaMenuAcceso();
         PantallaMenuAcceso.mostrar(managerJuego,managerUsuarios);
        } else if ("g".equals(opcion)) {

        }
    }
}
