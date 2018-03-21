package com.company.manager;

import com.company.model.Videojuego;

public class ManagerJuego {
    Videojuego videojuego;
    public void crear(String nombre){
        videojuego = new Videojuego();

        videojuego.nombre = nombre;

    }
    public Videojuego consultar(){
        return videojuego;
    }
}
