package app;

import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Clase principal del sistema.
 * Permite probar el modelo de clases de Llanquihue Tour.
 */
public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Vicente Perez Rosales",
                "120",
                "Llanquihue",
                "Region de Los Lagos"
        );

        Direccion direccion2 = new Direccion(
                "Costanera",
                "455",
                "Puerto Varas",
                "Region de Los Lagos"
        );

        Direccion direccion3 = new Direccion(
                "Angelmo",
                "89",
                "Puerto Montt",
                "Region de Los Lagos"
        );

        Persona persona = new Persona(
                "Maria Soto",
                "12.345.678-9",
                "+56 9 1234 5678",
                "maria.soto@gmail.com",
                direccion1
        );

        Empleado empleado = new Empleado(
                "Carlos Muñoz",
                "15.456.789-0",
                "+56 9 9876 5432",
                "carlos.munoz@llanquihuetour.cl",
                direccion2,
                "Guia turistico"
        );

        Cliente cliente = new Cliente(
                "Ana Torres",
                "18.234.567-1",
                "+56 9 4567 8910",
                "ana.torres@gmail.com",
                direccion3,
                "Cliente frecuente",
                4
        );

        System.out.println("=== PERSONA GENERAL ===");
        System.out.println(persona);

        System.out.println("\n=== EMPLEADO ===");
        System.out.println(empleado);

        System.out.println("\n=== CLIENTE ===");
        System.out.println(cliente);
    }
}