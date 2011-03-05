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
public class Transporte implements Serializable{
    String Tipo;
    String Hora;
    String CiudadDestino;

    public Transporte(String Tipo, String Hora, String CiudadDestino) {
        this.Tipo = Tipo;
        this.Hora = Hora;
        this.CiudadDestino = CiudadDestino;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return Tipo +" a "+CiudadDestino+", "+Hora;
    }




}
