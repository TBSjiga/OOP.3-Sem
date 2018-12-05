package ru.mirea;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    private int Milan = 0;
    private int Madrid = 0;
    public Football()
    {
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel lb1 = new JLabel("Result: 0 X 0");
        JLabel lb2 = new JLabel("Last Scorer: N/A");
        Label lb3 = new Label("Winner: Draw");

        //обработка события нажатия кнопки 1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Milan++;
                String str = "Result: " + Milan+ " X " + Madrid;
                lb1.setText(str);
                str = "Last Scorer: AC Milan";
                lb2.setText(str);
                if (Milan > Madrid){
                    str = "Winner: AC Milan";
                    lb3.setText(str);
                }
            }
        });

        //обработка события нажатия кнопки 2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                String str = "Result: " + Milan + " X " + Madrid;
                lb1.setText(str);
                str = "Last Scorer: Real Madrid";
                lb2.setText(str);
                if (Milan < Madrid){
                    str = "Winner: Real Madrid";
                    lb3.setText(str);
                }
            }
        });

        setLayout(new BorderLayout());

        add(button1,BorderLayout.WEST);
        add(button2,BorderLayout.EAST);
        add(lb3,BorderLayout.SOUTH);
        add(lb2,BorderLayout.NORTH);
        add(lb1,BorderLayout.CENTER);

        setSize(400,300);
    }
}
