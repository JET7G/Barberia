package com.company;
import java.util.Scanner;

public class Servicios implements Calculos {
    private String servicio;
    private String descripcion;
    private  int cantidad;
    private int costo;
    private int numeroServicio=0;

    public Servicios(String servicio, String descripcion, int cantidad){
        this.numeroServicio++;
        this.servicio = servicio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public  void imprimeServicio(){
        System.out.println("\nUsted a agregado el servicio: "+this.servicio+"\nQue consta en: "+this.descripcion+"\nCantidad: "+this.cantidad);
    }

    @Override
    public void montoTotal(int x) {
        int costoTotal = x * cantidad;
        System.out.println("El monto final que debera pagar por el servio "+numeroServicio+" sera: $"+costoTotal);
        
    }
}
