import javax.swing.*;
import java.awt.*;

public class InitialFrame {

    public static void main(String[] args) {

        //creazione del frame(finestra)
        final JFrame frame = new JFrame();
        frame.setTitle("My frame");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //nuovo pannello
        final JPanel panel = new JPanel();

        //parte dei layout
        panel.setLayout(null);

        //aggiunta pannello a frame
        frame.getContentPane().add(panel);

        final JButton b1 = new JButton("Button 1");
        final JButton b2 = new JButton("Button 2");

        panel.add(b1);
        panel.add(b2);

        //ridimensionamento e posizionamento
        Dimension size = b1.getPreferredSize();
        b1.setBounds(25, 5, size.width, size.height);
        size = b2.getPreferredSize();
        b2.setBounds(55, 40, size.width*3, size.height*3);

        /*
        //parte dei componenti
        String[] strings = new String[]{"bla", "blo", "blu"};
        panel.add(new JButton("Button"));
        panel.add(new JLabel("JLabel"));
        panel.add(new JTextField("JTextField",15));
        panel.add(new JList<String>(strings));
        panel.add(new JComboBox<String>(strings));
        panel.add(new JTextArea(5,10));
        */

       frame.setVisible(true);
    }
}
