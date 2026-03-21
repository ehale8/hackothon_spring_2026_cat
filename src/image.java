import javax.swing.*;
import java.awt.*;
public class image extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon image = new ImageIcon("\"C:\\Users\\eviel\\Downloads\\IMG_7900.jpeg\"");
        g.drawImage(image.getImage(), 300, 300, 44, 24, null);

    }
}
