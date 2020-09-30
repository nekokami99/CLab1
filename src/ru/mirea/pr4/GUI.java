package ru.mirea.pr4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JButton button3 = new JButton("Reset score");
    JButton button4 = new JButton("Exit");
    JPanel[] pnl = new JPanel[12];
    JLabel score = new JLabel("", JLabel.CENTER);
    JLabel score1 = new JLabel("", JLabel.CENTER);
    JLabel score2 = new JLabel("", JLabel.CENTER);
    JLabel result = new JLabel("");
    JLabel lastScorer = new JLabel("");
    JLabel winner = new JLabel("");
    public int ac=0,rm=0;
    GUI() {
        score.setText("-");
        score.setFont(new Font("Calibri", Font.BOLD, 20));
        score1.setText("0");
        score1.setFont(new Font("Calibri", Font.BOLD, 20));
        score2.setText("0");
        score2.setFont(new Font("Calibri", Font.BOLD, 20));
        result.setText("Result: 0 X 0");
        result.setFont(new Font("Calibri", Font.BOLD, 15));
        lastScorer.setText("Last scorer: N/A");
        lastScorer.setFont(new Font("Calibri", Font.BOLD, 15));
        winner.setText("Winner: DRAW");
        winner.setFont(new Font("Calibri", Font.BOLD, 15));
        setLayout(new GridLayout(4, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.cyan);
            add(pnl[i]);
        }
        //ImageIcon icon1=new ImageIcon("ac1.png");
        JLabel logoAC=new JLabel();
        logoAC.setIcon(new ImageIcon(new ImageIcon("ac1.png").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT)));

        //ImageIcon icon2=new ImageIcon("rm.png");
        JLabel logoRM=new JLabel();
        logoRM.setIcon(new ImageIcon(new ImageIcon("rm.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT)));

        pnl[0].setLayout(new BorderLayout());
        pnl[0].add(logoAC);
        logoAC.setHorizontalAlignment(SwingConstants.CENTER);
        logoAC.setVerticalAlignment(SwingConstants.CENTER);
        pnl[0].add(logoAC,BorderLayout.CENTER);

        pnl[2].setLayout(new BorderLayout());
        pnl[2].add(logoRM);
        logoRM.setHorizontalAlignment(SwingConstants.CENTER);
        logoRM.setVerticalAlignment(SwingConstants.CENTER);
        pnl[2].add(logoRM,BorderLayout.CENTER);

        pnl[3].setLayout(new BorderLayout());
        pnl[3].add(button1, BorderLayout.CENTER);

        pnl[5].setLayout(new BorderLayout());
        pnl[5].add(button2, BorderLayout.CENTER);

        pnl[4].setLayout(new GridLayout(1, 3));
        pnl[4].add(score1, CENTER_ALIGNMENT);
        pnl[4].add(score, CENTER_ALIGNMENT);
        pnl[4].add(score2, CENTER_ALIGNMENT);
        pnl[4].setBackground(Color.lightGray);

        pnl[10].setLayout(new BorderLayout());
        pnl[10].add(button3, BorderLayout.CENTER);
        pnl[10].add(button4, BorderLayout.SOUTH);


        pnl[6].setLayout(new BorderLayout());
        pnl[6].add(lastScorer);
        pnl[9].setLayout(new BorderLayout());
        pnl[9].add(result);

        pnl[11].setLayout(new BorderLayout());
        pnl[11].add(winner);
        String s;
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ac = ac + 1;
                String s=String.valueOf(ac);
                score1.setText(s);
                lastScorer.setText("Last scorer: AC Milan");

                if(ac>rm){
                    winner.setText("Winner: AC Milan");
                    result.setText("Result: "+ac+" x "+rm);
                }
                else if(ac==rm){
                    winner.setText("Winner: Draw");
                    result.setText("Result: "+ac+" x "+rm);
                }
                else{
                    winner.setText("Winner: Real Madrid");
                    result.setText("Result: "+ac+" x "+rm);
                }
                //result.setText("Result: "+String.valueOf(scoreAC));
            }

        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                rm = rm + 1;
                score2.setText(String.valueOf(rm));
                lastScorer.setText("Last scorer: Real Madrid");

                if(ac>rm){
                    winner.setText("Winner: AC Milan");
                    result.setText("Result: "+ac+" x "+rm);
                }
                else if(ac==rm){
                    winner.setText("Winner: Draw");
                    result.setText("Result: "+ac+" x "+rm);
                }
                else{
                    winner.setText("Winner: Real Madrid");
                    result.setText("Result: "+ac+" x "+rm);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac=rm=0;
                score1.setText("0");
                score2.setText("0");
                result.setText("Result: "+ac+" x "+rm);
                lastScorer.setText("Last scorer: N/A");
                winner.setText("Winner: DRAW");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //result.setText("Result: "+score1.getText()+"x"+score2.getText());

        setVisible(true);

    }


    public static void main(String[] args) {

        new GUI().setSize(500, 400);
    }
}
