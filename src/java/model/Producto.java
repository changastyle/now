package model;

import javax.persistence.*;

@Entity @Table(name = "productos")
public class Producto
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    @ManyToOne() @JoinColumn(name ="fkSucursal") private Sucursal sucursal;


    public Producto()
    {
    }

    public Producto(String nombre, String descripcion, double precio, Sucursal sucursal)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.sucursal = sucursal;
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

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
}
