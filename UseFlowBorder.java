import java.awt.*;
import javax.swing.*;

public class UseFlowBorder {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Flow Border", new BorderLayout());

        final JPanel panelNorth = new JPanel(new FlowLayout());
        panelNorth.add(new JButton("OK"));
        panelNorth.add(new JButton("Cancel"));

        final JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelRight.add(new JButton("Yes"));
        panelRight.add(new JButton("No"));

        frame.getMainPanel().add(panelNorth, BorderLayout.NORTH);
        frame.getMainPanel().add(panelRight, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
