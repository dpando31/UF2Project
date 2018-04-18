package com.company.manager;


import com.company.model.Videojuego;

public class ManagerJuego {
//    public Videojuego videojuego;
    public Videojuego[] juego = new Videojuego[15];

    public int FIFA = 0;
    public int PUBG = 1;
    int Call_of_Duty = 2;
    int Assetto_Corsa= 3;
    int Dirt3 = 4;
    int Dirt_Rally = 5;
    int CSGO = 6;
    int GtaV = 7;
    int Far_Cry_5= 8;
    int Fortnite = 9;
    int Overwatch = 10;
    int Assasssins_Creed_Origins = 11;
    int Minecraft = 12;
    int A_Way_Out = 13;



    public boolean consultar(String titulo) {
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] != null && juego[i].equals(titulo)){
                System.out.println("Este es el juego ");


                return true;
            }
        }
        return false;

    }

    public boolean Crearjuego(String nombre){
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] == null){
                juego[i] = new Videojuego();
                juego[i].nombre = nombre;
                return true;
            }
        }
        return false;
    }

}

