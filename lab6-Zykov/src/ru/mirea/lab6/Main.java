package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton buttonCancel;
    private JButton tryButton= new JButton("Угадать");
    private JButton Exit= new JButton("Выход");
    private JTextField textField1=new JTextField(0);

    private  JLabel result= new JLabel("Угадайте загаданное число, у вас есть 3 попытки", SwingConstants.CENTER);
    int b = (int) (Math.random() * 19 + 1);
    int i = 0;
    Main() {
        tryButton.setBounds(0,100,500,20);
        textField1.setBounds(0,70,500,20);
        result.setBounds(0,30,500,20);
        Exit.setBounds(0,120,500,20);
        setSize(new Dimension(500, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        setVisible(true);
        int b =(int) (Math.random() * 19 + 1);
        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                i++;
                int a = Integer.parseInt(textField1.getText());
                if (a == b) {
                    result.setText("Вы угадали поздравляю!");
                    tryButton.setVisible(false);
                } else {
                    if (a > b) {
                        result.setText("Загаданное число меньше вашего, Осталось " + (3 - i) + " попыток ");
                    } else {
                        result.setText("Загаданное число больше вашего, Осталось " + (3 - i) + " попыток ");
                    }
                }
                if (i == 3 && a!=b) {
                    result.setText("Вы не угадали. Загаданное число " + b);
                    tryButton.setVisible(false);
                }
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        setLayout(null);
        this.getContentPane().add(Exit);
        this.getContentPane().add(tryButton);
        this.getContentPane().add(textField1);
        this.getContentPane().add(result);
    }
    public static void main(String arg[]) {

        new Main().setVisible(true);
    }


}
