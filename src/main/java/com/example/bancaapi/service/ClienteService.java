package com.example.bancaapi.service;

import com.example.bancaapi.model.Cliente;
import com.example.bancaapi.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;
    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    @Override
    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    @Override
    public Cliente updateCliente(Long id, Cliente clienteDetails) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setNombreCompleto(clienteDetails.getNombreCompleto());
            cliente.setTipoDocumento(clienteDetails.getTipoDocumento());
            cliente.setNumeroDocumento(clienteDetails.getNumeroDocumento());
            cliente.setFechaNacimiento(clienteDetails.getFechaNacimiento());
            cliente.setDireccion(clienteDetails.getDireccion());
            cliente.setTelefono(clienteDetails.getTelefono());
            cliente.setCorreoElectronico(clienteDetails.getCorreoElectronico());
            cliente.setNacionalidad(clienteDetails.getNacionalidad());
            cliente.setEstadoCivil(clienteDetails.getEstadoCivil());
            cliente.setOcupacion(clienteDetails.getOcupacion());
            return clienteRepository.save(cliente);
        }
        return null;
    }
    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
