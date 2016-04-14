package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="categorias")
public class Categoria 
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String icono;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria") @JsonIgnore private java.util.List<Negocio> negocios;

    public Categoria() 
    {
        this.nombre = "";
        this.icono = "";
        this.negocios = new java.util.ArrayList<Negocio>();
    }
    public Categoria( String nombre) 
    {
        this.nombre = nombre;
        this.icono = "";
        this.negocios = new java.util.ArrayList<Negocio>();
    }

    public Categoria(String nombre, String URLIcono)
    {
        this.nombre = nombre;
        this.icono = URLIcono;
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

    public String getIcono()
    {
        return icono;
    }

    public void setIcono(String icono)
    {
        this.icono = icono;
    }

    public List<Negocio> getNegocios()
    {
        return negocios;
    }

    public void setNegocios(List<Negocio> negocios)
    {
        this.negocios = negocios;
    }
    
    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre + ", icono=" + icono + '}';
    }
}
