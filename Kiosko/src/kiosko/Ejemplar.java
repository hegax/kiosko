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
public class Ejemplar{
    private long id;
    private Libro l;
    private EstadoEjemplar estado;

    public Ejemplar(long id, Libro l) {
        this.id = id;
        this.l = l;
    }

    public Libro getLibro() {
        return l;
    }

    public void setLibro(Libro l) {
        this.l = l;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
    
    
}
