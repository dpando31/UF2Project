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
                System.out.println(juego[i].PEGI);
                System.out.println(juego[i].precio);
                System.out.println(juego[i].valoracion);

                return true;
            }
        }
        return false;
    }

    public boolean crearJuego(String nombre,String fechaLanzamiento,String genero,String plataforma,String desarrollador,String editor,String motorGrafico,String pegi,String precio,String valoracion){
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
                juego[i].PEGI = pegi;
                juego[i].precio = precio;
                juego[i].valoracion = valoracion;

                return true;
            }
        }
        return false;
    }

    public void crearJuegosIniciales(){
        crearJuego("FIFA","29-09-2017","Deportes"," PS3, PS4, PC, XBOX, Nintendo Swich","EA Sports","Electronic Arts", "Frosbite","+7","60€","4" );
        crearJuego("CALL OF DUTY", "29-08-2018", "Shooter"," PS3, PS4, PC, XBOX, Nintendo Swich", "Activision","Activision","Frosbite","+16", "50€", "4");
        crearJuego("PUBG","23-03-2017","Battle Royale","Xbox , iOS, Android, PC","Brendan Greene","Bluehole Studio, PUBG Corporation","Unreal Engine 4","+16","30€","5");
        crearJuego("Dirt3","24-05-2011","Driver","PlayStation 3, Microsoft Windows, Xbox 360, Mac OS clàssic","Codemasters, Feral Interactive","Codemasters, Feral Interactive","EGO","+12","20€", "6");
        crearJuego("Dirt_Rally","27-04-2015","Driver","PlayStation 4, Xbox One, Microsoft Windows, Linux, Mac OS clàssic","Codemasters","Codemasters","EGO","+12","20€","6");
        crearJuego("CSGO","21-08-2012","Shooter","PC","Valve","Valve","Motor Source","+16","13€","6");
        crearJuego("GtaV","15-01-2013","Sandbox","PlayStation 4, PlayStation 3, Xbox One, Xbox 360, Microsoft Windows","Rockstar","Rockstar","Rockstar Advanced Game Engine","+18","60€","6");
        crearJuego("Far Cry 5","27-03-2018","FPS","PlayStation 4, Xbox One, Microsoft Windows","Ubisoft Reflections, Ubisoft Ukraine, Ubisoft Montreal, Ubisoft Toronto","Ubisoft","Motor Source","+18","60€","7");
        crearJuego("Fortnite","25-07-2017","Battle Royale","PlayStation 4, Xbox One, iOS, Microsoft Windows, Mac OS clàssic"," Epic Games"," Epic Games","Unreal Engine","+16","Free","5");
        crearJuego("Overwatch","24-05-2017","FPS","PlayStation 4, Xbox One, Microsoft Windows","Blizzard Entertainment","Blizzard Entertainment","Motor Source","+16","40€","7");
        crearJuego("Assasssins Creed Origins","27-10-2017","Aventura","PlayStation 4, Xbox One, Microsoft Windows","Ubisoft","Ubisoft","Motor Source","+16","60€","7");
        crearJuego("Minecraft","18-10-2011","Sandbox","Microsoft Windows, Xbox 360, Android, Linux, PlayStation 3, macOS, Xbox One, PlayStation 4, PS Vita, Windows Phone, iOS, Google Chrome OS, Ouya, Kindle Fire HD, Màquina Virtual Java, Wii U, Windows 10, Project Morpheus i Nintendo NX","Mojang","Microsoft","Java","+12","20€","8");
        crearJuego("A Way Out","23-03-2018","Aventura","PlayStation 4, Xbox One, Microsoft Windows","Hazelight Studios","Electronic Arts","Unreal Engine","+16","30€","8");

    }
}

