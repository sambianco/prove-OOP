
import java.awt.*;
import javax.swing.*;

public class ContatoreBipolare {

    public static void main(String[] args) {

        JFrame frame = new MyFrame("Contatore Bipolare", new BorderLayout());

        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        frame.getContentPane().add(jp, BorderLayout.EAST);

        JLabel cont = new JLabel();
        frame.getContentPane().add(cont, BorderLayout.CENTER);

        JButton buttonInc = new JButton("+");
        JButton buttonDec = new JButton("-");
        jp.add(buttonInc, FlowLayout.CENTER);
        jp.add(buttonDec, FlowLayout.CENTER);

        frame.setVisible(true);
    }
}
