
import java.awt.*;
import javax.swing.*;

public class ContatoreBipolare {

    // Variabile di stato (il nostro "Mini-Model")
    private static int counter = 0;

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Contatore Bipolare", new BorderLayout());

        // 1. LA LABEL (Il Numero)
        JLabel labelContatore = new JLabel("0");
        labelContatore.setHorizontalAlignment(SwingConstants.CENTER);
        labelContatore.setFont(new Font("Arial", Font.BOLD, 60));
        frame.getMainPanel().add(labelContatore, BorderLayout.CENTER);

        // 2. I BOTTONI
        JPanel pBottoni = new JPanel(new FlowLayout());
        JButton buttonInc = new JButton("+");
        JButton buttonDec = new JButton("-");

        // Font più grande anche per i bottoni
        buttonInc.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDec.setFont(new Font("Arial", Font.BOLD, 20));

        pBottoni.add(buttonInc);
        pBottoni.add(buttonDec);
        frame.getMainPanel().add(pBottoni, BorderLayout.SOUTH);

        // 3. LOGICA (ActionListeners)
        // Listener per l'incremento
        buttonInc.addActionListener(e -> {
            counter++;
            updateUI(labelContatore);
        });

        // Listener per il decremento
        buttonDec.addActionListener(e -> {
            counter--;
            updateUI(labelContatore);
        });

        frame.setVisible(true);
    }

    /**
     * Metodo di utility per aggiornare testo e colore della label. Questa è
     * logica di "View Update" comandata dal Controller.
     */
    private static void updateUI(JLabel label) {
        label.setText(String.valueOf(counter));

        if (counter > 0) {
            label.setForeground(new Color(0, 150, 0)); // Verde
        } else if (counter < 0) {
            label.setForeground(Color.RED);           // Rosso
        } else {
            label.setForeground(Color.BLACK);         // Nero
        }
    }
}
