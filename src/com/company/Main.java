package com.company;

import com.company.View.PantallaCrearJuego;
import com.company.View.PantallaListarJuego;
import com.company.View.PantallaMenuAcceso;
import com.company.manager.ManagerJuegos;
import com.company.manager.ManagerUsuarios;

public class Main {

    public static void main(String[] args) {
        ManagerJuegos managerJuegos = new ManagerJuegos();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.mostrar(managerJuegos,managerUsuarios);

    }
}
