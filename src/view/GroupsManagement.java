package view;

import view.BaseFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mikes on 24.09.2016.
 */
public class GroupsManagement extends BaseFrame {
    public GroupsManagement() {
        /*

        */
        super("Управление группами", false);

        JPanel mathPanel = new JPanel();
        JPanel physPanel = new JPanel();
        JPanel russianPanel = new JPanel();

        JLabel mathLabel = new JLabel();
        mathLabel.setPreferredSize(new Dimension(70, 50));
        mathLabel.setBackground(Color.black);
        mathLabel.setText("Математика");
        mathPanel.add(mathLabel);

        JLabel physLabel = new JLabel();
        physLabel.setPreferredSize(new Dimension(70, 50));
        //physPanel.setLayout(new BoxLayout());
        physLabel.setBackground(Color.black);
        physLabel.setText("    Физика  ");
        physPanel.add(physLabel);

        JLabel russianLabel = new JLabel();
        russianLabel.setPreferredSize(new Dimension(100, 50));
        russianLabel.setBackground(Color.black);
        russianLabel.setText("  Русский язык");
        russianPanel.add(russianLabel);


        mathPanel.setBackground(Color.WHITE);
        physPanel.setBackground(Color.BLUE);
        russianPanel.setBackground(Color.RED);

        //------------------------------------------------

        JButton ma1Button = new JButton("MA1");
        ma1Button.setPreferredSize(new Dimension(400, 50));
        ma1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(ma1Button.getText());
            }
        });

        JButton ma2Button = new JButton("MA2");
        ma2Button.setPreferredSize(new Dimension(400, 50));
        ma2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(ma2Button.getText());
            }
        });

        JButton mbButton = new JButton("MB");
        mbButton.setPreferredSize(new Dimension(400, 50));
        mbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mbButton.getText());
            }
        });

        JButton mcButton = new JButton("MC");
        mcButton.setPreferredSize(new Dimension(400, 50));
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mcButton.getText());
            }
        });

        JButton msButton = new JButton("MS");
        msButton.setPreferredSize(new Dimension(400, 50));
        msButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(msButton.getText());
            }
        });
        JButton moButton = new JButton("MO");
        moButton.setPreferredSize(new Dimension(400, 50));
        moButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(moButton.getText());
            }
        });
        JButton mo2Button = new JButton("MO2");
        mo2Button.setPreferredSize(new Dimension(400, 50));
        mo2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mo2Button.getText());
            }
        });

        mathPanel.add(ma1Button);
        mathPanel.add(ma2Button);
        mathPanel.add(mbButton);
        mathPanel.add(mcButton);
        mathPanel.add(msButton);
        mathPanel.add(moButton);
        mathPanel.add(mo2Button);

        //------------------------------------------------

        JButton fa1Button = new JButton("ФА1");
        fa1Button.setPreferredSize(new Dimension(400, 50));
        fa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fa1Button.getText());
            }
        });
        JButton fa2Button = new JButton("ФА2");
        fa2Button.setPreferredSize(new Dimension(400, 50));
        fa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fa2Button.getText());
            }
        });
        JButton fb1Button = new JButton("ФВ1");
        fb1Button.setPreferredSize(new Dimension(400, 50));
        fb1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fb1Button.getText());
            }
        });
        JButton fc1Button = new JButton("ФС1");
        fc1Button.setPreferredSize(new Dimension(400, 50));
        fc1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fc1Button.getText());
            }
        });
        JButton fr1Button = new JButton("ФР1");
        fr1Button.setPreferredSize(new Dimension(400, 50));
        fr1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fr1Button.getText());
            }
        });
        JButton fr2Button = new JButton("ФР2");
        fr2Button.setPreferredSize(new Dimension(400, 50));
        fr2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fr2Button.getText());
            }
        });

        physPanel.add(fa1Button);
        physPanel.add(fa2Button);
        physPanel.add(fb1Button);
        physPanel.add(fc1Button);
        physPanel.add(fr1Button);
        physPanel.add(fr2Button);

        //------------------------------------------------

        JButton rusButton = new JButton("РУС");
        rusButton.setPreferredSize(new Dimension(400, 50));
        rusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(rusButton.getText());
            }
        });
        russianPanel.add(rusButton);

        //------------------------------------------------

        this.setLayout(new GridLayout());
        this.add(mathPanel);
        this.add(physPanel);
        this.add(russianPanel);
        this.setVisible(true);
    }
}
