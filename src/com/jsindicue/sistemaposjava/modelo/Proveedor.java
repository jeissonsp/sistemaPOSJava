package com.jsindicue.sistemaposjava.modelo;

public class Proveedor extends Persona{

    private int idProveedor;
    private int nit;
    private String empresa;

    private static int ultimoid;

    public Proveedor(){
        this.idProveedor = ++ultimoid;
    }
    public Proveedor(String nombreCompleto, String empresa, int nit){
        super(nombreCompleto);
        this.idProveedor = ++ultimoid;
        this.empresa = empresa;
        this.nit = nit;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nit=" + nit +
                ", empresa='" + empresa + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
