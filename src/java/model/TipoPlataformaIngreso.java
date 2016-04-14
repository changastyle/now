package model;

import javax.persistence.*;

@Entity @Table(name = "tiposplataformaingreso")
public class TipoPlataformaIngreso
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public TipoPlataformaIngreso()
    {
    }
    public TipoPlataformaIngreso(String nombre)
    {
        this.nombre = nombre;
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
    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "TipoPlataformaIngreso{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
