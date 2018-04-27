package com.company.View;


import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaBuscarPorTitulo {

    public void mostrar(ManagerJuego managerJuego,ManagerUsuarios managerUsuarios ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon un titulo");
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


        if(lista.length == 0){
            System.out.println("No hay resultados");
        }


        System.out.println("1)Volver menu principal");
        System.out.println("2)Añadir a favoritos ");


        String titulos = scanner.nextLine();


        if ("1".equals(titulos)) {
            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }else if ("2".equals(titulos)) {
            managerJuego.favoritos(titulos);
            boolean validos = managerJuego.favoritos(titulo);

            PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();
            pantallaPrincipal.mostrar(managerJuego,managerUsuarios);
        }



    }
}
