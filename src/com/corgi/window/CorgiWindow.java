package com.corgi.window;

//import com.corgi.animation.Stands;
import com.corgi.window.CorgiPanel;

import javax.swing.JWindow;
import java.awt.Color;

public class CorgiWindow {
    static JWindow frame = new JWindow();

    public static void setFrame() {

        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setContentPane(new CorgiPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);

    }
}
