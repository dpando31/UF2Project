package com.company.manager;

import com.company.model.Videojuego;

public class ManagerVideojuego {

    Videojuego videojuego;

    public void crear(String nombre, String apellido) {
        Videojuego juego = new Videojuego();

        juego.nombre= nombre;
        juego.fabricante=apellido;
    }


    public Videojuego consultar() {
        return videojuego;
    }
}