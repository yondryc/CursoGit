package com.main;

public record Persona(String nombre, String apellido) {

    @Override
    public String toString() {
        return "%s %s".formatted(nombre, apellido);
    }
}
