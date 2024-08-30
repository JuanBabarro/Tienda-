
package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.model.Cliente;
import com.tiendadeventas.tienda.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private IClienteRepository clienterepository;
    

    @Override
    public String crearCliente(Cliente cliente) {
        clienterepository.save(cliente);
        
        return "¡Cliente creado correctamente!";    
    }

    @Override
    public String borrarCliente(Long id) {
        clienterepository.deleteById(id);
        
        return "¡Cliente eliminado correctamente!";
    }

    @Override
    public List<Cliente> traerClientes() {
         List listaclientes = clienterepository.findAll();
         
         return listaclientes;
    }

    @Override
    public Cliente traerCliente(Long id){
            return clienterepository.findById(id).orElse(null);
    }

    @Override
    public void modificarCliente(Cliente cliente) {
          this.crearCliente(cliente);
    }
    
}
