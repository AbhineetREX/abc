package BrickGame_v01;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        BrickGame_v01.Gameplay gamePlay = new BrickGame_v01.Gameplay();
        JFrame obj = new JFrame();
        obj.setBounds(10, 10, 1280, 768);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        Image background = null;
        //background = ImageIO.read(Main.class.getClassLoader().getResource("imag/bg.jpg"));
    }
}
