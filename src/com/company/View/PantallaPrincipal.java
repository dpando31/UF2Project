package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaPrincipal {
    public void mostrar(ManagerJuego managerJuego , ManagerUsuarios managerUsuarios) {
        while(true) {
            System.out.println("VideoGapp");
            System.out.println("a) Ultimos videojuegos añadidos");
            System.out.println("b) Valoracion de videojuegos");
            System.out.println("c) Buscar ");
            System.out.println("d) Mis favoritos");
            System.out.println("e) Añadir videojuego");
            System.out.println("f) Listar juegos");
            System.out.println("g) Salir cuenta");
            System.out.println("h) Salir del programa");



            Scanner scanner = new Scanner(System.in);

            String opcion = scanner.nextLine();
            if ("a".equals(opcion) || "A".equals(opcion) ) {
                PantallaUltimos pantallaUltimos = new PantallaUltimos();
                pantallaUltimos.mostrar(managerJuego,managerUsuarios);

            } else if ("b".equals(opcion)|| "B".equals(opcion)) {
                PantallaValorados pantallaValorados = new PantallaValorados();
                pantallaValorados.mostrar(managerJuego,managerUsuarios);

            } else if ("c".equals(opcion)|| "C".equals(opcion)) {
                PantallaBuscar pantallaBuscar = new PantallaBuscar();
                pantallaBuscar.mostrar(managerJuego, managerUsuarios);

            } else if ("d".equals(opcion)|| "D".equals(opcion)) {
                PantallaFavoritos pantallaFavoritos = new PantallaFavoritos();
                pantallaFavoritos.mostrar(managerJuego, managerUsuarios);

            } else if ("e".equals(opcion)|| "E".equals(opcion)) {
                PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
                pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);

            } else if ("f".equals(opcion)|| "F".equals(opcion)) {
                PantallaListarJuego pantallaListarJuego =new PantallaListarJuego();
                pantallaListarJuego.mostrar(managerJuego,managerUsuarios);

            } else if ("g".equals(opcion)|| "G".equals(opcion)) {
                PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
                pantallaMenuAcceso.mostrar(managerJuego, managerUsuarios);

            } else if ("h".equals(opcion)|| "H".equals(opcion)) {
                return;
            }else{
                System.out.println("Error opcion no valida");
                PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego, managerUsuarios);

            }
        }
    }
}
