package com.company.View;

import com.company.manager.ManagerJuego;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaPlataforma {

    public void mostrar(ManagerJuego managerJuego, ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que plataforma estas buscando?");
        System.out.println("1.PC");
        System.out.println("2.Playstation");
        System.out.println("3.Microsoft");
        System.out.println("4.Nintendo");
        System.out.println("Elige una consola");
        String plataforma = scanner.nextLine();

        if ("PC".equals(plataforma)){
            System.out.println("Has elegido PC");
            managerJuego.consultarPlataforma(plataforma);

        }
        if ("Playstation".equals(plataforma)){
            System.out.println("Has elegido Playstation");
            System.out.println("En que consola estas buscando:");
            System.out.println("1.PS1");
            System.out.println("2.PS2");
            System.out.println("3.PS3");
            System.out.println("4.PS4");
            System.out.println("5.PSP");
            System.out.println("6.PSVITA");
            int ps=scanner.nextInt();
        }
        if ("Microsoft".equals(plataforma)){
            System.out.println("Has elegido Microsoft");
            System.out.println("En que consola estas buscando:");
            System.out.println("1.Xbox");
            System.out.println("2.Xbox 360");
            System.out.println("3.Xbox ONE");
        }
        if ("Nintendo".equals(plataforma)){
            System.out.println("Has elegido Nintendo");
            System.out.println("En que consola estas buscando:");
            System.out.println("1.Wii");
            System.out.println("2.WiiU");
            System.out.println("3.Nintendo Switch");
            System.out.println("4.NDS");
            System.out.println("5.3DS");
            int n=scanner.nextInt();
        }
    }


}