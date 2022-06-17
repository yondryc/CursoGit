package com.main;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        // Yondry comente la linea de codigo que considero se puede eliminar
        // System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
