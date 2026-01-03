import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UseBordeLayout {
    public static void main(String[] args) {
        //creazione del frame(finestra)
        final JFrame frame = new JFrame();
        frame.setTitle("My frame");
        frame.setSize(320,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //nuovo pannello
        final JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        //aggiunta pannello a frame
        frame.getContentPane().add(panel);

        final JButton b1 = new JButton("button 1");
        final JButton b2 = new JButton("button 2");
        final JButton b3 = new JButton("button 3");
        final JButton b4 = new JButton("button 4");
        final JButton b5 = new JButton("button 5");

        panel.add(b1, BorderLayout.NORTH);
        panel.add(b2, BorderLayout.SOUTH);
        panel.add(b3, BorderLayout.EAST);
        panel.add(b4, BorderLayout.WEST);
        panel.add(b5, BorderLayout.CENTER);

        

        frame.setVisible(true);
    }
} 