package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.model.Cliente;
import java.util.List;


public interface IClienteService {
    
    public String crearCliente(Cliente cliente);
    
    public String borrarCliente(Long id);
    
    public List<Cliente> traerClientes();
    
    public Cliente traerCliente(Long id);
    
    public void modificarCliente(Cliente cliente);
}

