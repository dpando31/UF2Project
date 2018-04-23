package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;
import com.company.model.Videojuego;

import java.util.Scanner;

public class PantallaUltimos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        System.out.println("Eston son los ultimos juegos");


        for  (int i = 0; i<3 && i<managerJuego.juego.length; i++) {
            if(managerJuego.juego[i] != null) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("                  FICHA DEl Juego                                      ");
                System.out.println("Nombre:               | \t" + managerJuego.juego[i].nombre              );
                System.out.println("Plataforma:           | \t" + managerJuego.juego[i].plataforma          );
                System.out.println("Desarrollador:        | \t" + managerJuego.juego[i].desarrollador       );
                System.out.println("Editor:               | \t" + managerJuego.juego[i].editor              );
                System.out.println("Fecha de lanzamiento: | \t" + managerJuego.juego[i].fechaLanzamiento    );
                System.out.println("Genero:               | \t" + managerJuego.juego[i].genero              );
                System.out.println("Motor Grafico:        | \t" + managerJuego.juego[i].motorGrafico        );
                System.out.println("Edad:                 | \t" + managerJuego.juego[i].pegi                );
                System.out.println("Precio:               | \t" + managerJuego.juego[i].precio              );
                System.out.println("-----------------------------------------------------------------------");

            }
        }
    }
}