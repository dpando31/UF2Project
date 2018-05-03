package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaCrearJuego {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir el nombre del videojuego");
        String nombre = scanner.nextLine();
        if ((nombre == null)|| (nombre.equals(""))){
            System.out.println("No has puesto el nombre ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }


        System.out.println("Introducir la fecha de lanzamiento del videojuego");
        String fechaLanzamiento = scanner.nextLine();
        if ((fechaLanzamiento == null) || (fechaLanzamiento.equals(""))){
            System.out.println("No has puesto el fechaLanzamiento ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el genero del videojuego");
        String genero = scanner.nextLine();

        if ((genero == null)|| (genero.equals(""))){
            System.out.println("No has puesto el genero ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir la plataforma del videojuego");
        String plataforma = scanner.nextLine();
        if ((plataforma == null)|| (plataforma.equals(""))){
            System.out.println("No has puesto la plataforma ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el desarrollador del videojuego");
        String desarrollador = scanner.nextLine();
        if ((desarrollador == null)|| (desarrollador.equals(""))){
            System.out.println("No has puesto el desarrollador ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el editor del videojuego");
        String editor = scanner.nextLine();
        if ((editor == null)|| (editor.equals(""))){
            System.out.println("No has puesto el editor ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el motorGrafico del videojuego");
        String motorGrafico = scanner.nextLine();
        if ((motorGrafico == null)|| (motorGrafico.equals(""))){
            System.out.println("No has puesto el motorGrafico ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el pegi del videojuego");
        String pegi = scanner.nextLine();

        if ((pegi == null)|| (pegi.equals(""))){
            System.out.println("No has puesto el pegi ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir el precio del videojuego");
        String precio = scanner.nextLine();
        if ((precio == null)|| (precio.equals(""))){
            System.out.println("No has puesto el editor ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }

        System.out.println("Introducir la valoracion del videojuego");
        String valoracion = scanner.nextLine();

        if ((valoracion == null)|| (valoracion.equals(""))){
            System.out.println("No has puesto la valoracion ");
            PantallaCrearJuego pantallaCrearJuego = new PantallaCrearJuego();
            pantallaCrearJuego.mostrar(managerJuego, managerUsuarios);
        }


            managerJuego.crearJuego(nombre, fechaLanzamiento, genero, plataforma, desarrollador, editor, motorGrafico, pegi, precio, valoracion);

            boolean valido = managerJuego.crearJuego(nombre, fechaLanzamiento, genero, plataforma, desarrollador, editor, motorGrafico, pegi, precio, valoracion);

            if (true == (valido)) {
                System.out.println("Ya se ha añadido el videojuegos");
                PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego, managerUsuarios);
            } else {
                System.out.println("Ya esta");
                PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego, managerUsuarios);
            }
        }
    }

