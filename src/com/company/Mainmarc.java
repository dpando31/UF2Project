package com.company;

import com.company.manager.Managerusuarios;
import com.company.View.Pantalla;

public class Mainmarc {

    public static void main(String[] args) {
        Managerusuarios managerusuarios = new Managerusuarios();
        managerusuarios.crearUsuario(managerusuarios);
        Pantalla pantalla =new Pantalla();
        pantalla.iniciar(managerusuarios);


    }
}
