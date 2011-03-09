/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardoparra
 */
public class Ciudad implements Serializable{
    String Nombre;
    int CodigoPostal;
    String Pais;
    ArrayList<Hotel> Hoteles;
    ArrayList<Transporte> Transportes;

    public Ciudad(String Nombre, int CodigoPostal, String Pais) {
        this.Nombre = Nombre;
        this.CodigoPostal = CodigoPostal;
        this.Pais = Pais;
    }

    public void AñadirHotel(Hotel hot)
    {
        boolean existe=false;
        for(int i=0;i<Hoteles.size();i++)
        {
            if(Hoteles.get(i).Nombre.equals(hot.Nombre)==true)
            {
                //Si existe el hotel, existe a true y sale del for
                existe=true;
                break;
            }
        }
        //Si no existe, se añade al arraylist hoteles y si existe se muestra un mensaje
        if(!existe)
            Hoteles.add(hot);
        else
            JOptionPane.showMessageDialog(null, "El hotel que ha introducido ya existe","Error",JOptionPane.ERROR_MESSAGE);
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public ArrayList<Hotel> getHotel() {
        return Hoteles;
    }

    public void setHotel(ArrayList<Hotel> Hotel) {
        this.Hoteles = Hotel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public ArrayList<Transporte> getTransportes() {
        return Transportes;
    }

    public void setTransportes(ArrayList<Transporte> Transportes) {
        this.Transportes = Transportes;
    }

    @Override
    public String toString() {
        return Nombre;
    }


}
