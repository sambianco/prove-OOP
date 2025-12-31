import java.awt.*;
import javax.swing.*;

public class ContatoreBipolare {

    public static void main(String[] args) {
        // Creiamo il frame col BorderLayout principale
        MyFrame frame = new MyFrame("Contatore Bipolare", new BorderLayout());

        // 1. IL NUMERO (Al centro)
        JLabel cont = new JLabel("0");
        cont.setHorizontalAlignment(SwingConstants.CENTER); // Centriamo il testo
        cont.setFont(new Font("Arial", Font.BOLD, 40));   // Facciamolo grosso
        
        // Aggiungiamo al pannello principale del TUO frame
        frame.getMainPanel().add(cont, BorderLayout.CENTER);

        // 2. I BOTTONI (In basso)
        // Creiamo un pannellino apposta per tenere i bottoni vicini
        JPanel pBottoni = new JPanel(new FlowLayout()); 
        
        JButton buttonInc = new JButton("+");
        JButton buttonDec = new JButton("-");
        
        pBottoni.add(buttonInc);
        pBottoni.add(buttonDec);

        // Aggiungiamo il pannellino bottoni a SUD del frame
        frame.getMainPanel().add(pBottoni, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}