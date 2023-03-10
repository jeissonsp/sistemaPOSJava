package com.jsindicue.sistemaposjava.repositorio;

import com.jsindicue.sistemaposjava.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> mostrar();
    Cliente porID(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);

}
