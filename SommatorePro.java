
import java.awt.*;
import javax.swing.*;

public class SommatorePro {

    public static void main(String[] args) {
        final MyFrame frame = new MyFrame("Sommatore Pro", new BorderLayout(10, 10));

        // --- ZONA NORTH: INPUT ---
        final JPanel north = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        final JTextField one = new JTextField(8);
        final JTextField two = new JTextField(8);

        north.add(new JLabel("Num 1:"));
        north.add(one);
        // Uno spazio vuoto per distanziare i campi
        north.add(Box.createHorizontalStrut(10));
        north.add(new JLabel("Num 2:"));
        north.add(two);

        // --- ZONA CENTER: RISULTATO ---
        // TRUCCO: Aggiungiamo la label DIRETTAMENTE al BorderLayout.CENTER
        // senza metterla dentro un altro JPanel, così si centra perfettamente.
        final JLabel mess = new JLabel("Inserisci i numeri e premi calcola", SwingConstants.CENTER);
        mess.setFont(new Font("Arial", Font.BOLD, 18));
        mess.setForeground(Color.DARK_GRAY);

        // --- ZONA SOUTH: AZIONE ---
        final JButton calc = new JButton("Calcola Somma");
        calc.setPreferredSize(new Dimension(200, 40));
        final JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER));
        south.add(calc);

        // Montaggio finale sul pannello principale
        frame.getMainPanel().add(north, BorderLayout.NORTH);
        frame.getMainPanel().add(mess, BorderLayout.CENTER); // Direttamente qui!
        frame.getMainPanel().add(south, BorderLayout.SOUTH);

        // --- LOGICA (L'Action Listener rimane nel Controller) ---
        calc.addActionListener(e -> {
            try {
                String s1 = one.getText();
                String s2 = two.getText();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                int somma = num1 + num2;

                mess.setText("Risultato: " + somma);
                mess.setForeground(new Color(0, 150, 0)); // Verde "successo"

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Devi inserire solo numeri interi, non lettere!",
                        "Errore di Input",
                        JOptionPane.ERROR_MESSAGE);

                mess.setText("Input non valido!");
                mess.setForeground(Color.RED);
            }
        });

        frame.setVisible(true);
    }
}
