import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game - Reza 5025241051");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // Menyesuaikan ukuran frame dengan isi panel
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}