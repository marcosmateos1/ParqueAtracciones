package com.mycompany.parque;

public class Vendedor extends Empleado {
    private int ventasRealizadas;

    public Vendedor(String nombre, int idEmpleado) {
        super(nombre, idEmpleado, "Vendedor");
        this.ventasRealizadas = 0;
    }

    public void venderEntrada() {
        ventasRealizadas++;
        System.out.println(getNombre() + " ha vendido una entrada. Total ventas: " + ventasRealizadas);
    }

    public void reportarVentas() {
        System.out.println(getNombre() + " ha realizado " + ventasRealizadas + " ventas en total.");
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
}
