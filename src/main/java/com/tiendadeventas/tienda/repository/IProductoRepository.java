
package com.tiendadeventas.tienda.repository;

import com.tiendadeventas.tienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository  extends JpaRepository<Producto,Long> {
    
}
