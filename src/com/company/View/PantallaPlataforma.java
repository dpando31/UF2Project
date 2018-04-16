package com.company.View;

import com.company.manager.ManagerJuego;

import java.util.Scanner;

public class PantallaPlataforma {

    public static void mostrar(ManagerJuego managerJuego) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que plataforma estas buscando?");
        System.out.println("1.PC");
        System.out.println("2.Playstation");
        System.out.println("3.Microsoft");
        System.out.println("4.Nintendo");
        System.out.println("Elige una consola");
        String plataforma = scanner.nextLine();

        if ("1".equals(plataforma)){
            System.out.println("Has elegido PC");
        }
        if ("2".equals(plataforma)){
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
        if ("3".equals(plataforma)){
            System.out.println("Has elegido Microsoft");
            System.out.println("En que consola estas buscando:");
            System.out.println("1.Xbox");
            System.out.println("2.Xbox 360");
            System.out.println("3.Xbox ONE");
        }
        if ("4".equals(plataforma)){
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