package com.company;

import com.company.model.Videojuego;

public class DaniMain {
    public static void main(String[] args) {
        Videojuego juego = new Videojuego();

        juego.edad=18;
        juego.fabricante="Bluehole";
        juego.fechaPublicacion=20-12-2017;
        juego.nombre= "PlayerUnknowns Battlegrounds";
        juego.plataforma="PC";
        juego.precio=29;
    }
}
