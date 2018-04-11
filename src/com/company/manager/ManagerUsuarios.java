package com.company.manager;

import com.company.model.Usuario;

public class ManagerUsuarios {
    Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String usuario, String password){

        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] == null){
                usuarios[i] = new Usuario();
                usuarios[i].username = usuario;
                usuarios[i].password = password;
                break;
            }
        }
    }

    public boolean comprobarUsuario(String usuario, String password){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && usuarios[i].username.equals(usuario) && usuarios[i].password.equals(password)){
               return true;
            }
        }
        return false;
    }
}
