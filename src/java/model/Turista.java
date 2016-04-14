package model;

import java.util.List;
import javax.persistence.*;

@Entity @Table(name = "turistas") @PrimaryKeyJoinColumn(name="id")
public class Turista extends Persona
{
    private String password;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER, mappedBy = "turista") private java.util.List<Ingreso> listadoIngresos;

    public Turista()
    {
        super();
        this.listadoIngresos = new java.util.ArrayList<Ingreso>();
    }

    public Turista(String password, List<Ingreso> listadoIngresos, String nombre, String apellido, Direccion direccion, String telefono, String correo)
    {
        super(nombre, apellido, direccion, telefono, correo);
        this.password = password;
        this.listadoIngresos = listadoIngresos;
    }
    
    //<editor-fold desc="GYS:">
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public List<Ingreso> getListadoIngresos()
    {
        return listadoIngresos;
    }

    public void setListadoIngresos(List<Ingreso> listadoIngresos)
    {
        this.listadoIngresos = listadoIngresos;
    }

 
    //</editor-fold>
}
