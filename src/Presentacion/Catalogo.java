/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eduardoparra
 */
public class Catalogo implements Serializable{
    //CAMPOS
    ArrayList<Recorrido> Recorridos;
    Date Fecha;
    //CONSTRUCTORES
    public Catalogo() {
        Recorridos = new ArrayList<Recorrido>();
        Fecha = new Date();
    }
    //METODOS
    public void SolicitarCatalogo()
    {
        System.out.println("Imprimiendo...");

    }

}
