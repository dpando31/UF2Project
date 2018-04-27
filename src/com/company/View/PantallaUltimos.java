package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

public class PantallaUltimos {
    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        System.out.println("Eston son los ultimos juegos");


        for  (int i = 0; i<3 && i<managerJuego.videojuegos.length; i++) {
            if(managerJuego.videojuegos[i] != null) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("                  FICHA DEl Juego                                      ");
                System.out.println("Nombre:               | \t" + managerJuego.videojuegos[i].nombre              );
                System.out.println("Plataforma:           | \t" + managerJuego.videojuegos[i].plataforma          );
                System.out.println("Desarrollador:        | \t" + managerJuego.videojuegos[i].desarrollador       );
                System.out.println("Editor:               | \t" + managerJuego.videojuegos[i].editor              );
                System.out.println("Fecha de lanzamiento: | \t" + managerJuego.videojuegos[i].fechaLanzamiento    );
                System.out.println("Genero:               | \t" + managerJuego.videojuegos[i].genero              );
                System.out.println("Motor Grafico:        | \t" + managerJuego.videojuegos[i].motorGrafico        );
                System.out.println("Edad:                 | \t" + managerJuego.videojuegos[i].PEGI                );
                System.out.println("Precio:               | \t" + managerJuego.videojuegos[i].precio              );
                System.out.println("-----------------------------------------------------------------------");

            }
        }
    }
}