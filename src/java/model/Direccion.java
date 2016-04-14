package model;

import javax.persistence.*;

@Entity @Table(name = "direcciones")
public class Direccion
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="fkBarrio") private Barrio barrio;
    private String calle;
    private String nro;
    private boolean esEdificio;
    private String piso;
    private String departamento;

    public Direccion()
    {
    }
    public Direccion(Barrio barrio, String calle, String nro, boolean esEdificio, String piso, String departamento)
    {
        this.barrio = barrio;
        this.calle = calle;
        this.nro = nro;
        this.esEdificio = esEdificio;
        this.piso = piso;
        this.departamento = departamento;
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

    public Barrio getBarrio()
    {
        return barrio;
    }

    public void setBarrio(Barrio barrio)
    {
        this.barrio = barrio;
    }

    public String getCalle()
    {
        return calle;
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    public String getNro()
    {
        return nro;
    }

    public void setNro(String nro)
    {
        this.nro = nro;
    }

    public boolean isEsEdificio()
    {
        return esEdificio;
    }

    public void setEsEdificio(boolean esEdificio)
    {
        this.esEdificio = esEdificio;
    }

    public String getPiso()
    {
        return piso;
    }

    public void setPiso(String piso)
    {
        this.piso = piso;
    }

    public String getDepartamento()
    {
        return departamento;
    }

    public void setDepartamento(String departamento)
    {
        this.departamento = departamento;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return "Direccion{" + "id=" + id + ", barrio=" + barrio + ", calle=" + calle + ", nro=" + nro + ", esEdificio=" + esEdificio + ", piso=" + piso + ", departamento=" + departamento + '}';
    }
    
    
    
}
