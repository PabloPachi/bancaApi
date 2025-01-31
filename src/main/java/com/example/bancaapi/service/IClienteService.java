package com.example.bancaapi.service;

import com.example.bancaapi.model.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> getAllClientes();

    public Cliente getClienteById(Long id);

    public Cliente createCliente(Cliente cliente);

    public Cliente updateCliente(Long id, Cliente clienteDetails);

    public void deleteCliente(Long id) ;
}
