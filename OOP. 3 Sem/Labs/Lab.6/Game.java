package ru.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private int count = 0;

    JTextField jta_1 = new JTextField(10);
    JButton button_1 = new JButton("Ввести значение");
    Font font = new Font("Times new roman", Font.BOLD, 100);

    public void onButtonClick(int rand, int a, int b){
        count++;
        if (count >= 3){
            JOptionPane.showMessageDialog(null, "Вы проиграли, хотите сыграть еще раз?");
            rand = a + (int) (Math.random() * b);
            count = 0;
        }
    }

    Game() {
        super("Игра");
        setLayout(new FlowLayout());
        setSize(400, 200);
        add(new Label("Число"));
        add(jta_1);
        jta_1.setText("");
        add(button_1);

        int rand, a = 0, b = 20, count = 3;
        rand = a + (int) (Math.random() * b);
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int txt = Integer.parseInt(jta_1.getText());
                if (rand != txt) {
                    if (rand < txt) {
                        JOptionPane.showMessageDialog(null, "Введеное число меньше");
                    } else {
                        JOptionPane.showMessageDialog(null, "Введеное число больше");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Вы угадали число");
                }
                onButtonClick(rand, a, b);
            }
        });
    }
}
