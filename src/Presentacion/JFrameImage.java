
package Presentacion;

//@author Pablete Serna Perea.
import javax.swing.*;

public class JFrameImage extends JFrame
{
    private final JPaneImage modelo=new JPaneImage();
    public JFrameImage()
    {
        this.setContentPane(modelo);
    }
    public void setImage(String NombreImagen)
    {
        modelo.setImage(NombreImagen);
    }
    
}
