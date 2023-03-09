package com.jsindicue.sistemaposjava.modelo;

public class Persona {
    protected String nombreCompleto;

    public Persona(){

    }

    public Persona(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
