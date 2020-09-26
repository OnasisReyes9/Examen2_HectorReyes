/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_hectorreyes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public abstract class Persona implements Serializable {

    private static final long SerialVersionUID = 777L;
    
    private String nombre, apellido, numTelefono;
    private ArrayList<Usuario> amigos = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numTelefono=" + numTelefono + ", amigos=" + amigos + '}';
    }
    
    //@Override
    public abstract double enviarMensaje(int calidadWifi);
    
}
