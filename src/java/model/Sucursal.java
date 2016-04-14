package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;

@Entity @Table(name = "sucursales") 
public class Sucursal
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    private String slogan;
    @OneToOne(fetch = FetchType.LAZY) @JoinColumn(name = "fkDireccion") @JsonIgnore private Direccion direccion;
    @OneToOne(fetch = FetchType.EAGER) @JoinColumn(name = "fkEncargado") @JsonIgnore private Persona encargado; 
    @OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.LAZY , mappedBy = "sucursal") @JsonIgnore List<Producto> listadoPrecios;
    @OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.LAZY , mappedBy = "sucursalAsociada") @JsonIgnore List<Venta> listadoPromociones;
    @OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.LAZY , mappedBy = "sucursal") @JsonIgnore List<Consulta> listadoConsultas;
    @OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.LAZY , mappedBy = "sucursal") @JsonIgnore List<Reserva> listadoReservas;
    @ManyToOne() @JoinColumn(name = "fkNegocio") @JsonIgnore Negocio negocio;
    //@OneToMany(cascade = CascadeType.ALL , fetch =  FetchType.EAGER , mappedBy = "") List<Calificacion> listadoCalificaciones;
    //private Horario horario;
    
    
    public Sucursal()
    {
        listadoPrecios = new java.util.ArrayList<Producto>();
        listadoPromociones = new java.util.ArrayList<Venta>();
        listadoConsultas = new java.util.ArrayList<Consulta>();
        listadoReservas = new java.util.ArrayList<Reserva>();
    }
    public Sucursal(String nombre, String slogan, Direccion direccion, Persona encargado, List<Producto> listadoPrecios, List<Venta> listadoPromociones, List<Consulta> listadoConsultas, List<Reserva> listadoReservas, Negocio negocio)
    {
        this.nombre = nombre;
        this.slogan = slogan;
        this.direccion = direccion;
        this.encargado = encargado;
        this.listadoPrecios = listadoPrecios;
        this.listadoPromociones = listadoPromociones;
        this.listadoConsultas = listadoConsultas;
        this.listadoReservas = listadoReservas;
        this.negocio = negocio;
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

    public String getSlogan()
    {
        return slogan;
    }

    public void setSlogan(String slogan)
    {
        this.slogan = slogan;
    }

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }

    public Persona getEncargado()
    {
        return encargado;
    }

    public void setEncargado(Persona encargado)
    {
        this.encargado = encargado;
    }

    public List<Producto> getListadoPrecios()
    {
        return listadoPrecios;
    }

    public void setListadoPrecios(List<Producto> listadoPrecios)
    {
        this.listadoPrecios = listadoPrecios;
    }

    public List<Venta> getListadoPromociones()
    {
        return listadoPromociones;
    }

    public void setListadoPromociones(List<Venta> listadoPromociones)
    {
        this.listadoPromociones = listadoPromociones;
    }

    public List<Consulta> getListadoConsultas()
    {
        return listadoConsultas;
    }

    public void setListadoConsultas(List<Consulta> listadoConsultas)
    {
        this.listadoConsultas = listadoConsultas;
    }

    public List<Reserva> getListadoReservas()
    {
        return listadoReservas;
    }

    public void setListadoReservas(List<Reserva> listadoReservas)
    {
        this.listadoReservas = listadoReservas;
    }
    public Negocio getNegocio()
    {
        return negocio;
    }

    public void setNegocio(Negocio negocio)
    {
        this.negocio = negocio;
    }

    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Sucursal{" + "id=" + id + ", nombre=" + nombre + ", slogan=" + slogan + ", direccion=" + direccion + ", encargado=" + encargado + ", listadoPrecios=" + listadoPrecios + ", listadoPromociones=" + listadoPromociones + ", listadoConsultas=" + listadoConsultas + ", listadoReservas=" + listadoReservas + '}';
    }
    
}
