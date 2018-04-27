package com.company.manager;


import com.company.model.Favorito;
import com.company.model.Videojuego;

public class ManagerJuego {
    //    public Videojuego videojuego;
    public Videojuego[] videojuegos = new Videojuego[50];
    public Favorito[] favoritos = new Favorito[50];


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
        crearJuego("FIFA 2017", "29-09-2017", "Deportes", " PS3,PS4, PC , XBOX , Nintendo Swich", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€");
        crearJuego("CALL OF DUTY", "29-08-2018", "Shooter", " PS3, PS4, PC, XBOX, Nintendo Swich", "Activision", "Activision", "Frosbite", "+16", "50€");
        crearJuego("PUBG", "23-03-2017", "Battle Royale", "Xbox , iOS, Android, PC", "Brendan Greene", "Bluehole Studio, PUBG Corporation", "Unreal Engine 4", "+16", "30€");
        crearJuego("Dirt3", "24-05-2011", "Driver", "PlayStation 3, Microsoft Windows, Xbox 360, Mac OS clàssic", "Codemasters, Feral Interactive", "Codemasters, Feral Interactive", "EGO", "+12", "20€");
        crearJuego("FIFA 2018", "29-09-2018", "Deportes", " PS3, PS4, PC, XBOX, Nintendo Swich", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€");
        crearJuego("Dirt_Rally", "27-04-2015", "Driver", "PlayStation 4, Xbox One, Microsoft Windows, Linux, Mac OS clàssic", "Codemasters", "Codemasters", "EGO", "+12", "20€");
        crearJuego("CSGO", "21-08-2012", "Shooter", "PC", "Valve", "Valve", "Motor Source", "+16", "13€");
        crearJuego("GtaV", "15-01-2013", "Sandbox", "PlayStation 4, PlayStation 3, Xbox One, Xbox 360, Microsoft Windows", "Rockstar", "Rockstar", "Rockstar Advanced Game Engine", "+18", "60€");
        crearJuego("Far Cry 5", "27-03-2018", "FPS", "PlayStation 4, Xbox One, Microsoft Windows", "Ubisoft Reflections, Ubisoft Ukraine, Ubisoft Montreal, Ubisoft Toronto", "Ubisoft", "Motor Source", "+18", "60€");
        crearJuego("Fortnite", "25-07-2017", "Battle Royale", "PlayStation 4, Xbox One, iOS, Microsoft Windows, Mac OS clàssic", " Epic Games", " Epic Games", "Unreal Engine", "+16", "Free");
        crearJuego("Overwatch", "24-05-2017", "FPS", "PlayStation 4, Xbox One, Microsoft Windows", "Blizzard Entertainment", "Blizzard Entertainment", "Motor Source", "+16", "40€");
        crearJuego("Assasssins Creed Origins", "27-10-2017", "Aventura", "PlayStation 4, Xbox One, Microsoft Windows", "Ubisoft", "Ubisoft", "Motor Source", "+16", "60€");
        crearJuego("Minecraft", "18-10-2011", "Sandbox", "Microsoft Windows, Xbox 360, Android, Linux, PlayStation 3, macOS, Xbox One, PlayStation 4, PS Vita, Windows Phone, iOS, Google Chrome OS, Ouya, Kindle Fire HD, Màquina Virtual Java, Wii U, Windows 10, Project Morpheus i Nintendo NX", "Mojang", "Microsoft", "Java", "+12", "20€");
        crearJuego("A Way Out", "23-03-2018", "Aventura", "PlayStation 4, Xbox One, Microsoft Windows", "Hazelight Studios", "Electronic Arts", "Unreal Engine", "+16", "30€");
    }

    public boolean favoritos(String principal) {
        for (int i = 0; i < favoritos.length; i++) {
            if (videojuegos[i] != null && favoritos[i].nombre.equals(principal)) {
                System.out.println(favoritos[i].nombre);
            }
        }

        return false;
    }


    public Videojuego[] consultarTitulo(String titulo) {
        int cuenta = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].nombre.contains(titulo)) {
                cuenta++;
            }
        }

        Videojuego[] lista = new Videojuego[cuenta];
        int y = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].nombre.contains(titulo)) {
                lista[y] = videojuegos[i];
                y++;
            }
        }

        return lista;
    }



    public Videojuego[] consultarPlataforma(String plataforma) {
        int cuenta = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].plataforma.contains(plataforma)) {
                cuenta++;
            }
        }

        Videojuego[] listaplataforma = new Videojuego[cuenta];
        int y = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].plataforma.contains(plataforma)) {
                listaplataforma[y] = videojuegos[i];
                y++;
            }
        }

        return listaplataforma;
    }


    public boolean consultarGenero(String genero) {
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].genero.equals(genero)) {
                System.out.println(videojuegos[i].nombre);
            }
        }

        return false;
    }


}




