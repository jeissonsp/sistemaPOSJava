package com.jsindicue.sistemaposjava.modelo;

public class Vendedor extends Persona{
    private int idVendedor;
    private int identificacion;


    private static int ultimoId;

    public Vendedor(){
        super();
        this.idVendedor= ++ultimoId;
    }

    public Vendedor(String nombreCompleto, int identificacion) {
        super(nombreCompleto);
        this.idVendedor = ++ultimoId;
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
