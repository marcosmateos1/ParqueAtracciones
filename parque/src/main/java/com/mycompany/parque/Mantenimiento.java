package com.mycompany.parque;

public class Mantenimiento extends Empleado {
    private String areaResponsable;

    public Mantenimiento(String nombre, int idEmpleado, String areaResponsable) {
        super(nombre, idEmpleado, "Mantenimiento");
        setAreaResponsable(areaResponsable);
    }

    public void realizarMantenimiento() {
        System.out.println(getNombre() + " está realizando mantenimiento en el área de " + areaResponsable);
    }

    public void reportarProblema() {
        System.out.println(getNombre() + " ha reportado un problema en el área de " + areaResponsable);
    }

    private void setAreaResponsable(String areaResponsable) {
        if (areaResponsable.equals("Mecánica") || areaResponsable.equals("Eléctrica") || areaResponsable.equals("Limpieza")) {
            this.areaResponsable = areaResponsable;
        } else {
            throw new IllegalArgumentException("Área de responsabilidad inválida.");
        }
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }
}
