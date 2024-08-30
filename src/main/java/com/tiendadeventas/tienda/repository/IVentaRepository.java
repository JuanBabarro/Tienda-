package com.tiendadeventas.tienda.repository;

import com.tiendadeventas.tienda.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IVentaRepository  extends JpaRepository<Venta,Long> {
    
}
