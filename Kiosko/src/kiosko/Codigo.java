/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosko;

/**
 *
 * @author 47321385n
 */
public class Codigo {
    private Usuario u;
    private Ejemplar e;

    public Codigo(Usuario u, Ejemplar e) {
        this.u = u;
        this.e = e;
    }

    public Ejemplar getEjemplar() {
        return e;
    }

    public void setEjemplar(Ejemplar e) {
        this.e = e;
    }

    public Usuario getUser() {
        return u;
    }

    public void setUser(Usuario u) {
        this.u = u;
    }
    
    
}
