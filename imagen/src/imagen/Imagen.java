
package imagen;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Imagen extends JFrame implements MouseMotionListener{
        
        JButton bl;
        ImageIcon il;
        

     //To change body of generated methods, choose Tools | Templ
        

    public static void main(String[] args) {
      Imagen c = new Imagen();
        
      
    }
    public Imagen() {
        setBounds(200, 200, 100, 100);
        il=new ImageIcon("src/image/imagenes-gif-para-fondos-para-celular.gif");
        bl=new JButton(il);
        setLayout(new FlowLayout());
        add(bl);
        bl.addMouseMotionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    bl.setLocation(e.getX(),e.getY());
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
