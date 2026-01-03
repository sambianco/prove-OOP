package it.unibo.prime.model;

import it.unibo.prime.controller.PrimeController;

public class PrimeModel {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // 2. Il numero 2 è l'unico numero primo pari
        if (n == 2) {
            return true;
        }
        // 3. I numeri pari maggiori di 2 non sono primi
        if (n % 2 == 0) {
            return false;
        }

        // 4. Ciclo ottimizzato: verifica i divisori dispari da 3 fino alla radice quadrata di n
        // Se n è divisibile per un numero `i`, non è primo.
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Trovato un divisore, non è primo
            }
        }

        // 5. Se nessun divisore è stato trovato, il numero è primo
        return true;
    }
}
