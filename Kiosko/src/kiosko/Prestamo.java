/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosko;

import java.util.Date;

/**
 *
 * @author 47321385n
 */
public class Prestamo {
    private Usuario u;
    private Ejemplar e;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private int vecesPrestados;
    private EstadoPrestamo estado;

    public Prestamo(Usuario u, Ejemplar e, Date fechaPrestamo, Date fechaDevolucion, EstadoPrestamo estado) {
        this.u = u;
        this.e = e;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.vecesPrestados = 0;
        this.estado = estado;
    }

    public int getVecesPrestados() {
        return vecesPrestados;
    }

    public void setVecesPrestados() {
        this.vecesPrestados++;
    }

    public Usuario getUser() {
        return u;
    }

    public void setUser(Usuario u) {
        this.u = u;
    }

    public Ejemplar getEjemplar() {
        return e;
    }

    public void setEejemplar(Ejemplar e) {
        this.e = e;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }
    
    
}
