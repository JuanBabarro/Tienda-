package com.tiendadeventas.tienda.service;

import com.tiendadeventas.tienda.dto.ClienteVentaDTO;
import com.tiendadeventas.tienda.model.Producto;
import com.tiendadeventas.tienda.model.Venta;
import com.tiendadeventas.tienda.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventarepository;

    @Override
    public String crearVenta(Venta venta) {
        ventarepository.save(venta);

        return "¡La venta se creo correctamente!";
    }

    @Override
    public String borrarVenta(Long id) {
        ventarepository.deleteById(id);

        return "¡La venta se elimino correctamente!";
    }

    @Override
    public List<Venta> traerVenta() {
        return ventarepository.findAll();
    }

    @Override
    public Venta traerVenta(Long id) {
        return ventarepository.findById(id).orElse(null);
    }

    @Override
    public void modificarVenta(Venta venta) {
        ventarepository.save(venta);
    }

    @Override
    public List<Producto> productosxventa(Long num) {

        List<Venta> listadeventas = ventarepository.findAll();

        for (Venta v : listadeventas) {
            if (v.getCodigo_venta() == num) {
                return v.getListaProductos();
            }
        }
        return null;
    }


    @Override
    public String mayorventa() {

        List<Venta> listadeventas = ventarepository.findAll();
        List<ClienteVentaDTO> listaClienteVenta = new ArrayList<>();
        ClienteVentaDTO cliente = new ClienteVentaDTO();

        Double montototal = 0.0;
        String nombretop = "";
        String apellidotop = ""; 
        Long codigoventatop = null; 
        int cantproductos = 0; 

        for (Venta v : listadeventas) {

            cliente.setNombre_cliente(v.getUnCliente().getNombre());
            cliente.setApellido_cliente(v.getUnCliente().getApellido());
            cliente.setCodigo_venta(v.getCodigo_venta());
            cliente.setCantidad_productos(v.getListaProductos().size());
            cliente.setMontototal(v.getTotal());

            listaClienteVenta.add(cliente);
            cliente = new ClienteVentaDTO();

        }

        for (ClienteVentaDTO cv : listaClienteVenta) {

            if (cv.getMontototal() > montototal) {

                montototal = cv.getMontototal();
                nombretop = cv.getNombre_cliente();
                apellidotop = cv.getApellido_cliente();
                codigoventatop = cv.getCodigo_venta();
                cantproductos = cv.getCantidad_productos();

            }
        }

        return "Datos del cliente TOP: -Nombre : " +nombretop+ " -Apellido: "+apellidotop+ " -Codigo de venta: "+codigoventatop+ " -Cantidad de productos: "+cantproductos+ " -Monto total: "+montototal;
    }
}
