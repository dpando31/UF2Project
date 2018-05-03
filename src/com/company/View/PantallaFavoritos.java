package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaFavoritos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                  Pantalla Favoritos                                    ");

        for  (int i = 0; i<managerJuego.favoritos.length; i++) {

            if(managerJuego.favoritos[i] != null) {

                System.out.println("Nombre:               | \t" + managerJuego.favoritos[i].nombre              );
                System.out.println("-----------------------------------------------------------------------");

            }
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



        System.out.println("1)Volver pantalla principal");

        String principal = scanner.nextLine();

        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else{
            System.out.println("Error opcion no valida");
            System.out.println("1)Volver pantalla principal");
            String principals = scanner.nextLine();
            if ("1".equals(principals)) {
                PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
                pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
            }
        }

    }

    }
