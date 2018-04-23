package com.company.manager;


import com.company.model.Videojuego;

public class ManagerJuego {
//    public Videojuego videojuego;
    public Videojuego[] juego = new Videojuego[50];




    public boolean consultar(String titulo) {
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] != null && juego[i].nombre.equals(titulo)){
                System.out.println(juego[i].nombre);
                System.out.println(juego[i].fechaLanzamiento);
                System.out.println(juego[i].genero);
                System.out.println(juego[i].plataforma);
                System.out.println(juego[i].desarrollador);
                System.out.println(juego[i].editor);
                System.out.println(juego[i].motorGrafico);
                System.out.println(juego[i].pegi);
                System.out.println(juego[i].precio);

                return true;
            }
        }
        return false;
    }

    public boolean crearJuego(String nombre,String fechaLanzamiento,String genero,String plataforma,String desarrollador,String editor,String motorGrafico,String pegi,String precio){
        for (int i = 0; i < juego.length; i++) {
            if(juego[i] == null){
                juego[i] = new Videojuego();
                juego[i].nombre = nombre;
                juego[i].fechaLanzamiento = fechaLanzamiento;
                juego[i].genero = genero;
                juego[i].plataforma = plataforma;
                juego[i].desarrollador = desarrollador;
                juego[i].editor = editor;
                juego[i].motorGrafico = motorGrafico;
                juego[i].pegi = pegi;
                juego[i].precio = precio;
                return true;
            }
        }
        return false;
    }

    public void crearJuegosIniciales(){
        crearJuego("FIFA","29-09-2017","Deportes"," PS3, PS4, PC, XBOX, Nintendo Swich","EA Sports","Electronic Arts", "Frosbite","+7","60€" );
        crearJuego("CALL OF DUTY", "29-08-2018", "Shooter"," PS3, PS4, PC, XBOX, Nintendo Swich", "Activision","Activision","Frosbite","+16", "50€");
        crearJuego("PUBG","23-03-2017","Battle Royale","Xbox , iOS, Android, PC","Brendan Greene","Bluehole Studio, PUBG Corporation","Unreal Engine 4","+16","30€");
        crearJuego("Dirt3","24-05-2011","Driver","PlayStation 3, Microsoft Windows, Xbox 360, Mac OS clàssic","Codemasters, Feral Interactive","Codemasters, Feral Interactive","EGO","+12","20€");
        crearJuego("Dirt_Rally","","","","","","","","");
        crearJuego("CSGO","","","","","","","","");
        crearJuego("GtaV","","","","","","","","");
        crearJuego("Far Cry 5","","","","","","","","");
        crearJuego("Fortnite","","","","","","","","");
        crearJuego("Overwatch","","","","","","","","");
        crearJuego("Assasssins Creed Origins","","","","","","","","");
        crearJuego("Minecraft","","","","","","","","");
        crearJuego("A Way Out","","","","","","","","");

    }
}

