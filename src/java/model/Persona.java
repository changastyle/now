package model;

import javax.persistence.*;

@Entity @Table(name = "personas") @Inheritance(strategy=InheritanceType.JOINED)
public abstract class Persona
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    private String apellido;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL) @JoinColumn(name = "fkDireccion") private Direccion direccion;
    private String telefono;
    private String correo;

    public Persona(String nombre, String apellido, Direccion direccion, String telefono, String correo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    public Persona()
    {
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

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }
    //</editor-fold>   
}
