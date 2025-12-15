import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    private final JPanel jp;

    public MyFrame(String title, LayoutManager lm) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.jp = new JPanel(lm);
        this.getContentPane().add(jp);
    }

    public JPanel getMainPanel(){
        return this.jp;
    }
}
