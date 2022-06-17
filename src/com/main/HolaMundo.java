package com.main;

public class HolaMundo {

    public static void main(String[] args) {

        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre: ");
        String apellido = msj.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellido);
        msj.saludar(p1);
    }

}
