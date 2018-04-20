package com.company.manager;


import com.company.model.Videojuego;

public class ManagerJuego {
    Videojuego videojuego;
    Videojuego[] juego = new Videojuego[50];

    int FIFA = 0;
    int PUBG = 1;
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
    int Batman_The_Enemy_Within = 14;
    int DKC_Tropical_Freeze = 15;
    int Hellblade_Senua_Sacrifice = 16;
    int Infernium = 17;
    int Sea_of_Thieves = 18;
    int Los_Pilares_de_la_Tierra = 19;
    int God_of_War = 20;
    int Monster_Hunter_World = 21;






    public boolean consultar(String titulo) {
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] != null && juego[i].equals(titulo)){
                System.out.println("Este es el juego"
                );


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

