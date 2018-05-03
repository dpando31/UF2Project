package com.company.manager;


import com.company.model.Favorito;
import com.company.model.Videojuego;

public class ManagerJuego {
    //    public Videojuego videojuego;
    public Videojuego[] videojuegos = new Videojuego[50];
    public Favorito[] favoritos = new Favorito[50];


    public boolean crearJuego(String nombre, String fechaLanzamiento, String genero, String plataforma, String desarrollador, String editor, String motorGrafico, String pegi, String precio,String valoracion) {
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
                videojuegos[i].valoracion =valoracion;

                return true;
            }
        }
        return false;
    }

    public void crearJuegosIniciales() {
        crearJuego("FIFA 2017", "29-09-2017", "Deportes", " PlayStation 3,PlayStation 4, PC  , Nintendo Switch", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€","8");
        crearJuego("CALL OF DUTY", "29-08-2018", "Shooter", " PlayStation 3, PlayStation 4, PC, Nintendo Switch", "Activision", "Activision", "Frosbite", "+16", "50€","8");
        crearJuego("PUBG", "23-03-2017", "Battle Royale", "PC", "Brendan Greene", "Bluehole Studio, PUBG Corporation", "Unreal Engine 4", "+16", "30€","8");
        crearJuego("Dirt3", "24-05-2011", "Driver", "PlayStation 3, Xbox 360", "Codemasters, Feral Interactive", "Codemasters, Feral Interactive", "EGO", "+12", "20€","8");
        crearJuego("FIFA 2018", "29-09-2018", "Deportes", " PlayStation 3, PlayStation 4, PC,Nintendo Switch", "EA Sports", "Electronic Arts", "Frosbite", "+7", "60€","8");
        crearJuego("Dirt_Rally", "27-04-2015", "Driver", "PlayStation 4, Xbox One", "Codemasters", "Codemasters", "EGO", "+12", "20€","8");
        crearJuego("CSGO", "21-08-2012", "Shooter", "PC", "Valve", "Valve", "Motor Source", "+16", "13€","8");
        crearJuego("GtaV", "15-01-2013", "Sandbox", "PlayStation 4, PlayStation 3, Xbox One, Xbox 360", "Rockstar", "Rockstar", "Rockstar Advanced Game Engine", "+18", "60€","8");
        crearJuego("Far Cry 5", "27-03-2018", "FPS", "PlayStation 4, Xbox One", "Ubisoft Reflections, Ubisoft Ukraine, Ubisoft Montreal, Ubisoft Toronto", "Ubisoft", "Motor Source", "+18", "60€","8");
        crearJuego("Fortnite", "25-07-2017", "Battle Royale", "PlayStation 4, Xbox One", " Epic Games", " Epic Games", "Unreal Engine", "+16", "Free","8");
        crearJuego("Overwatch", "24-05-2017", "FPS", "PlayStation 4, Xbox One", "Blizzard Entertainment", "Blizzard Entertainment", "Motor Source", "+16", "40€","8");
        crearJuego("Assasssins Creed Origins", "27-10-2017", "Aventura", "PlayStation 4, Xbox One", "Ubisoft", "Ubisoft", "Motor Source", "+16", "60€","8");
        crearJuego("Minecraft", "18-10-2011", "Sandbox", "Xbox 360, PlayStation 3, Xbox One, PlayStation 4, PS Vita, Wii U", "Mojang", "Microsoft", "Java", "+12", "20€","8");
        crearJuego("A Way Out", "23-03-2018", "Aventura", "PlayStation 4, Xbox One", "Hazelight Studios", "Electronic Arts", "Unreal Engine", "+16", "30€","8");
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


    public Videojuego[] consultarGenero(String genero) {
        int cuenta = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].genero.contains(genero)) {
                cuenta++;
            }
        }

        Videojuego[] listagenero = new Videojuego[cuenta];
        int y = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] != null && videojuegos[i].genero.equals(genero)) {
                listagenero[y] = videojuegos[i];
                y++;
            }
        }

        return listagenero;
    }




    public boolean favoritos(String titulo) {
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] == null) {
                favoritos[i] = new Favorito();
                favoritos[i].nombre = titulo;
                return true;

            }

        }
        return false;
    }
}




