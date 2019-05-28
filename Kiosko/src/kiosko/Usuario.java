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
public class Usuario {
    private String dni;
    private String password;

    public Usuario(String dni, String password) {
        this.dni = dni;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void buscarLibro(Libro l){
        
    }
    
    public void recogerLibro(Ejemplar e, Codigo c){
        
    }
    
    public void devolverLibro(Ejemplar e){
        
    }
    
    public void solicitarProrroga(Prestamo p){
        
    }
    
    public void cancelarReserva(Prestamo p){
        
    }
}
