package com.company.View;

import java.util.Scanner;

public class PantallaPlataforma {

    int   plataforma;
    private Scanner scanner;
    void  buscar (){

        System.out.println("Que plataforma estas buscando?");
        System.out.println("1.PC");
        System.out.println("2.Playstation");
        System.out.println("3.Microsoft");
        System.out.println("4.Nintendo");
        System.out.println("Elige una consola");
        plataforma =scanner.nextInt();
    }

    void igual(){
        if (plataforma == 1){
            System.out.println("Has elegido PC");
        }
        if (plataforma == 2){
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
        if (plataforma == 3){
            System.out.println("Has elegido Microsoft");
            System.out.println("En que consola estas buscando:");
            System.out.println("1.Xbox");
            System.out.println("2.Xbox 360");
            System.out.println("3.Xbox ONE");
        }
        if (plataforma == 4){
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