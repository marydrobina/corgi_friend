//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Stands {
//    private final String[] imageNames = {"stands_right_1", "stands_right_2"};
//    public static ImageIcon[] images = new ImageIcon[imageNames.length];
//
//    private final String prefix = "com/corgi/assets/stands/";
//    private final String suffix = ".png";
//
//    public static int currentImage = 0;
//    public static int delay = 50;
//    public static ActionListener listener = new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            currentImage = (currentImage + 1) % images.length;
//
//        }
//    };
//
//    public void LogoAnimator() {
//        for (int count = 0; count < images.length; count++) {
//            try {
//                Image image = ImageIO.read(getClass().getResource(prefix + imageNames[count] + suffix));
//                images[count] = new ImageIcon(image);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//        startAnimation();
//    }
//
//    public void startAnimation() {
//        Timer animationTimer = new Timer(delay, listener);
//
//
//
//    }
//}