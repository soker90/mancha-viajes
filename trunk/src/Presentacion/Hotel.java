/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.Serializable;

/**
 *
 * @author eduardoparra
 */
public class Hotel implements Serializable{
    //CAMPOS
    String Nombre;
    int Estrellas;
    String Direccion;
    String Telefono;
    //CONSTRUCTORES
    public Hotel(String Nombre, int Estrellas, String Direccion, String Telefono) {
        this.Nombre = Nombre;
        this.Estrellas = Estrellas;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    

}
