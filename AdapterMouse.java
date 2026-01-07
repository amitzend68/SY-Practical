import javax.swing.JFrame;
import java.awt.event.*;


public class AdapterMouse {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.addMouseListener(new MouseAdapter(){
            public void MouseClicked(MouseEvent e){
                System.out.println("Mouse Clicked");
            }
        });

        f.setSize(200, 200);
        f.setVisible(true);
    }
}


