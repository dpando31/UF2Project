package com.company.View;

import com.company.ManagerJuegos.ManagerJuego;

public class Pantalla_Listar_Juego {
    public void mostrar(ManagerJuego managerJuego){
        System.out.println("Lista Juegos");

        managerJuego.consultar();
    }
}
