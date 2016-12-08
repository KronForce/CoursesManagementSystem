package view.windows;

import view.elements.GroupWindowElement;
import view.windows.BaseFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mikes on 25.09.2016.
 */
//todo ЗАДАЧА для класса GroupWindow создать класс, объекты которого будут элементами окна (графическим представлением строк из бд с управляющими кнопками). Структуру взять из прототипа на C#
//todo ЗАДАЧА сделать CRUD на базе SQLite, добавить/удалить студента в общий список. Подгрузка списка учащихся в группах из общего списка студентов
public class GroupWindow extends BaseFrame {
    public GroupWindow(String groupName) {
        //При открытии этого окна, берем имя группы, делаем запрос в бд, оттуда приходят данные (выборка-таблица студентов), тут их парсим, записываем в коллекцию,
        //а коллекцию уже скармливаем на вход классу, отвечающему за графическое представление (JLabel + ... + JButton + JButton)
        //todo ПРИЧЕСЫВАНИЕ сделать так, чтобы шапка оставалась при прокрутке списка сдудентов, например путем выноса ее в отдельный JPanel
        super(groupName, false);

        JPanel groupPanel = new JPanel();
        groupPanel.setLayout(new BoxLayout(groupPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(groupPanel);

        groupPanel.add(new GroupWindowElement());
        this.add(scrollPane);
        this.setVisible(true);
    }
}
