/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author eduardoparra
 */
public class Cliente implements Serializable{
        //Campos.
    public String DNI;
    public ArrayList<Reserva> Reservas;
    public String NombreCompleto;
    public String Direccion;
    public String Poblacion;
    public int CP;
    public int Telefono;

    public Cliente() {
    }

    public Cliente(String DNI, ArrayList<Reserva> Reservas, String NombreCompleto, String Direccion, String Poblacion, int CP, int Telefono) {
        this.DNI = DNI;
        this.Reservas = Reservas;
        this.NombreCompleto = NombreCompleto;
        this.Direccion = Direccion;
        this.Poblacion = Poblacion;
        this.CP = CP;
        this.Telefono = Telefono;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public ArrayList<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(ArrayList<Reserva> Reservas) {
        this.Reservas = Reservas;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return this.NombreCompleto;
    }


}
