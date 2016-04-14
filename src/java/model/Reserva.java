package model;

import java.util.Date;
import javax.persistence.*;

@Entity @Table(name = "reservas")
public class Reserva
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    //@OneToOne(fetch = FetchType.EAGER) @JoinColumn(name = "fkVenta") private Venta cosaReservada;
    @ManyToOne() @JoinColumn(name = "fkSucursal") private Sucursal sucursal;
    @ManyToOne() @JoinColumn(name = "fkCliente")private Persona turista;
    private Date fechaActual;
    private Date fechaDeReserva;
    private double valorReservado;

    public Reserva()
    {
    }
    public Reserva(Venta cosaReservada, Sucursal sucursal, Persona turista, Date fechaActual, Date fechaDeReserva, double valorReservado)
    {
        //this.cosaReservada = cosaReservada;
        this.sucursal = sucursal;
        this.turista = turista;
        this.fechaActual = fechaActual;
        this.fechaDeReserva = fechaDeReserva;
        this.valorReservado = valorReservado;
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

    /*public Venta getCosaReservada()
    {
        return cosaReservada;
    }

    public void setCosaReservada(Venta cosaReservada)
    {
        this.cosaReservada = cosaReservada;
    }
*/
    public Sucursal getSucursal()
    {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal)
    {
        this.sucursal = sucursal;
    }

    public Persona getTurista()
    {
        return turista;
    }

    public void setTurista(Persona turista)
    {
        this.turista = turista;
    }

    public Date getFechaActual()
    {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual)
    {
        this.fechaActual = fechaActual;
    }

    public Date getFechaDeReserva()
    {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(Date fechaDeReserva)
    {
        this.fechaDeReserva = fechaDeReserva;
    }

    public double getValorReservado()
    {
        return valorReservado;
    }

    public void setValorReservado(double valorReservado)
    {
        this.valorReservado = valorReservado;
    }
    //</editor-fold>
    
    @Override
    public String toString()
    {
        return "Reserva{" + "id=" + id + ", cosaReservada=" +/* cosaReservada +*/ ", turista=" + turista + ", fechaActual=" + fechaActual + ", fechaDeReserva=" + fechaDeReserva + ", valorReservado=" + valorReservado + '}';
    }
}
