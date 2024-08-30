
package com.tiendadeventas.tienda.repository;

import com.tiendadeventas.tienda.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository  extends JpaRepository<Cliente,Long> {
    
}
