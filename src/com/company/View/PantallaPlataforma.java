package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaPlataforma {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Que plataforma estas buscando?                                  ");
        System.out.println(" -PC                                    ");
        System.out.println(" -PlayStation 3                                    ");
        System.out.println(" -PlayStation 4                                   ");
        System.out.println(" -Nintendo Switch                                   ");
        System.out.println(" -Xbox 360                                    ");
        System.out.println(" -Xbox One                                    ");
        System.out.println(" -PS Vita                                   ");
        System.out.println(" -Wii U                                   ");
        System.out.println("1) Volver al buscador");
        System.out.println("2) Volver pantalla principal");
        String plataforma = scanner.nextLine();

        if ("1".equals(plataforma)) {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego, managerUsuarios);
        } else if ("2".equals(plataforma)) {
            PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego, managerUsuarios);
        }

        Videojuego[] listaplataforma = managerJuego.consultarPlataforma(plataforma);


        for (int i = 0; i < listaplataforma.length; i++) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                  FICHA DEl Juego                                      ");
            System.out.println("Nombre:               | \t" + listaplataforma[i].nombre);
            System.out.println("-----------------------------------------------------------------------");
        }
        if(listaplataforma.length == 0){
            System.out.println("No hay resultados");
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego, managerUsuarios);
        }


        System.out.println("Elige un videojuegos");
        String titulo = scanner.nextLine();

        Videojuego[] lista = managerJuego.consultarTitulo(titulo);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                  FICHA DEl Juego                                      ");
            System.out.println("Nombre:               | \t" + lista[i].nombre);
            System.out.println("Plataforma:           | \t" + lista[i].plataforma);
            System.out.println("Desarrollador:        | \t" + lista[i].desarrollador);
            System.out.println("Editor:               | \t" + lista[i].editor);
            System.out.println("Fecha de lanzamiento: | \t" + lista[i].fechaLanzamiento);
            System.out.println("Genero:               | \t" + lista[i].genero);
            System.out.println("Motor Grafico:        | \t" + lista[i].motorGrafico);
            System.out.println("Edad:                 | \t" + lista[i].PEGI);
            System.out.println("Precio:               | \t" + lista[i].precio);
            System.out.println("Valoracion :          | \t" + managerJuego.videojuegos[i].valoracion             );
            System.out.println("-----------------------------------------------------------------------");
        }

        if(lista.length == 0){
            System.out.println("No hay resultados");
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego, managerUsuarios);
        }



        System.out.println("1)Volver pantalla principal");
        System.out.println("2)Volver pantalla de buscar ");
        System.out.println("3)Volver pantalla principal i Añadir a favoritos ");
        System.out.println("4)Volver pantalla buscar i Añadir a favoritos ");

        String principal = scanner.nextLine();

        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("2".equals(principal)) {
            PantallaBuscar pantallaBuscar =new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego,managerUsuarios);
        }else if ("3".equals(principal)) {
            managerJuego.favoritos(titulo);
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("4".equals(principal)) {
            managerJuego.favoritos(titulo);
            PantallaBuscar pantallaBuscar =new PantallaBuscar();
            pantallaBuscar.mostrar(managerJuego,managerUsuarios);
        }else{
            System.out.println("Error opcion no valida");
            System.out.println("1)Volver pantalla principal");
            System.out.println("2)Volver pantalla de buscar ");
            System.out.println("3)Volver pantalla principal i Añadir a favoritos ");
            System.out.println("4)Volver pantalla buscar i Añadir a favoritos ");

            String principals = scanner.nextLine();

            if ("1".equals(principals)) {
                PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
            }else if ("2".equals(principals)) {
                PantallaBuscar pantallaBuscar =new PantallaBuscar();
                pantallaBuscar.mostrar(managerJuego,managerUsuarios);
            }else if ("3".equals(principals)) {
                managerJuego.favoritos(titulo);
                PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
            }else if ("4".equals(principals)) {
                managerJuego.favoritos(titulo);
                PantallaBuscar pantallaBuscar =new PantallaBuscar();
                pantallaBuscar.mostrar(managerJuego,managerUsuarios);
            }

        }

    }


}