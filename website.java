// Function to toggle navigation menu on small screens
function toggleMenu() {
  var nav = document.querySelector('nav');
  nav.classList.toggle('active');
}

// Add event listener to the menu button
var menuButton = document.getElementById('menu-button');
menuButton.addEventListener('click', toggleMenu);

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlantingAnimation extends JPanel implements ActionListener {
    private int xPosition = 0;
    private Timer timer;

    public PlantingAnimation() {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the ground
        g2d.setColor(new Color(119, 221, 119));
        g2d.fillRect(0, getHeight() - 50, getWidth(), 50);

        // Draw the person
        g2d.setColor(Color.BLUE);
        g2d.fillOval(xPosition, getHeight() - 100, 40, 40);
        g2d.fillRect(xPosition + 10, getHeight() - 60, 20, 60);

        // Draw the seed
        g2d.setColor(Color.ORANGE);
        g2d.fillOval(xPosition + 5, getHeight() - 130, 10, 10);

        // Draw the plant
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillRect(xPosition + 10, getHeight() - 200, 20, 100);

        // Draw the leaves
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillOval(xPosition - 20, getHeight() - 220, 60, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xPosition += 1;
        if (xPosition > getWidth()) {
            xPosition = -50;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Planting Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);

        PlantingAnimation animation = new PlantingAnimation();
        frame.add(animation);

        frame.setVisible(true);
    }
}
