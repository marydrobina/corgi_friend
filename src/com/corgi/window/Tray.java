package com.corgi.window;

import com.corgi.Actions;
import com.corgi.Path;

import java.awt.*;

public class Tray {
    public static void CreateTrayIcon() throws AWTException {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();

            PopUpMenu.Create_PopUpMenu();
            Actions.Actions_PopUpMenu();

            tray.add(new TrayIcon(Path.image.getImage(), "Corgi", PopUpMenu.popupMenu));
        }
    }
}
