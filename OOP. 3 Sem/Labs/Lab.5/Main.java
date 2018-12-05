package ru.mirea;

import java.awt.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Main {
    public static void main(String avg[]) throws IOException
    {
        Main abc = new Main();
    }

    public Main() throws IOException
    {
        Image img= Toolkit.getDefaultToolkit().createImage("src//ru//mirea//gifka.gif");
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(480,600);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
