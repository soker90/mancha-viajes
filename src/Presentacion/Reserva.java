/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author eduardoparra
 */
public class Reserva implements Serializable{
    int NumPersona;
    Recorrido recorrido;
    Double ImporteRestante=0.0;
    double ImporteTotal=0.0;
    int CodigoReserva;
    Date FechaInicio;
    Date FechaFin;

    public Reserva(int NumPersona, Recorrido r) {
        this.NumPersona = NumPersona;
        this.recorrido = r;
        this.CodigoReserva=frmPrincipal.agencia.ContadorReservas;
        frmPrincipal.agencia.ContadorReservas++;
        ImporteRestante=recorrido.getPrecio();
        ImporteTotal=recorrido.getPrecio();
    }

    public Reserva() {
    }

    public void RealizarReserva()
    {

    }

    public void AnularRecorridoIniciado()
    {

    }

     public void AnularRecorridoNoIniciado()
    {

    }

     public void PagarReserva(double pagado)
    {
         ImporteRestante-=pagado;
     }





    public Double getImporteRestante() {
        return ImporteRestante;
    }

    public void setImporteRestante(Double ImporteRestante) {
        this.ImporteRestante = ImporteRestante;
    }

    public int getNumPersona() {
        return NumPersona;
    }

    public void setNumPersona(int NumPersona) {
        this.NumPersona = NumPersona;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public void setRecorrido(Recorrido Recorrido) {
        this.recorrido = Recorrido;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(double ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }



    




    @Override
    public String toString() {
        return "Reserva "+CodigoReserva + " ------ " + ImporteRestante + " € pendientes de pago";
    }

    

}
