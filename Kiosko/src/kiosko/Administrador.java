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
public class Administrador {
    private String nombre;
    private String password;

    public Administrador(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void prepararLibro(Prestamo p){
        
    }
    
    public void desprepararLibro(Prestamo p){
        
    }
    
    public void validarRegistro(){
        
    }
    
    
}
