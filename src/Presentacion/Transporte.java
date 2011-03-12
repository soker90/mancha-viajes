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
public class Transporte implements Serializable {

    String Tipo;
    String Hora;
    int IndiceCiudadDestino;

    public Transporte(String Tipo, String Hora, int IndiceCiudadDestino) {
        this.Tipo = Tipo;
        this.Hora = Hora;
        this.IndiceCiudadDestino = IndiceCiudadDestino;
    }

    public int getCiudadDestino() {
        return IndiceCiudadDestino;
    }

    public void setCiudadDestino(int IndiceCiudadDestino) {
        this.IndiceCiudadDestino = IndiceCiudadDestino;
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
        return Tipo + " a " + frmPrincipal.agencia.Ciudades.get(IndiceCiudadDestino).Nombre + ", " + Hora;
    }
}
