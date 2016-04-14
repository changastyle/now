package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity  @Table( name = "encargados") @PrimaryKeyJoinColumn(name="id")
public class Encargado extends Persona
{
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @ManyToOne() @JoinColumn(name = "fkSucursal") @JsonIgnore private Sucursal sucursal;

    public Encargado()
    {
        super();
    }

    public Encargado(Sucursal sucursal, String nombre, String apellido, Direccion direccion, String telefono, String correo)
    {
        super(nombre, apellido, direccion, telefono, correo);
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal()
    {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal)
    {
        this.sucursal = sucursal;
    }
    
}
