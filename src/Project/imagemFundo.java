package Project;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class imagemFundo extends javax.swing.JPanel  {
    
    private ImageIcon img;
    
    public imagemFundo(){
        img = new ImageIcon();
    }
    
   
    public void paintComponent(Graphics g){
        super.paintComponent((java.awt.Graphics) g);
        
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
    
    public void setImg(ImageIcon img){
        this.img = img;
    }
    
    public ImageIcon getImg(){
        return this.img;
    }
}

