package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mikes on 24.09.2016.
 */
public class StudentsManagement extends BaseFrame {
    public StudentsManagement() {
        //При открытии этого окна, делаем запрос в бд, оттуда приходят данные (выборка-таблица студентов), тут их парсим, записываем в коллекцию,
        //а коллекцию уже скармливаем на вход классу, отвечающему за графическое представление (JLabel + ... + JButton + JButton)
        super("Управление студентами", false);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(jPanel);

        //for(int i = 0; i < 100; i++)
        //    jPanel.add(new JPanel());
        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.WHITE);
        jPanel2.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel3= new JPanel();
        jPanel3.setBackground(Color.DARK_GRAY);
        jPanel3.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(Color.WHITE);
        jPanel4.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.DARK_GRAY);
        jPanel5.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel6 = new JPanel();
        jPanel6.setBackground(Color.WHITE);
        jPanel6.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel7 = new JPanel();
        jPanel7.setBackground(Color.DARK_GRAY);
        jPanel7.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel8 = new JPanel();
        jPanel8.setBackground(Color.WHITE);
        jPanel8.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel11 = new JPanel();
        jPanel11.setBackground(Color.DARK_GRAY);
        jPanel11.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel12 = new JPanel();
        jPanel12.setBackground(Color.WHITE);
        jPanel12.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel13= new JPanel();
        jPanel13.setBackground(Color.DARK_GRAY);
        jPanel13.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel14 = new JPanel();
        jPanel14.setBackground(Color.WHITE);
        jPanel14.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel15 = new JPanel();
        jPanel15.setBackground(Color.DARK_GRAY);
        jPanel15.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel16 = new JPanel();
        jPanel16.setBackground(Color.WHITE);
        jPanel16.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel17 = new JPanel();
        jPanel17.setBackground(Color.DARK_GRAY);
        jPanel17.setPreferredSize(new Dimension(1000, 70));

        JPanel jPanel18 = new JPanel();
        jPanel18.setBackground(Color.WHITE);
        jPanel18.setPreferredSize(new Dimension(1000, 70));

        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        jPanel.add(jPanel3);
        jPanel.add(jPanel4);
        jPanel.add(jPanel5);
        jPanel.add(jPanel6);
        jPanel.add(jPanel7);
        jPanel.add(jPanel8);

        jPanel.add(jPanel11);
        jPanel.add(jPanel12);
        jPanel.add(jPanel13);
        jPanel.add(jPanel14);
        jPanel.add(jPanel15);
        jPanel.add(jPanel16);
        jPanel.add(jPanel17);
        jPanel.add(jPanel18);

        this.add(scrollPane);
        this.setVisible(true);
    }
}
