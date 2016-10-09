package view;

import view.BaseFrame;
import view.GroupsManagement;
import view.StudentsManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mikes on 23.09.2016.
 * Этот класс отвечает за окно основного меню.
 */
public class MainMenu extends BaseFrame {
    public MainMenu() {
        // todo добавить градиент, раздел настроек для персонализации, создания/управления резервными копиями, добавить логин/пароль для защиты от нсд.
        // todo проработать вариант взаимодействия с расписанием для формирования повестки дня, TODO-листов, напоминаний и уведомлений
        // todo проработать взаимодействие с сокетами для приема/передачи информации на удаленный лог-сервер и бэкап сервер, либо пока остановиться на локальном варианте
        super("СУ Курсами", true);
//-----------------------------------------------------------------------------------------
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);
//-----------------------------------------------------------------------------------------
        JButton groupsManagementButton = new JButton("Управление группами");
        groupsManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupsManagement();
            }
        });
        //
        groupsManagementButton.setBounds(330,190,700,100);
        groupsManagementButton.setFont(new java.awt.Font("Arial",2,40));
        //
        jPanel.add(groupsManagementButton);
//-----------------------------------------------------------------------------------------
        JButton studentsManagementButton = new JButton("Управление студентами");
        studentsManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentsManagement();
            }
        });
        //
        studentsManagementButton.setBounds(330,310,700,100);
        studentsManagementButton.setFont(new java.awt.Font("Arial",2,40));
        //
        jPanel.add(studentsManagementButton);
//-----------------------------------------------------------------------------------------
        this.setVisible(true);
    }
}