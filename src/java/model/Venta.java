package model;

import javax.persistence.*;

@Entity @Table(name = "ventas") @Inheritance(strategy=InheritanceType.JOINED)
public abstract class Venta
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    private String descripcion;
    private double precion;
    @ManyToOne() @JoinColumn(name = "fkSucursal") private Sucursal sucursalAsociada;

    public Venta()
    {
    }
    
    public Venta(String nombre, String descripcion, double precion, Sucursal sucursalAsociada)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precion = precion;
        this.sucursalAsociada = sucursalAsociada;
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

    public double getPrecion()
    {
        return precion;
    }

    public void setPrecion(double precion)
    {
        this.precion = precion;
    }

    public Sucursal getSucursalAsociada()
    {
        return sucursalAsociada;
    }

    public void setSucursalAsociada(Sucursal sucursalAsociada)
    {
        this.sucursalAsociada = sucursalAsociada;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Venta{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precion=" + precion + '}';
    }
}
