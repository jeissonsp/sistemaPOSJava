package com.jsindicue.sistemaposjava.modelo;

public class Cliente extends Persona{
    private int idCliente;
    private String direccion;
    private String telefono;

    private static int ultimoId;



    public Cliente(){
        super();
        this.idCliente = ++ultimoId;
    }

    public Cliente(String nombreCompleto, String direccion, String telefono) {
        super(nombreCompleto);
        this.idCliente = ++ultimoId;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
