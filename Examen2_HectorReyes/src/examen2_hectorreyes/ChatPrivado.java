/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_hectorreyes;

/**
 *
 * @author Onasis Reyes
 */
public class ChatPrivado extends Chat {

    private Usuario receptor;

    public ChatPrivado() {
        super();
    }

    public ChatPrivado(Usuario receptor) {
        this.receptor = receptor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "ChatPrivado{" + "receptor=" + receptor + '}';
    }

}
