package model;

import java.util.Date;
import javax.persistence.*;

@Entity @Table( name = "ingresos")
public class Ingreso
{
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
     @ManyToOne() @JoinColumn(name = "fkCliente") private Persona turista;
     private Date fechaIngreso;
     @OneToOne(fetch = FetchType.EAGER) @JoinColumn(name = "fkTipoPlataformaIngreso") private TipoPlataformaIngreso tipoPlataformaIngreso;
     private double coordX;
     private double coordY;

    public Ingreso()
    {
    }
    public Ingreso(Persona turista, Date fechaIngreso, TipoPlataformaIngreso tipoPlataformaIngreso, double coordX, double coordY)
    {
        this.turista = turista;
        this.fechaIngreso = fechaIngreso;
        this.tipoPlataformaIngreso = tipoPlataformaIngreso;
        this.coordX = coordX;
        this.coordY = coordY;
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

    public Persona getTurista()
    {
        return turista;
    }

    public void setTurista(Persona turista)
    {
        this.turista = turista;
    }

    public Date getFechaIngreso()
    {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso)
    {
        this.fechaIngreso = fechaIngreso;
    }

    public TipoPlataformaIngreso getTipoPlataformaIngreso()
    {
        return tipoPlataformaIngreso;
    }

    public void setTipoPlataformaIngreso(TipoPlataformaIngreso tipoPlataformaIngreso)
    {
        this.tipoPlataformaIngreso = tipoPlataformaIngreso;
    }

    public double getCoordX()
    {
        return coordX;
    }

    public void setCoordX(double coordX)
    {
        this.coordX = coordX;
    }

    public double getCoordY()
    {
        return coordY;
    }

    public void setCoordY(double coordY)
    {
        this.coordY = coordY;
    }
    
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Ingreso{" + "id=" + id + ", fechaIngreso=" + fechaIngreso + ", tipoPlataformaIngreso=" + tipoPlataformaIngreso + ", coordX=" + coordX + ", coordY=" + coordY + '}';
    } 
}
