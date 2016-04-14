package model;

import javax.persistence.*;

@Entity  @Table(name = "localidades")
public class Localidad
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "fkProvincia")
    private Provincia provincia;

    public Localidad()
    {
    }

    public Localidad(String nombre, Provincia provincia)
    {
        this.nombre = nombre;
        this.provincia = provincia;
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

    public Provincia getProvincia()
    {
        return provincia;
    }

    public void setProvincia(Provincia provincia)
    {
        this.provincia = provincia;
    }

    @Override
    public String toString()
    {
        return "Localidad{" + "id=" + id + ", nombre=" + nombre + ", provincia=" + provincia + '}';
    }

    
    
}
