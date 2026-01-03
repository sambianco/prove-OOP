package it.unibo.prime.view;

import java.awt.*;
import javax.swing.*;

import it.unibo.prime.controller.PrimeController;

public class PrimeViewImpl implements PrimeView {

    // Il guscio della finestra
    private final MyFrame frame;

    // I pezzi della nostra interfaccia
    private final JTextField inputField;
    private final JButton checkButton;
    private final JLabel resultLabel;

    // Il riferimento al regista (Controller)
    private PrimeController controller;

    public PrimeViewImpl() {
        // 1. Inizializziamo il frame con un BorderLayout
        this.frame = new MyFrame("Prime Number Checker", new BorderLayout(10, 10));
        this.frame.setSize(400, 200);

        // 2. Creiamo i componenti grafici
        this.inputField = new JTextField(15);
        this.checkButton = new JButton("Verifica se è Primo!");
        this.resultLabel = new JLabel("Inserisci un numero e premi il tasto", SwingConstants.CENTER);

        // Un po' di stile per la label
        this.resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // 3. Montiamo i pezzi sul pannello principale di MyFrame
        // Usiamo dei pannelli di supporto per non farli sembrare giganti
        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(new JLabel("Numero:"));
        northPanel.add(inputField);

        this.frame.getMainPanel().add(northPanel, BorderLayout.NORTH);
        this.frame.getMainPanel().add(resultLabel, BorderLayout.CENTER);
        this.frame.getMainPanel().add(checkButton, BorderLayout.SOUTH);

        // 4. L'ActionListener: il "colpo di telefono" al Controller
        this.checkButton.addActionListener(e -> {
            if (this.controller != null) {
                // Avvisiamo il controller che l'utente ha cliccato
                this.controller.handleCheck();
            }
        });
    }

    @Override
    public void setController(PrimeController c) {
        this.controller = c;
    }

    @Override
    public String getInput() {
        // Restituiamo quello che l'utente ha scritto nella casella
        return this.inputField.getText();
    }

    @Override
    public void setResult(String text, Color color) {
        // Cambiamo testo e colore della label del risultato
        this.resultLabel.setText(text);
        this.resultLabel.setForeground(color);
    }

    @Override
    public void display() {
        // Rendiamo la finestra visibile
        this.frame.setVisible(true);
    }
}
