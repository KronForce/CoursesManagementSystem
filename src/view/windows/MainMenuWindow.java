package view.windows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mikes on 23.09.2016.
 * Этот класс отвечает за окно основного меню.
 */
public class MainMenuWindow extends BaseFrame {
    public MainMenuWindow() {

        super("СУ Курсами", true);
//-----------------------------------------------------------------------------------------
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);
        //jPanel.setBackground(Color.YELLOW);
        int fontSize = 40;
        int fontType = 2;
        String fontName = "Times New Roman";
//-----------------------------------------------------------------------------------------
        JButton groupsManagementButton = new JButton("Управление группами"); //в дальнейшем станет Группы
        groupsManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupsManagementWindow();
            }
        });
        //
        groupsManagementButton.setBounds(330,190,700,100);
        groupsManagementButton.setFont(new java.awt.Font(fontName,fontType,fontSize));
        //
        jPanel.add(groupsManagementButton);
//-----------------------------------------------------------------------------------------
        JButton studentsManagementButton = new JButton("Управление студентами"); //в дальнейшем станет Студенты
        studentsManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new  StudentsManagementWindow();
            }
        });
        //
        studentsManagementButton.setBounds(330,310,700,100);
        studentsManagementButton.setFont(new java.awt.Font(fontName,fontType,fontSize));
        //
        jPanel.add(studentsManagementButton);
//-----------------------------------------------------------------------------------------
        this.setVisible(true);
    }
}
// todo ПРИЧЕСЫВАНИЕ добавить градиент, раздел настроек для персонализации, создания/управления резервными копиями, добавить логин/пароль для защиты от нсд.
// todo ПРИЧЕСЫВАНИЕ проработать вариант взаимодействия с расписанием для формирования повестки дня, TODO-листов, напоминаний и уведомлений
// todo ПРИЧЕСЫВАНИЕ проработать взаимодействие с сокетами для приема/передачи информации на удаленный лог-сервер и бэкап сервер, либо пока остановиться на локальном варианте