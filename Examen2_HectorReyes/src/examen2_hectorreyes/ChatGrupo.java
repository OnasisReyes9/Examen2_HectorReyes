/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_hectorreyes;

import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public class ChatGrupo extends Chat {

    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Usuario administraor;

    public ChatGrupo() {
        super();
    }

    public ChatGrupo(String nombre, Usuario administraor) {
        this.nombre = nombre;
        this.administraor = administraor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdministraor() {
        return administraor;
    }

    public void setAdministraor(Usuario administraor) {
        this.administraor = administraor;
    }

    @Override
    public String toString() {
        return "ChatGrupo{" + "nombre=" + nombre + ", miembros=" + miembros + ", administraor=" + administraor + '}';
    }

}
