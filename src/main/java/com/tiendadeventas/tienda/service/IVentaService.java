
package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.model.Producto;
import com.tiendadeventas.tienda.model.Venta;

import java.util.List;

public interface IVentaService {
    
    public String crearVenta(Venta venta);
    
    public String borrarVenta(Long id);
    
    public List<Venta> traerVenta();
    
    public Venta traerVenta(Long id);
    
    public void modificarVenta(Venta venta);
    
    public List<Producto> productosxventa(Long num);
    
 
    
    public String mayorventa();
    
}
