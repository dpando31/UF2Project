package com.company.manager;

import com.company.model.Usuario;

public class Managerusuarios {
    Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String nombre, String contraseña) {

        Usuario usuario = new Usuario();
        usuario.usuario = nombre;
        usuario.contraseña = contraseña;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                break;
            }
        }
    }


    public String verificar(String nombre, String contraseña) {
        for (int i = 0; i < usuarios.length; i++) {
            if (nombre.equals(usuarios[i].usuario) && contraseña.equals(usuarios[i].contraseña)) {
                return "verdadero";
            }
        }
        return "no";
    }

}