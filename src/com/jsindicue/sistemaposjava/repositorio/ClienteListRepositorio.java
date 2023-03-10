package com.jsindicue.sistemaposjava.repositorio;

import com.jsindicue.sistemaposjava.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {

    //Contenedor de los datos donde se va almacenar, se va hacer las operaciones, "COPIA DE LOS DATOS ORIGINALES"
    private List<Cliente> dataSource;

    //Inicializa el dataSource
    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> mostrar() {
        return dataSource;
    }

    @Override
    public Cliente porID(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSource) {
            if (cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porID(cliente.getId());
        c.setNombreCompleto(cliente.getNombreCompleto());
        c.setDireccion(cliente.getDireccion());
        c.setTelefono(cliente.getTelefono());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porID(id);
        this.dataSource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        //NO AFECTAR A LA LISTA ORIGINAL CUANDO SE VUELVE A MOSTRAR
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                    int resultado=0;
                    if(dir == Direccion.ASC){
                        resultado = ordenar(campo,a,b);
                    } else if (dir == Direccion.DESC) {
                        resultado = ordenar(campo, b,a);
                    }
                    return resultado;
                }


        );

        return listaOrdenada;

        //OPCION 1
        /*listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombreCompleto" -> resultado = a.getNombreCompleto().compareTo(b.getNombreCompleto());
                    case "direccion" -> resultado = a.getDireccion().compareTo(b.getDireccion());
                    case "telefono" -> resultado = a.getTelefono().compareTo(b.getTelefono());
                }

            } else if (dir == Direccion.DESC) {
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombreCompleto" -> resultado = b.getNombreCompleto().compareTo(a.getNombreCompleto());
                    case "direccion" -> resultado = b.getDireccion().compareTo(a.getDireccion());
                    case "telefono" -> resultado = b.getTelefono().compareTo(a.getTelefono());
                }
            }
            return  resultado;
        });*/

        /*
        SEGUNDA OPCION CON CLASE ANONIMA, PERMITE TENER UNA FUNCION DENTRO DE COMPARETO
        listaOrdenada.sort(new Comparator<Cliente>() {

            @Override
            public int compare(Cliente a, Cliente b) {
            int resultado=0;
                if(dir == Direccion.ASC){
                    resultado = this.ordenar(a,b);
                } else if (dir == Direccion.DESC) {
                    resultado = this.ordenar(b,a);
                }
                return resultado;
            }
            private int ordenar(Cliente a,Cliente b){
                switch (campo) {
                    case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                    case "nombreCompleto" ->
                            resultado = b.getNombreCompleto().compareTo(a.getNombreCompleto());
                    case "direccion" ->
                            resultado = b.getDireccion().compareTo(a.getDireccion());
                    case "telefono" ->
                            resultado = b.getTelefono().compareTo(a.getTelefono());
                }
                return  resultado;
            }

        });
*/
            }


    @Override
    public List<Cliente> listar(int desde, int hasta) {

        return  dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Cliente a,Cliente b){
        int resultado=0;
        switch (campo) {
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombreCompleto" ->
                    resultado = b.getNombreCompleto().compareTo(a.getNombreCompleto());
            case "direccion" ->
                    resultado = b.getDireccion().compareTo(a.getDireccion());
            case "telefono" ->
                    resultado = b.getTelefono().compareTo(a.getTelefono());
        }
        return  resultado;
    }

}
