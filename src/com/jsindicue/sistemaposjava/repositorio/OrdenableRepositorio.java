package com.jsindicue.sistemaposjava.repositorio;

import com.jsindicue.sistemaposjava.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);




}
