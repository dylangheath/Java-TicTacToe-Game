import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame{
    JPanel panel= new JPanel();//this will contain the components
    JButton btna1, btna2, btna3, 
        btnb1, btnb2, btnb3, 
        btnc1, btnc2, btnc3;
    String currentPlayer = "x";
    Font font = new Font(Font.SERIF, Font.BOLD, 100);
    JMenuBar menubar = new JMenuBar();

    public TicTacToe() {
        super("Yes!!!! Games!! Tic Tac Toe");

      
        setContentPane(panel);
        panel.setLayout(new GridLayout(3,3));
        panel.setVisible(true);

        btna1 = new JButton(); panel.add(btna1); 
        btna1.addActionListener(e -> MyClickEventHandler(e));
        btna1.setFont(font);

        btna2 = new JButton(); panel.add(btna2);
        btna2.addActionListener(e -> MyClickEventHandler(e));
        btna2.setFont(font);

        btna3 = new JButton(); panel.add(btna3);
        btna3.addActionListener(e -> MyClickEventHandler(e));
        btna3.setFont(font);

        btnb1 = new JButton(); panel.add(btnb1);
        btnb1.addActionListener(e -> MyClickEventHandler(e));
        btnb1.setFont(font);

        btnb2 = new JButton(); panel.add(btnb2);
        btnb2.addActionListener(e -> MyClickEventHandler(e));
        btnb2.setFont(font);

        btnb3 = new JButton(); panel.add(btnb3);
        btnb3.addActionListener(e -> MyClickEventHandler(e));
        btnb3.setFont(font);

        btnc1 = new JButton(); panel.add(btnc1);
        btnc1.addActionListener(e -> MyClickEventHandler(e));
        btnc1.setFont(font);

        btnc2 = new JButton(); panel.add(btnc2);
        btnc2.addActionListener(e -> MyClickEventHandler(e));
        btnc2.setFont(font);

        btnc3 = new JButton(); panel.add(btnc3);
        btnc3.addActionListener(e -> MyClickEventHandler(e));
        btnc3.setFont(font);
        

        setJMenuBar(menubar);//adding a menu bar


        JMenu gameOptions = new JMenu("Game Options");
        menubar.add(gameOptions);

        JMenuItem resetGame = new JMenuItem("Reset the game");
        gameOptions.add(resetGame);
        resetGame.addActionListener(e -> resetGame());

        JMenu otherOptions = new JMenu("Other options");
        menubar.add(otherOptions);

        setSize(400,400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void resetGame()
    {
        currentPlayer="x";
        btna1.setText(""); btna1.setBackground(null); btna1.setEnabled(true);
        btna2.setText(""); btna2.setBackground(null); btna2.setEnabled(true);
        btna3.setText(""); btna3.setBackground(null); btna3.setEnabled(true);
        btnb1.setText(""); btnb1.setBackground(null); btnb1.setEnabled(true);
        btnb2.setText(""); btnb2.setBackground(null); btnb2.setEnabled(true);
        btnb3.setText(""); btnb3.setBackground(null); btnb3.setEnabled(true);
        btnc1.setText(""); btnc1.setBackground(null); btnc1.setEnabled(true);
        btnc2.setText(""); btnc2.setBackground(null); btnc2.setEnabled(true);
        btnc3.setText(""); btnc3.setBackground(null); btnc3.setEnabled(true);
    }
    public void MyClickEventHandler(ActionEvent e)
    {
        JButton btn =(JButton) e.getSource();
        btn.setText(currentPlayer);
        if(currentPlayer.equals("x"))
            btn.setBackground(Color.RED);
        else
            btn.setBackground(Color.GREEN);
        
    
        btn.setEnabled(false);
        //btn.setFont(font);
        
        //check for winner
        if(checkForWinner())
        {
            //display a congratulations message
            JOptionPane.showMessageDialog(null, "We have a winner! " + currentPlayer+ " wins!");
            //disable all buttons
            btna1.setEnabled(false);
            btna2.setEnabled(false);
            btna3.setEnabled(false);
            btnb1.setEnabled(false);
            btnb2.setEnabled(false);
            btnb3.setEnabled(false);
            btnc1.setEnabled(false);
            btnc2.setEnabled(false);
            btnc3.setEnabled(false);
        }

        switchPlayer();
    }

    public boolean checkForWinner()
    {
        //check first row
        if(btna1.getText().equals(currentPlayer)
         && btna2.getText().equals(currentPlayer)
         && btna3.getText().equals(currentPlayer)  )
         return true;

         //check the second row
         if(btnb1.getText().equals(currentPlayer)
         && btnb2.getText().equals(currentPlayer)
         && btnb3.getText().equals(currentPlayer)  )
         return true;

         //check third row
         if(btnc1.getText().equals(currentPlayer)
         && btnc2.getText().equals(currentPlayer)
         && btnc3.getText().equals(currentPlayer)  )
         return true;


         //check first column
         if(btna1.getText().equals(currentPlayer)
         && btnb1.getText().equals(currentPlayer)
         && btnc1.getText().equals(currentPlayer)  )
        return true;
    
        //check second column
         if(btna2.getText().equals(currentPlayer)
         && btnb2.getText().equals(currentPlayer)
         && btnc2.getText().equals(currentPlayer)  )
        return true;

        //check third column
        if(btna3.getText().equals(currentPlayer)
        && btnb3.getText().equals(currentPlayer)
        && btnc3.getText().equals(currentPlayer)  )
       return true;

        //check first diagonal
        if(btna1.getText().equals(currentPlayer)
        && btnb2.getText().equals(currentPlayer)
        && btnc3.getText().equals(currentPlayer)  )
        return true;

                //check second diagonal
                if(btna3.getText().equals(currentPlayer)
                && btnb2.getText().equals(currentPlayer)
                && btnc1.getText().equals(currentPlayer)  )
                return true;
        //all other cases
        return false;
    }
    public void switchPlayer()
    {
        if(currentPlayer.equals("x"))
        {
            currentPlayer = "o";
        }
        else
        {
            currentPlayer="x";
        }
    }
}
