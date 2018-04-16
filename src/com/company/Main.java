package com.company;

import com.company.View.PantallaListarJuego;
import com.company.View.PantallaMenuAcceso;
import com.company.manager.ManagerJuego;
import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

public class Main {

    public static void main(String[] args) {
        ManagerJuego managerJuego = new ManagerJuego();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.mostrar(managerJuego,managerUsuarios);

    }
}
