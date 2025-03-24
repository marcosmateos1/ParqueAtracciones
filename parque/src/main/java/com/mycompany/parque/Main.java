package com.mycompany.parque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ParqueAtracciones parque = new ParqueAtracciones();
            int opcion;
            
            do {
                System.out.println("\n🎡 MENÚ DEL PARQUE 🎡");
                System.out.println("1. Agregar Empleado");
                System.out.println("2. Agregar Atracción");
                System.out.println("3. Agregar Visitante");
                System.out.println("4. Mostrar Información del Parque");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    
                    switch (opcion) {
                        case 1 -> {
                            System.out.print("Nombre del empleado: ");
                            String nombreEmpleado = scanner.nextLine();
                            System.out.print("ID del empleado: ");
                            int idEmpleado = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Puesto (Mantenimiento, Vendedor, Seguridad): ");
                            String puesto = scanner.nextLine();

                            if (puesto.equalsIgnoreCase("Mantenimiento")) {
                                System.out.print("Área Responsable (Mecánica, Eléctrica, Limpieza): ");
                                String area = scanner.nextLine();
                                parque.agregarEmpleado(new Mantenimiento(nombreEmpleado, idEmpleado, area));
                            } else if (puesto.equalsIgnoreCase("Vendedor")) {
                                parque.agregarEmpleado(new Vendedor(nombreEmpleado, idEmpleado));
                            } else {
                                parque.agregarEmpleado(new Empleado(nombreEmpleado, idEmpleado, puesto));
                            }
                        }

                            
                        case 2 -> {
                            System.out.print("Nombre de la atracción: ");
                            String nombreAtraccion = scanner.nextLine();
                            System.out.print("Capacidad máxima: ");
                            int capacidad = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Estado (Operativa, En Mantenimiento, Fuera de Servicio): ");
                            String estado = scanner.nextLine();
                            parque.agregarAtraccion(new Atraccion(nombreAtraccion, capacidad, estado));
                        }
                            
                        case 3 -> {
                            System.out.print("Nombre del visitante: ");
                            String nombreVisitante = scanner.nextLine();
                            System.out.print("ID del visitante: ");
                            int idVisitante = scanner.nextInt();
                            System.out.print("Edad del visitante: ");
                            int edad = scanner.nextInt();
                            scanner.nextLine();
                            parque.agregarVisitante(new Visitante(nombreVisitante, idVisitante, edad));
                        }
                            
                        case 4 -> parque.mostrarInformacionParque();
                            
                        case 5 -> System.out.println("👋 Saliendo del sistema...");
                            
                        default -> System.out.println("❌ Opción inválida. Intenta nuevamente.");
                    }
                    
                } catch (Exception e) {
                    System.out.println("❌ Error en la entrada de datos. Intenta de nuevo.");
                    scanner.nextLine(); // Limpiar buffer
                    opcion = 0;
                }
                
            } while (opcion != 5);
        }
    }
}
