
package Presentacion;

import java.io.Serializable;
import java.util.Date;

//@author PabloSerna.
public class Recorrido implements Serializable{
        //CAMP0S
    Ciudad cOrigen;
    Ciudad cDestino;
    Hotel H1;
    Transporte Trans1;
    Transporte Trans2;
    Double Precio;
    
    //CONSTRUCTORES
    public Recorrido()
    {
        Precio=1500.0;
    }
    public Recorrido(Ciudad cOrigen, Ciudad cDestino, Hotel H1, Transporte Trans1, Transporte Trans2, Double Precio) {
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.H1 = H1;
        this.Trans1 = Trans1;
        this.Trans2 = Trans2;
        this.Precio = Precio;
    }
    //METODOS
    public Hotel getH1() {
        return H1;
    }

    public void setH1(Hotel H1) {
        this.H1 = H1;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public Transporte getTrans1() {
        return Trans1;
    }

    public void setTrans1(Transporte Trans1) {
        this.Trans1 = Trans1;
    }

    public Transporte getTrans2() {
        return Trans2;
    }

    public void setTrans2(Transporte Trans2) {
        this.Trans2 = Trans2;
    }

    public Ciudad getcDestino() {
        return cDestino;
    }

    public void setcDestino(Ciudad cDestino) {
        this.cDestino = cDestino;
    }

    public Ciudad getcOrigen() {
        return cOrigen;
    }

    public void setcOrigen(Ciudad cOrigen) {
        this.cOrigen = cOrigen;
    }

    public Recorrido Clonar()
    {
        Recorrido copia= new Recorrido();
        copia.setcOrigen(cOrigen);
        copia.setcDestino(cDestino);
        copia.setTrans2(Trans2);
        copia.setTrans1(Trans1);
        copia.setH1(H1);
        copia.setPrecio(Precio);
        return copia;
    }

    @Override
    public String toString() {
        return cOrigen.getNombre()+" - "+cDestino.getNombre();
    }


}
