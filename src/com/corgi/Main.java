package com.corgi;

import com.corgi.window.CorgiWindow;
import com.corgi.window.Tray;

import java.awt.*;
public class Main {

    public static void main(String[] args) throws AWTException {
        Tray.CreateTrayIcon();
        CorgiWindow.setFrame();
        }
    }
