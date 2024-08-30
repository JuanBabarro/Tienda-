
package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.model.Producto;
import com.tiendadeventas.tienda.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {
    
    @Autowired
    private IProductoRepository productorepository;
    

    @Override
    public String crearProducto(Producto producto) {
        productorepository.save(producto);
        
        return "¡Cliente creado correctamente!";    
    }

    @Override
    public String borrarProducto(Long id) {
        productorepository.deleteById(id);
        
        return "¡Cliente eliminado correctamente!";
    }

    @Override
    public List<Producto> traerProductos() {
         List listaproducto = productorepository.findAll();
         
         return listaproducto;
    }

    @Override
    public Producto traerProducto(Long id){
            return productorepository.findById(id).orElse(null);
    }

    @Override
    public void modificarProducto(Producto producto) {
          this.crearProducto(producto);
    }

    @Override
    public List<Producto> cantidad_disponible() {
        
        List<Producto> listadeproductos = productorepository.findAll();
        List<Producto> listanueva = new ArrayList<Producto>();
        
        for (Producto p : listadeproductos){
             if (p.getCantidad_disponible() > 5){
                 listanueva.add(p);
        }
    }
        return listanueva;
  }
}
