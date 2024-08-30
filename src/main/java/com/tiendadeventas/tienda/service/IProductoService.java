
package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.model.Producto;
import java.util.List;

public interface IProductoService {
    
    public String crearProducto(Producto producto);
    
    public String borrarProducto(Long id);
    
    public List<Producto> traerProductos();
    
    public Producto traerProducto(Long id);
    
    public void modificarProducto(Producto producto);
    
    public List<Producto> cantidad_disponible();
    
}
