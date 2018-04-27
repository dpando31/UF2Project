package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaPlataforma {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que plataforma estas buscando?");
        System.out.println("1.PC");
        System.out.println("2.Playstation");
        System.out.println("3.Microsoft");
        System.out.println("4.Nintendo");
        System.out.println("Elige una consola");
        String plataforma = scanner.nextLine();
        Videojuego[] listaplataforma = managerJuego.consultarPlataforma(plataforma);


        for (int i = 0; i < listaplataforma.length; i++) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                  FICHA DEl Juego                                      ");
            System.out.println("Nombre:               | \t" + listaplataforma[i].nombre);
            System.out.println("-----------------------------------------------------------------------");
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
            System.out.println("-----------------------------------------------------------------------");
        }



        System.out.println("1)Volver pantalla principal");
        System.out.println("2)Añadir a favoritos ");

        String principal = scanner.nextLine();


        if ("1".equals(principal)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("2".equals(principal)) {
            managerJuego.favoritos(principal);
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }



    }


}