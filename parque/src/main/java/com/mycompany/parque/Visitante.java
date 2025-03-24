package com.mycompany.parque;

public class Visitante {
    private final String nombre;
    private final int idVisitante;
    private int edad;

    public Visitante(String nombre, int idVisitante, int edad) {
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        setEdad(edad);
    }

    public void comprarEntrada() {
        System.out.println(nombre + " ha comprado una entrada.");
    }

    public void usarAtraccion(Atraccion atraccion) {
        if (atraccion.getEstado().equals("Operativa")) {
            System.out.println(nombre + " está disfrutando de " + atraccion.getNombre() + ".");
        } else {
            System.out.println("⚠️ " + atraccion.getNombre() + " no está operativa. No puede ser usada.");
        }
    }

    private void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public int getEdad() {
        return edad;
    }
}
