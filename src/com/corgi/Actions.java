package com.corgi;

import com.corgi.window.MenuItems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions {

    public static void Actions_PopUpMenu() {
        MenuItems.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
