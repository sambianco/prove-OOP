package it.unibo.prime.controller;

import it.unibo.prime.model.PrimeModel;
import it.unibo.prime.view.PrimeView;
import javax.swing.JOptionPane;
import java.awt.Color;

public class PrimeController {

    private final PrimeModel model;
    private final PrimeView view;

    public PrimeController(PrimeModel model, PrimeView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    public void handleCheck() {
        String input = view.getInput();
        try {
            int num = Integer.parseInt(input.trim()); // trim() toglie spazi vuoti molesti
            boolean isPrime = model.isPrime(num);

            if (isPrime) {
                view.setResult(num + " è un numero primo!", Color.GREEN);
            } else {
                view.setResult(num + " non è un numero primo.", Color.RED);
            }
        } catch (NumberFormatException e) {
            // Feedback visivo sulla label oltre al pop-up
            view.setResult("Errore: input non valido", Color.RED);

            JOptionPane.showMessageDialog(null,
                    "Devi inserire solo numeri interi, non lettere!",
                    "Errore di Input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
