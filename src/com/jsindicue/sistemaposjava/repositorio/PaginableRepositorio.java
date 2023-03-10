package com.jsindicue.sistemaposjava.repositorio;

import com.jsindicue.sistemaposjava.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
