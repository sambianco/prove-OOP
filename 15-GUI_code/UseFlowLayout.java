import java.awt.*;
import javax.swing.*;

public class UseFlowLayout{

    public static void main(String[] args) {

        final FlowLayout lay = new FlowLayout(FlowLayout.CENTER);
        final MyFrame frame = new MyFrame("MyFrame", lay);

        frame.getMainPanel().add(new JButton("A"));
        frame.getMainPanel().add(new JButton("B"));
        frame.getMainPanel().add(new JButton("C"));
        frame.getMainPanel().add(new JButton("D"));
        frame.getMainPanel().add(new JButton("E"));
        frame.getMainPanel().add(new JButton("F"));
        frame.getMainPanel().add(new JButton("G"));

        frame.pack(); //ridimensiona il frame per adattarlo ai pulsanti
        frame.setVisible(true);

        //flowlayout mette da sx a dx gli oggetti, va a capo quando non c'è spazio e usa le dimensioni preferite per i bottoni
    }
}