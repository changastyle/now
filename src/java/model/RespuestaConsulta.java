package model;

import java.util.Date;
import javax.persistence.*;

@Entity @Table(name = "respuestasConsultas")
public class RespuestaConsulta
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne() @JoinColumn(name = "fkConsultaRespondida") private Consulta consultaRespondida;
    @OneToOne(fetch = FetchType.EAGER) @JoinColumn(name = "fkPersonaQueRespondio") private Persona personaQueRespondio;
    private String textoRespuesta;
    private Date fechaRespuesta;

    public RespuestaConsulta()
    {
    }
    public RespuestaConsulta(Consulta consultaRespondida, Persona personaQueRespondio, String textoRespuesta, Date fechaRespuesta)
    {
        this.consultaRespondida = consultaRespondida;
        this.personaQueRespondio = personaQueRespondio;
        this.textoRespuesta = textoRespuesta;
        this.fechaRespuesta = fechaRespuesta;
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

    public Consulta getConsultaRespondida()
    {
        return consultaRespondida;
    }

    public void setConsultaRespondida(Consulta consultaRespondida)
    {
        this.consultaRespondida = consultaRespondida;
    }

    public Persona getPersonaQueRespondio()
    {
        return personaQueRespondio;
    }

    public void setPersonaQueRespondio(Persona personaQueRespondio)
    {
        this.personaQueRespondio = personaQueRespondio;
    }

    public String getTextoRespuesta()
    {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta)
    {
        this.textoRespuesta = textoRespuesta;
    }

    public Date getFechaRespuesta()
    {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta)
    {
        this.fechaRespuesta = fechaRespuesta;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return "RespuestaConsulta{" + "id=" + id + ", personaQueRespondio=" + personaQueRespondio + ", textoRespuesta=" + textoRespuesta + ", fechaRespuesta=" + fechaRespuesta + '}';
    }
    public long calcularTiempoTranscurridoRespuesta()
    {
        long tiempoTranscurrido = 0;
        return tiempoTranscurrido;
    }
}
