package Windows;

import Panels.GamePanel;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("2D Shooter");
        this.setResizable(false);
        this.add(new GamePanel());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
