package com.corgi.window;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CorgiPanel extends JPanel {

    private BufferedImage corgiImage;

    public CorgiPanel() {

        setBorder(new EmptyBorder(0, 0, 250, 0));

        try {
            corgiImage = ImageIO.read(getClass().getResource("/com/corgi/assets/stands/corgi.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        setOpaque(false);
        setLayout(new GridBagLayout());

    }

    public Dimension getPreferredSize() {
        return corgiImage == null ? new Dimension(200, 200) : new Dimension(corgiImage.getWidth(), corgiImage.getHeight());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (corgiImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(corgiImage, 0, 0, this);
            g2d.dispose();
        }
    }
}