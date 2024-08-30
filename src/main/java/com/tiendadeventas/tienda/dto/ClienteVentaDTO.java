package com.tiendadeventas.tienda.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteVentaDTO {
    
    private Long codigo_venta;
    private int cantidad_productos;
    private String nombre_cliente;
    private String apellido_cliente;
    private Double montototal;

    public ClienteVentaDTO(Long codigo_venta, int cantidad_productos, String nombre_cliente, String apellido_cliente, Double montototal) {
        this.codigo_venta = codigo_venta;
        this.cantidad_productos = cantidad_productos;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.montototal = montototal;
    }

    public ClienteVentaDTO() {
    }
    
}
