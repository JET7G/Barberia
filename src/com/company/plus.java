package com.company;

public class plus implements Calculos{
    private String nombre;

    public plus(String name){
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void montoTotal(int x) {
    }
}
