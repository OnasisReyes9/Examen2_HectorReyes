/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_hectorreyes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Onasis Reyes
 */
public class Mensaje implements Serializable {

    private static final long SerialVersionUID = 777L;
    private String contenido, leido;
    private Date hora, fecha;

    public Mensaje(String contenido, String leido, Date hora, Date fecha) {
        this.contenido = contenido;
        this.leido = leido;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Mensaje() {
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getLeido() {
        return leido;
    }

    public void setLeido(String leido) {
        this.leido = leido;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "contenido=" + contenido + ", leido=" + leido + ", hora=" + hora + ", fecha=" + fecha + '}';
    }

}
