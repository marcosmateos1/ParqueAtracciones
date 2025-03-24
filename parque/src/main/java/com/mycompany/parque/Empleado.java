package com.mycompany.parque;

public class Empleado {
    private final String nombre;
    private final int idEmpleado;
    private String puesto; // "Mantenimiento", "Vendedor", "Seguridad"

    public Empleado(String nombre, int idEmpleado, String puesto) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        setPuesto(puesto);
    }

    public void asignarTarea(String tarea) {
        System.out.println(nombre + " ha sido asignado a la tarea: " + tarea);
    }

    public void realizarTarea() {
        System.out.println(nombre + " está realizando su tarea como " + puesto);
    }

    private void setPuesto(String puesto) {
        if (puesto.equals("Mantenimiento") || puesto.equals("Vendedor") || puesto.equals("Seguridad")) {
            this.puesto = puesto;
        } else {
            throw new IllegalArgumentException("Puesto inválido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }
}
