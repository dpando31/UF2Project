package com.company.ManagerJuegos;

import com.company.modelJuego.Videojuego;

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
