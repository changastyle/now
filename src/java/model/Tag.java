package model;

import javax.persistence.*;

@Entity @Table(name="tags")
public class Tag
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    
    @ManyToOne() @JoinColumn(name = "fkNegocio") private Negocio negocio;

    public Tag()
    {
        this.nombre = "";
        this.negocio = null;
    }
    public Tag(String nombre, Negocio negocio)
    {
        this.nombre = nombre;
        this.negocio = negocio;
    }

    //GYS:
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

    public Negocio getNegocio()
    {
        return negocio;
    }

    public void setNegocio(Negocio negocio)
    {
        this.negocio = negocio;
    }

    @Override
    public String toString()
    {
        return "Tag{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
