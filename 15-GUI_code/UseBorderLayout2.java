import java.awt.*;
import javax.swing.*;

public class UseBorderLayout2 {
    public static void main(String[] args) {

        final MyFrame frame = new MyFrame("Myframe", new BorderLayout());

        frame.getMainPanel().add(new JButton("North"),BorderLayout.NORTH);
        frame.getMainPanel().add(new JButton("South"),BorderLayout.SOUTH);
        frame.getMainPanel().add(new JButton("Center"),BorderLayout.CENTER);
        frame.getMainPanel().add(new JButton("EAST"),BorderLayout.EAST);
        frame.getMainPanel().add(new JButton("WEST"),BorderLayout.WEST);

        frame.setVisible(true);
    }
}
