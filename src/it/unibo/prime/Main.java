package it.unibo.prime;

import it.unibo.prime.controller.PrimeController;
import it.unibo.prime.model.PrimeModel;
import it.unibo.prime.view.PrimeView;
import it.unibo.prime.view.PrimeViewImpl;

public class Main {

    public static void main(String[] args) {
        PrimeModel model = new PrimeModel();
        PrimeView view = new PrimeViewImpl();
        new PrimeController(model, view);
        view.display();
    }
}
