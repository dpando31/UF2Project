package com.company.manager;


import com.company.model.Videojuego;

public class ManagerJuego {
//    public Videojuego videojuego;
    public Videojuego[] juego = new Videojuego[50];

//     PUBG = 1;
//     Call_of_Duty = 2;
//     Assetto_Corsa= 3;
//     Dirt3 = 4;
//     Dirt_Rally = 5;
//     CSGO = 6;
//     GtaV = 7;
//     Far_Cry_5= 8;
//     Fortnite = 9;
//     Overwatch = 10;
//     Assasssins_Creed_Origins = 11;
//     Minecraft = 12;
//     A_Way_Out = 13;



    public boolean consultar(String titulo) {
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] != null && juego[i].equals(titulo)){


                return true;
            }
        }
        return false;
    }

    public boolean crearJuego(String nombre){
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] == null){
                juego[i] = new Videojuego();
                juego[i].nombre = nombre;
                return true;
            }
        }
        return false;
    }

    public void crearJuegosIniciales(){
        crearJuego("FIFA");
        crearJuego("CALL OF DUTY");
        crearJuego("PUBG");
        crearJuego("Dirt3");
        crearJuego("Dirt_Rally");
        crearJuego("CSGO");
        crearJuego("GtaV");
        crearJuego("Far Cry 5");
        crearJuego("Fortnite");
        crearJuego("Overwatch");
        crearJuego("Assasssins Creed Origins");
        crearJuego("Minecraft");
        crearJuego("A Way Out");











    }
}

