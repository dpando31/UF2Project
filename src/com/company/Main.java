package com.company;

import com.company.View.PantallaListarJuego;
import com.company.View.PantallaMenuAcceso;
import com.company.View.PantallaPrincipal;
import com.company.manager.ManagerJuego;
import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

public class Main {

    public static void main(String[] args) {
        ManagerJuego managerJuego = new ManagerJuego();
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        PantallaPrincipal pantallaPrincipal =new PantallaPrincipal();

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.mostrar(managerJuego,managerUsuarios,pantallaPrincipal);

    }
}
