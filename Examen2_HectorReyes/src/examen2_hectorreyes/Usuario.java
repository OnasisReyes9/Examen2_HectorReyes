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
public class Usuario extends Persona implements Serializable {

    private static final long SerialVersionUID = 777L;

    private String nombreUsuario, contraseña;
    private ArrayList<Chat> chats = new ArrayList();
    private ArrayList<Usuario> solicitudes = new ArrayList();
    private int calidadWifi;

    public Usuario() {
        super();
    }

    public Usuario(String nombreUsuario, String contraseña, int calidadWifi, String nombre, String apellido, String numTelefono) {
        super(nombre, apellido, numTelefono);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.calidadWifi = calidadWifi;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Usuario> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public int getCalidadWifi() {
        return calidadWifi;
    }

    public void setCalidadWifi(int calidadWifi) {
        this.calidadWifi = calidadWifi;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", chats=" + chats + ", solicitudes=" + solicitudes + ", calidadWifi=" + calidadWifi + '}';
    }

}
