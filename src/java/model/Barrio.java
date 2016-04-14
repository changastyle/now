/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.*;

@Entity @Table(name = "barrios")
public class Barrio
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    private String nombre;
    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "fkLocalidad")
    private Localidad localidad;

    public Barrio()
    {
    }

    public Barrio(String nombre, Localidad localidad)
    {
        this.nombre = nombre;
        this.localidad = localidad;
    }

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

    public Localidad getLocalidad()
    {
        return localidad;
    }

    public void setLocalidad(Localidad localidad)
    {
        this.localidad = localidad;
    }

    @Override
    public String toString()
    {
        return "Barrio{" + "id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + '}';
    }
    
    
}
