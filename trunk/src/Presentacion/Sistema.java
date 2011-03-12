/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardoparra
 */
public class Sistema implements Serializable{
        //Campos.
    ArrayList<Ciudad> Ciudades;
    ArrayList<Cliente> Clientes;
    Catalogo CatalogoInicial;
    int ContadorReservas;
    String CIF;
    String Nombre;
    String Direccion;
    String Telefono;
    String email;

    public Sistema() {
        this.CIF = "46546564fg";
        this.Nombre = "ManchaViajes S.L.";
        this.Direccion = "C/Viñarejo, 72";
        this.Telefono = "956845632";
        this.email = "administracion@manchaviajes.com";
        Ciudades=new ArrayList<Ciudad>();
        Clientes= new ArrayList<Cliente>();
        CatalogoInicial= new Catalogo();
        ContadorReservas=0;
    }

    //Métodos.
    public static Sistema CargarDatos() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream objin= new ObjectInputStream(new FileInputStream("datos.dat"));
        Sistema aux=(Sistema) objin.readObject();
        return aux;

    }
    public void AnularRecorridosRealizados()
    {

    }
    public void AñadirCiudad(Ciudad c)
    {
        boolean existe=false;
        for (int i= 0; i < Ciudades.size(); i++) {
            if(c.Nombre.equals(Ciudades.get(i).Nombre)==true)
            {
                //Si existe la ciduad, existe a true y sale del for
                existe=true;
                break;
            }
        }
        //Si no existe se añade al arraylist ciudades y si existe se muestra un mensaje
        if(!existe)
            Ciudades.add(c);
        else
            JOptionPane.showMessageDialog(null,"La ciudad que ha introducido ya existe", "Error",JOptionPane.ERROR_MESSAGE);
    }

    public void AñadirCliente(Cliente c)
    {
         boolean existe=false;
        for (int i= 0; i < Ciudades.size(); i++) {
            if(c.DNI.equals(Clientes.get(i).DNI)==true)
                existe=true;
        }
        if(existe==false)
            Clientes.add(c);
    }
    public void crear_clientes()
    {
        Clientes= new ArrayList<Cliente>();
        Cliente c1 = new Cliente("9234756", new ArrayList<Reserva>(), "Moises Cano", "C/ nueva", "socuellamos", 13630, 02752345);
        //c1.getReservas().add(new Reserva(5, new Recorrido()));
        Cliente c2 = new Cliente("3458739", new ArrayList<Reserva>(), "Eduardo Parra", "C/ albaricoque", "Alcazar", 13000, 97685);
        Cliente c3 = new Cliente("098709", new ArrayList<Reserva>(), "Pablo Serna", "C/  mengajo", "VillaFranca", 13854, 984544);
        Clientes.add(c1);
        Clientes.add(c2);
        Clientes.add(c3);
    }

    public void crear_recorridos()
    {
        CatalogoInicial.Recorridos.add(new Recorrido(new Ciudad("Madrid", 3216, "España"), new Ciudad("Barcelona", 9315, "España"), new Hotel("Grand Syrenis", 3, "C/buenavida", "987654321"), new Transporte("Tren", "20:30", 1), new Transporte("Avion", "11:35", 2), 250.00));
        CatalogoInicial.Recorridos.add(new Recorrido(new Ciudad("Sevilla", 9785, "España"), new Ciudad("Salamanca", 5421, "España"), new Hotel("Melia", 2, "C/Ezequiel III", "963541274"), new Transporte("Autobus", "21:30", 0), new Transporte("Tren", "10:35", 1), 180.00));
        CatalogoInicial.Recorridos.add(new Recorrido(new Ciudad("Alcazar", 13600, "España"), new Ciudad("Aveiro", 1856, "Portugal"), new Hotel("Hotetur", 3, "C/Hipanema", "754236511"), new Transporte("Avion", "8:30", 2), new Transporte("Tren", "10:35", 0), 180.00));
    }


}


