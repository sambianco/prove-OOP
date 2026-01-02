
import java.awt.*;
import javax.swing.*;

public class SommatorePro {

    public static void main(String[] args) {

        final JFrame frame = new MyFrame("SommatorePro", new BorderLayout());

        final JPanel north = new JPanel(new FlowLayout());

        final JLabel numOne = new JLabel("Num 1:");
        final JLabel numTwo = new JLabel("Num 2:");
        final JTextField one = new JTextField();
        final JTextField two = new JTextField();

        north.add(numOne);
        north.add(one);
        north.add(numTwo);
        north.add(two);

        final JPanel center = new JPanel(new FlowLayout());
        final JLabel mess = new JLabel("Inserisci i numeri e premi calcola");
        center.add(mess, FlowLayout.CENTER);

        final JPanel south = new JPanel(new FlowLayout());
        final JButton calc = new JButton("Calcola Somma");
        south.add(calc, FlowLayout.CENTER);

        frame.getContentPane().add(north, BorderLayout.NORTH);
        frame.getContentPane().add(center, BorderLayout.CENTER);
        frame.getContentPane().add(south, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
}
