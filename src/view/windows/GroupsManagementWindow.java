package view.windows;

import view.windows.BaseFrame;
import view.windows.GroupWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mikes on 24.09.2016.
 */
public class GroupsManagementWindow extends BaseFrame {
    private String fontName = "Times New Roman";
    private int fonrType = 2;
    private int fontSize = 25;
    private Font elementFont = new Font(fontName, fonrType, fontSize);

    public GroupsManagementWindow() {
        super("Управление группами", false);

        JPanel mathPanel = new JPanel();
        JPanel physPanel = new JPanel();
        JPanel russianPanel = new JPanel();

        JLabel mathLabel = new JLabel("    Математика");
        JLabel physLabel = new JLabel("        Физика  ");
        JLabel russianLabel = new JLabel("    Русский язык");

        JButton ma1Button = new JButton("MA1");
        JButton ma2Button = new JButton("MA2");
        JButton mbButton = new JButton("MB");
        JButton mcButton = new JButton("MC");
        JButton msButton = new JButton("MS");
        JButton moButton = new JButton("MO");
        JButton mo2Button = new JButton("MO2");

        JButton fa1Button = new JButton("ФА1");
        JButton fa2Button = new JButton("ФА2");
        JButton fb1Button = new JButton("ФВ1");
        JButton fc1Button = new JButton("ФС1");
        JButton fr1Button = new JButton("ФР1");
        JButton fr2Button = new JButton("ФР2");

        JButton rusButton = new JButton("РУС");

        mathLabel.setBackground(Color.black);
        physLabel.setBackground(Color.black);
        russianLabel.setBackground(Color.black);
        mathPanel.setBackground(Color.WHITE);
        physPanel.setBackground(Color.BLUE);
        russianPanel.setBackground(Color.RED);

        mathLabel.setPreferredSize(new Dimension(200, 50));
        physLabel.setPreferredSize(new Dimension(180, 55));
        russianLabel.setPreferredSize(new Dimension(180, 50));
        ma1Button.setPreferredSize(new Dimension(400, 50));
        ma2Button.setPreferredSize(new Dimension(400, 50));
        mbButton.setPreferredSize(new Dimension(400, 50));
        mcButton.setPreferredSize(new Dimension(400, 50));
        msButton.setPreferredSize(new Dimension(400, 50));
        moButton.setPreferredSize(new Dimension(400, 50));
        mo2Button.setPreferredSize(new Dimension(400, 50));
        fa1Button.setPreferredSize(new Dimension(400, 50));
        fa2Button.setPreferredSize(new Dimension(400, 50));
        fb1Button.setPreferredSize(new Dimension(400, 50));
        fc1Button.setPreferredSize(new Dimension(400, 50));
        fr1Button.setPreferredSize(new Dimension(400, 50));
        fr2Button.setPreferredSize(new Dimension(400, 50));
        rusButton.setPreferredSize(new Dimension(400, 50));

        mathLabel.setFont(elementFont);
        physLabel.setFont(elementFont);
        russianLabel.setFont(elementFont);
        ma1Button.setFont(elementFont);
        ma2Button.setFont(elementFont);
        mbButton.setFont(elementFont);
        mcButton.setFont(elementFont);
        msButton.setFont(elementFont);
        moButton.setFont(elementFont);
        mo2Button.setFont(elementFont);
        fa1Button.setFont(elementFont);
        fa2Button.setFont(elementFont);
        fb1Button.setFont(elementFont);
        fc1Button.setFont(elementFont);
        fr1Button.setFont(elementFont);
        fr2Button.setFont(elementFont);
        rusButton.setFont(elementFont);

        ma1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(ma1Button.getText());
            }
        });
        ma2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(ma2Button.getText());
            }
        });
        mbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mbButton.getText());
            }
        });
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mcButton.getText());
            }
        });
        msButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(msButton.getText());
            }
        });
        moButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(moButton.getText());
            }
        });
        mo2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(mo2Button.getText());
            }
        });

        fa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fa1Button.getText());
            }
        });
        fa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fa2Button.getText());
            }
        });
        fb1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fb1Button.getText());
            }
        });
        fc1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fc1Button.getText());
            }
        });
        fr1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fr1Button.getText());
            }
        });
        fr2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(fr2Button.getText());
            }
        });

        rusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupWindow(rusButton.getText());
            }
        });

        this.setLayout(new GridLayout());
        this.add(mathPanel);
        this.add(physPanel);
        this.add(russianPanel);

        mathPanel.add(mathLabel);
        physPanel.add(physLabel);

        mathPanel.add(ma1Button);
        mathPanel.add(ma2Button);
        mathPanel.add(mbButton);
        mathPanel.add(mcButton);
        mathPanel.add(msButton);
        mathPanel.add(moButton);
        mathPanel.add(mo2Button);

        physPanel.add(fa1Button);
        physPanel.add(fa2Button);
        physPanel.add(fb1Button);
        physPanel.add(fc1Button);
        physPanel.add(fr1Button);
        physPanel.add(fr2Button);

        russianPanel.add(russianLabel);
        russianPanel.add(rusButton);

        this.setVisible(true);
    }
}
