package swing;
import java.awt.*;  
import javax.swing.JFrame;
public class MyCanvas extends Canvas{  
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("saranyapic.jpg");  
        g.drawImage(i, 50,100,this);  
          
    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  