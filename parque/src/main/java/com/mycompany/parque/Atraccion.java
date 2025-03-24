package com.mycompany.parque;

public class Atraccion {
    private final String nombre;
    private final int capacidad;
    private String estado; // "Operativa", "En Mantenimiento", "Fuera de Servicio"

    public Atraccion(String nombre, int capacidad, String estado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        setEstado(estado);
    }

    public void iniciarAtraccion() {
        if (estado.equals("Operativa")) {
            System.out.println("🎢 " + nombre + " ha comenzado a funcionar.");
        } else {
            System.out.println("⚠️ " + nombre + " no puede iniciar porque está " + estado + ".");
        }
    }

    public void detenerAtraccion() {
        System.out.println("⛔ " + nombre + " ha sido detenida.");
    }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("Operativa") || nuevoEstado.equals("En Mantenimiento") || nuevoEstado.equals("Fuera de Servicio")) {
            this.estado = nuevoEstado;
            System.out.println("🔄 Estado de " + nombre + " cambiado a: " + estado);
        } else {
            System.out.println("❌ Estado inválido.");
        }
    }

    private void setEstado(String estado) {
        if (estado.equals("Operativa") || estado.equals("En Mantenimiento") || estado.equals("Fuera de Servicio")) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }
}
