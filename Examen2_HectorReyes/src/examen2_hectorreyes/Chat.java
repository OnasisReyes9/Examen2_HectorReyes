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
public class Chat implements Serializable {

    private static final long SerialVersionUID = 777L;

    private ArrayList<Mensaje> mensajes = new ArrayList();

    public Chat() {
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat{" + "mensajes=" + mensajes + '}';
    }

}
