package model;

import javax.persistence.*;

@Entity @Table(name = "detallepromocion")
public class DetallePromocion
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @OneToOne() @JoinColumn(name ="fkProducto") private Producto producto;
    private double cantidad;
    @ManyToOne() @JoinColumn(name = "fkPromocion") private Promocion promocion;

    public DetallePromocion(Producto producto, double cantidad, Promocion promocion)
    {
        this.producto = producto;
        this.cantidad = cantidad;
        this.promocion = promocion;
    }
    public DetallePromocion()
    {
    }
    
    //<editor-fold desc="GYS:">

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Producto getProducto()
    {
        return producto;
    }

    public void setProducto(Producto producto)
    {
        this.producto = producto;
    }

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public Promocion getPromocion()
    {
        return promocion;
    }

    public void setPromocion(Promocion promocion)
    {
        this.promocion = promocion;
    }
    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "DetallePromocion{" + "id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }
    
    
}
