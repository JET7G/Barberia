package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String servicio;
        String descripcion;
        String cantidad;
        String costo;

        System.out.println("************");
        System.out.println("* BARBERIA *");
        System.out.println("************");
        System.out.println("");
        System.out.println("Indique el nombre del servicio: ");
        servicio = scanner.nextLine();
        System.out.println("Agregue una descripcion del servicio: ");
        descripcion = scanner.nextLine();
        System.out.println("Cuantos requiere(numero): ");
        cantidad = scanner.nextLine();

        int cantidadInt =Integer.parseInt(cantidad);
        Servicios nuevoServicio = new Servicios(servicio, descripcion, cantidadInt);
        nuevoServicio.imprimeServicio();

        System.out.println("");
        System.out.println("Cual es el precio unitario(numero): ");
        costo = scanner.nextLine();
        int costoInt =Integer.parseInt(costo);
        nuevoServicio.montoTotal(costoInt);
    }
}
