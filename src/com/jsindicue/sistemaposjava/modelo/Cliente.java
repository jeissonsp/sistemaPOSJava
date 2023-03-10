package com.jsindicue.sistemaposjava.modelo;

import java.util.Objects;

public class Cliente extends Persona{
    private Integer id;
    private String direccion;
    private String telefono;

    private static int ultimoId;



    public Cliente(){
        super();
        this.id = ++ultimoId;
    }

    public Cliente(String nombreCompleto, String direccion, String telefono) {
        super(nombreCompleto);
        this.id = ++ultimoId;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente: " +
                " id: " + id +
                ", direccion: " + direccion +
                ", telefono: " + telefono +
                ", nombreCompleto: " + nombreCompleto;
    }
}
