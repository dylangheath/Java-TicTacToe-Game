

public class Main{
    public static void main(String[] args) {
        TicTacToe myGame = new TicTacToe();
    }
}




/*

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;


class MyJPanel extends JPanel{
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        g.drawString("Hello World", 20, 30);

    }
}

public class Main extends JFrame {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello World!");
        //JFrame window = new JFrame("CSC295 test");
        //window.setSize(300, 300);
        //window.setLocation(200,200);
        //window.setVisible(true);
        Main window = new Main();
    }

    public Main() {
        super("CSC295 test");
        setContentPane(new MyJPanel());
        setSize(300, 300);
        setLocation(200,200);
        setVisible(true);
    }
}
*/