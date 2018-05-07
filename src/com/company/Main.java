package com.company;

import com.company.View.PantallaListarJuego;
import com.company.View.PantallaMenuAcceso;
import com.company.View.PantallaPrincipal;
import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

public class Main {

    public static void main(String[] args) {
        ManagerJuego managerJuego = new ManagerJuego();
        managerJuego.crearJuegosIniciales();
        managerJuego.plataformalista();
        managerJuego.generolista();


        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        managerUsuarios.crearUsuario("a", "a");

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.mostrar(managerJuego,managerUsuarios);

    }

}
