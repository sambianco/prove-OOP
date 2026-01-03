package it.unibo.prime.view;

import it.unibo.prime.controller.PrimeController;
import java.awt.Color;

public interface PrimeView {

    void setController(PrimeController c);

    String getInput();

    void setResult(String text, Color color);

    void display();

}
