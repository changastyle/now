package model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity @Table(name = "promociones") @PrimaryKeyJoinColumn(name="id")
public class Promocion extends Venta
{
    private Date fechaDesde;
    private Date fechaHasta;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER , mappedBy = "promocion") private List<DetallePromocion> listadoDetallesPromocion;

    public Promocion()
    {
        super();
    }
    public Promocion(Date fechaDesde, Date fechaHasta, List<DetallePromocion> listadoDetallesPromocion, String nombre, String descripcion, double precion, Sucursal sucursal)
    {
        super(nombre, descripcion, precion, sucursal);
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.listadoDetallesPromocion = listadoDetallesPromocion;
    }
    
    //<editor-fold desc="GYS:">
    public Date getFechaDesde()
    {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde)
    {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta()
    {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta)
    {
        this.fechaHasta = fechaHasta;
    }

    public List<DetallePromocion> getListadoDetallesPromocion()
    {
        return listadoDetallesPromocion;
    }

    public void setListadoDetallesPromocion(List<DetallePromocion> listadoDetallesPromocion)
    {
        this.listadoDetallesPromocion = listadoDetallesPromocion;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Promocion{" + "fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", listadoDetallesPromocion=" + listadoDetallesPromocion + '}';
    }
}
