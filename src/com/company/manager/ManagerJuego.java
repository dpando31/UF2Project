package com.company.manager;


import com.company.model.Favorito;
import com.company.model.Videojuego;

public class ManagerJuego {
    //    public Videojuego videojuego;
    public Videojuego[] videojuegos = new Videojuego[50];
    public Favorito[] favoritos =new Favorito[50];


    public Videojuego[] consultarTitulo(String titulo) {
        int cuenta = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i] != null && videojuegos[i].nombre.contains(titulo)){
                cuenta++;
            }
        }

        Videojuego[] lista = new Videojuego[cuenta];
        int y =0;
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i] != null && videojuegos[i].nombre.contains(titulo)){
                lista[y] = videojuegos[i];
                y++;
            }
        }

        return lista;
    }


    public boolean consultarGenero(String genero) {
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].genero.contains(genero)) {
                System.out.println(videojuegos[i].nombre);
            }
        }

        return false;
    }

    public boolean favoritos(String principal) {
        for (int i = 0; i < favoritos.length; i++) {
            if (videojuegos[i] != null && favoritos[i].nombre.contains(principal)) {
                System.out.println(favoritos[i].nombre);
            }
        }

        return false;
    }


    public boolean consultarPlataforma(String plataforma) {
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].plataforma.contains(plataforma)) {
                System.out.println(videojuegos[i].nombre);
            }
        }

        return false;
    }


    public boolean consultarPlataformaTitulo(String plataformatitulo) {
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].nombre.contains(plataformatitulo)) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("                  FICHA DEl Juego                                      ");
                System.out.println("Nombre:               | \t" + videojuegos[i].nombre);
                System.out.println("Plataforma:           | \t" + videojuegos[i].plataforma);
                System.out.println("Desarrollador:        | \t" + videojuegos[i].desarrollador);
                System.out.println("Editor:               | \t" + videojuegos[i].editor);
                System.out.println("Fecha de lanzamiento: | \t" + videojuegos[i].fechaLanzamiento);
                System.out.println("Genero:               | \t" + videojuegos[i].genero);
                System.out.println("Motor Grafico:        | \t" + videojuegos[i].motorGrafico);
                System.out.println("Edad:                 | \t" + videojuegos[i].PEGI);
                System.out.println("Precio:               | \t" + videojuegos[i].precio);
                System.out.println("-----------------------------------------------------------------------");

                return true;
            }
        }
        return false;
    }

    public boolean crearJuego(String nombre, String fechaLanzamiento, String genero, String plataforma, String desarrollador, String editor, String motorGrafico, String pegi, String precio) {
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] == null) {
                videojuegos[i] = new Videojuego();
                videojuegos[i].nombre = nombre;
                videojuegos[i].fechaLanzamiento = fechaLanzamiento;
                videojuegos[i].genero = genero;
                videojuegos[i].plataforma = plataforma;
                videojuegos[i].desarrollador = desarrollador;
                videojuegos[i].editor = editor;
                videojuegos[i].motorGrafico = motorGrafico;
                videojuegos[i].PEGI = pegi;
                videojuegos[i].precio = precio;

                return true;
            }
        }
        return false;
    }

    public void crearJuegosIniciales() {
        crearJuego("FIFA 2017", "29-09-2017", "Deportes", "PS3, PS4, PC, Xbox 360, Xbox One, Nintendo Switch", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€");
        crearJuego("Call of duty Infinite Warfare", "04-11-2016", "Shooter", "PS3, PS4, PC, Xbox 360, Xbox One, Nintendo Switch", "Activision", "Activision", "Frosbite", "+16", "50€");
        crearJuego("PUBG", "23-03-2017", "Battle Royale", "Xbox , iOS, Android, PC", "Brendan Greene", "Bluehole Studio, PUBG Corporation", "Unreal Engine 4", "+16", "30€");
        crearJuego("Dirt3", "24-05-2011", "Driver", "PS3, Microsoft Windows, Xbox 360, Mac OS clàssic", "Codemasters, Feral Interactive", "Codemasters, Feral Interactive", "EGO", "+12", "20€");
        crearJuego("FIFA 2018", "29-09-2018", "Deportes", "PS3, PS4, PC, XBOX, Nintendo Switch", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€");
        crearJuego("Call of duty WWII", "03-11-2017", "Shooter", "PS3, PS4, PC, XBOX, Nintendo Switch", "Activision", "Activision", "Frosbite", "+16", "50€");
        crearJuego("PUBG", "23-03-2017", "Battle Royale", "Xbox , iOS, Android, PC", "Brendan Greene", "Bluehole Studio, PUBG Corporation", "Unreal Engine 4", "+16", "30€");
        crearJuego("Dirt3", "24-05-2011", "Driver", "PS3, Microsoft Windows, Xbox 360, Mac OS clàssic", "Codemasters, Feral Interactive", "Codemasters, Feral Interactive", "EGO", "+12", "20€");
        crearJuego("Dirt_Rally", "27-04-2015", "Driver", "PS4, Xbox One, Microsoft Windows, Linux, Mac OS clàssic", "Codemasters", "Codemasters", "EGO", "+12", "20€");
        crearJuego("CSGO", "21-08-2012", "Shooter", "PC", "Valve", "Valve", "Motor Source", "+16", "13€");
        crearJuego("GtaV", "15-01-2013", "Sandbox", "PS4, PlayStation 3, Xbox One, Xbox 360, Microsoft Windows", "Rockstar", "Rockstar", "Rockstar Advanced Game Engine", "+18", "60€");
        crearJuego("Far Cry 5", "27-03-2018", "FPS", "PS4, Xbox One, Microsoft Windows", "Ubisoft Reflections, Ubisoft Ukraine, Ubisoft Montreal, Ubisoft Toronto", "Ubisoft", "Motor Source", "+18", "60€");
        crearJuego("Fortnite", "25-07-2017", "Battle Royale", "PlayStation 4, Xbox One, iOS, Microsoft Windows, Mac OS clàssic", " Epic Games", " Epic Games", "Unreal Engine", "+16", "Free");
        crearJuego("Overwatch", "24-05-2017", "FPS", "PS4, Xbox One, Microsoft Windows", "Blizzard Entertainment", "Blizzard Entertainment", "Motor Source", "+16", "40€");
        crearJuego("Assasssins Creed Origins", "27-10-2017", "Aventura", "PS4, Xbox One, Microsoft Windows", "Ubisoft", "Ubisoft", "Motor Source", "+16", "60€");
        crearJuego("Minecraft", "18-10-2011", "Sandbox", "Microsoft Windows, Xbox 360, Android, Linux, PS3, macOS, Xbox One, PS4, PS Vita, Windows Phone, iOS, Google Chrome OS, Ouya, Kindle Fire HD, Màquina Virtual Java, Wii U, Nintendo Switch, Windows 10, Project Morpheus", "Mojang", "Microsoft", "Java", "+12", "20€");
        crearJuego("A Way Out", "23-03-2018", "Aventura", "PS4, Xbox One, Microsoft Windows", "Hazelight Studios", "Electronic Arts", "Unreal Engine", "+16", "30€");
    }
}


