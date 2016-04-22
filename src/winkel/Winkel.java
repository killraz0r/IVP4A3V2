package winkel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Winkel extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame frame = new Winkel();
        frame.setSize(300, 300);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Winkel");

        frame.setContentPane(new WinkelPaneel());
        frame.setVisible(true);
    }
}

class WinkelPaneel extends JPanel
{
    private JTextArea factuurVeld;
    private JButton knop;
    private Bestelling bestelling;
    
    public WinkelPaneel()
    {
        bestelling = new Bestelling();
        
        Artikel art1 = new Artikel(1, "dvd-speler", 59.99);
        bestelling.voegtoe(art1);
        Artikel art2 = new Artikel(2, "webcam", 23.45);
        bestelling.voegtoe(art2);
         Artikel art3 = new Artikel(3, "horloge", 30.00);
        bestelling.voegtoe(art3);
        
        factuurVeld = new JTextArea(10, 25);
        
        knop = new JButton("Bestelling");
        knop.addActionListener(new KnopHandler());
        
        add(factuurVeld);
        add(knop);
    }
    
    class KnopHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            factuurVeld.setText(bestelling.toString());
        }
    }
}
