package model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity @Table(name = "consultas")
public class Consulta
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String texto;
    @ManyToOne() @JoinColumn(name = "fkPersonaQuePregunta") private Persona preguntante;
    @ManyToOne() @JoinColumn(name = "fkSucursal") private Sucursal sucursal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultaRespondida" , fetch = FetchType.EAGER)private List<RespuestaConsulta> respuestas;
    private Date fechaConsulta;

    public Consulta()
    {
        this.respuestas = new java.util.ArrayList<RespuestaConsulta>();
    }

    public Consulta(String texto, Persona preguntante, Sucursal sucursal, List<RespuestaConsulta> respuestas, Date fechaConsulta)
    {
        this.texto = texto;
        this.preguntante = preguntante;
        this.sucursal = sucursal;
        this.respuestas = respuestas;
        this.fechaConsulta = fechaConsulta;
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

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    public Persona getPreguntante()
    {
        return preguntante;
    }

    public void setPreguntante(Persona preguntante)
    {
        this.preguntante = preguntante;
    }

    public Sucursal getSucursal()
    {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal)
    {
        this.sucursal = sucursal;
    }

    public List<RespuestaConsulta> getRespuestas()
    {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaConsulta> respuestas)
    {
        this.respuestas = respuestas;
    }

    public Date getFechaConsulta()
    {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta)
    {
        this.fechaConsulta = fechaConsulta;
    }
    //</editor-fold>


    
    @Override
    public String toString()
    {
        return "Consulta{" + "id=" + id + ", texto=" + texto + ", respuestas=" + respuestas + ", fechaConsulta=" + fechaConsulta + '}';
    }
}
