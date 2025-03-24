package com.mycompany.parque;

import java.util.ArrayList;

public class ParqueAtracciones {
    private final ArrayList<Empleado> listaEmpleados;
    private final ArrayList<Atraccion> listaAtracciones;
    private final ArrayList<Visitante> listaVisitantes;

    public ParqueAtracciones() {
        this.listaEmpleados = new ArrayList<>();
        this.listaAtracciones = new ArrayList<>();
        this.listaVisitantes = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("👷‍♂️ Empleado agregado: " + empleado.getNombre());
    }

    public void agregarAtraccion(Atraccion atraccion) {
        listaAtracciones.add(atraccion);
        System.out.println("🎢 Atracción agregada: " + atraccion.getNombre());
    }

    public void agregarVisitante(Visitante visitante) {
        listaVisitantes.add(visitante);
        System.out.println("🎟️ Visitante agregado: " + visitante.getNombre());
    }

    public void mostrarInformacionParque() {
        System.out.println("\n📋 INFORMACIÓN DEL PARQUE:");
        
        System.out.println("\n👷 EMPLEADOS:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println("- " + empleado.getNombre() + " (" + empleado.getPuesto() + ")");
        }

        System.out.println("\n🎢 ATRACCIONES:");
        for (Atraccion atraccion : listaAtracciones) {
            System.out.println("- " + atraccion.getNombre() + " (Estado: " + atraccion.getEstado() + ")");
        }

        System.out.println("\n🎟️ VISITANTES:");
        for (Visitante visitante : listaVisitantes) {
            System.out.println("- " + visitante.getNombre() + " (Edad: " + visitante.getEdad() + ")");
        }
    }

    void agregarEmpleado(Mantenimiento mantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
