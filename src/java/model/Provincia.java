package model;

import javax.persistence.*;

@Entity  @Table(name = "provincias")
public class Provincia
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "fkPais")
    private Pais pais;

    public Provincia()
    {
    }

    public Provincia(String nombre, Pais pais)
    {
        this.nombre = nombre;
        this.pais = pais;
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

    public Pais getPais()
    {
        return pais;
    }

    public void setPais(Pais pais)
    {
        this.pais = pais;
    }

    @Override
    public String toString()
    {
        return "Provincia{" + "id=" + id + ", nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    
    
}
