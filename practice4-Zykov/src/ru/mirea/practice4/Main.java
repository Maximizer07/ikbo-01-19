package ru.mirea.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton MilanButton=new JButton("Ac Milan");
    private JButton MadridButton=new JButton("Real Madrid");
    private JLabel scorer=new JLabel("Last Scorer:");
    private JLabel result=new JLabel("Result 0 X 0");
    private JLabel winner =new JLabel("Winner");
    public Main()  {
        setSize(new Dimension(600, 200));
        MilanButton.setBounds(0,100,300,40);
        MadridButton.setBounds(300,100,300,40);
        result.setBounds(10,50,200,20);
        winner.setBounds(250,50,200,20);
        scorer.setBounds(400,50,200,20);
        final int[] a = {0};
        final int[] b = {0};
        MilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a[0]++;
                scorer.setText("Last Scorer: Milan");
                result.setText("Result " + a[0] + " X " + b[0]);
                if (a[0] > b[0]) {
                    winner.setText("Winner: Milan");
                }
                if (a[0] < b[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (a[0] == b[0]) {
                    winner.setText("Winner: Draw");
                }
            }
        });
        MadridButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b[0]++;
                scorer.setText("Last Scorer: Real Madrid");
                result.setText("Result " + a[0] + " X " + b[0]);
                if (a[0] > b[0]) {
                    winner.setText("Winner: Milan");
                }
                if (a[0] < b[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (a[0] == b[0]) {
                    winner.setText("Winner: Draw");
                }

            }
        });
        setLayout(null);
        this.getContentPane().add(MadridButton);
        this.getContentPane().add(MilanButton);
        this.getContentPane().add(scorer);
        this.getContentPane().add(winner);
        this.getContentPane().add(result);
    }
    public static void main(String arg[])
    {
        new Main().setVisible(true);
    }
}
