
package Presentacion;

//@author albertogrande.
import javax.swing.*;
import java.awt.*;

public class JPaneImage extends JPanel
{
    //Variable de la Imagen.
    private Image Imagen;
    //Constructor sin parámetros.
    public JPaneImage()
    {
        Imagen=null;
    }
    //Constructor con parámetros.
    public JPaneImage(String NombreImagen)
    {
            Imagen=new ImageIcon(getClass().getResource(NombreImagen)).getImage();
            repaint();
    }
    public void setImage(String NombreImagen)
    {
            Imagen=new ImageIcon(getClass().getResource(NombreImagen)).getImage();
            repaint();
    }
    //Clase de dibujar.
    @Override
    public void paint(Graphics g)
    {
           g.drawImage(Imagen,0,0,getWidth(),getHeight(), this);
           setOpaque(false);
           super.paint(g);
    }
}
