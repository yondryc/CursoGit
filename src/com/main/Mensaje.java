package com.main;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();

    }

    public void saludar(Persona p) {

        System.out.printf("Hola %s, bienvenido a Java \n", p);

    }
}
