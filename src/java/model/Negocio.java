package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import java.util.List;
import javax.persistence.*;

@Entity @Table(name = "negocios")
public class Negocio
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String slogan;
    
    @ManyToOne() @JoinColumn(name = "fkCategoria") @JsonIgnore private Categoria categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "negocio" , fetch = FetchType.LAZY) @JsonIgnore private java.util.List<model.Sucursal> sucursales;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "negocio" , fetch = FetchType.EAGER)  private java.util.List<Tag> listadoTags;
    
    public Negocio()
    {
        this.nombre = "";
        this.categoria = null;
        this.slogan = "";
        sucursales = new java.util.ArrayList<model.Sucursal>();
    }
    public Negocio(String nombre, String slogan , Categoria categoria)
    {
        this.nombre = nombre;
        this.slogan = slogan;
        this.categoria = categoria;
        sucursales = new java.util.ArrayList<model.Sucursal>();
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

    public Categoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }

    public String getSlogan()
    {
        return slogan;
    }

    public void setSlogan(String slogan)
    {
        this.slogan = slogan;
    }

    
    public List<Sucursal> getSucursales()
    {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales)
    {
        this.sucursales = sucursales;
    }

    public List<Tag> getListadoTags()
    {
        return listadoTags;
    }

    public void setListadoTags(List<Tag> listadoTags)
    {
        this.listadoTags = listadoTags;
    }
    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Negocio{" + "id=" + id + ", nombre=" + nombre + ", slogan=" + slogan + ", sucursales=" + sucursales + ", listadoTags=" + listadoTags + '}';
    }

}
