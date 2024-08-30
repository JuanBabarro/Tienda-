
package com.tiendadeventas.tienda.model;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;

    private Double total;

    @OneToMany(mappedBy = "unaVenta")
    private List<Producto> listaProductos;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente unCliente;

    public Venta() {
    }
    
    
    
}
