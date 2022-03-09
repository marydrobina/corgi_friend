package com.corgi.window;

import java.awt.*;

public class PopUpMenu {
    public static PopupMenu popupMenu = new PopupMenu();
    public static void Create_PopUpMenu() {
        popupMenu.add(MenuItems.create_corgi);
        popupMenu.add(MenuItems.exit);
    }
}
