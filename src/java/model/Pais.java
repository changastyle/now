package model;

import javax.persistence.*;

@Entity  @Table(name = "paises")
public class Pais
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;

    public Pais()
    {
    }

    public Pais(String nombre)
    {
        this.nombre = nombre;
    }

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

    @Override
    public String toString()
    {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
