package com.company;

import com.company.ManagerJuegos.ManagerJuego;
import com.company.View.PantallaJuego;

public class DaniMain {
    public static void main(String[] args) {
        PantallaJuego pantallajuego = new PantallaJuego();
        ManagerJuego managerJuego = new ManagerJuego();
        pantallajuego.mostrar(managerJuego);
    }
}

//
//    Videojuego juego = new Videojuego();
//
//        juego.edad=18;
//                juego.fabricante="Bluehole";
//                juego.fechaPublicacion=20-12-2017;
//                juego.nombre= "PlayerUnknowns Battlegrounds";
//                juego.plataforma="PC";
//                juego.precio=29;
//
//                Videojuego juego2 = new Videojuego();
//
//
//                juego2.setPrecio(29);
//                juego2.setEdad(18);
//                juego2.setFabricante("EA Sports");
//                juego2.setNombre("FIFA18");
//                juego2.setPlataforma("PC");
//                juego2.setFechaPublicacion(1-1-2018);