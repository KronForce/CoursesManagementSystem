package view.windows;

import model.Student;
import view.elements.StudentsManagementWindowElement;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by mikes on 24.09.2016.
 */
public class StudentsManagementWindow extends BaseFrame {


    //todo ЗАДАЧА решить вопрос с редактированием студентов

    public static ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements = new ArrayList<>();

    public static JPanel jPanel;
    public static JScrollPane scrollPane;

    static void addStudentsManagementWindowElements(JPanel jpanel, ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements) {
        for (StudentsManagementWindowElement studentsManagementWindowElement : studentsManagementWindowElements)
            jpanel.add(studentsManagementWindowElement);
    }

    public StudentsManagementWindow() {
        //При открытии этого окна, делаем запрос в бд, оттуда приходят данные
        // (выборка-таблица студентов), тут их парсим, записываем в коллекцию,
        //а коллекцию уже скармливаем на вход классу, отвечающему за графическое
        // представление (JLabel + ... + JButton + JButton)
        super("Управление студентами", false);
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        scrollPane = new JScrollPane(jPanel);

        //---------------------Добавление шапки-----------------------------
        StudentsManagementWindowElement studentsManagementWindowElement = new StudentsManagementWindowElement();
        jPanel.add(studentsManagementWindowElement);
        //---------------------Добавление студентов из общего списка---------------------
        addStudentsManagementWindowElements(jPanel, studentsManagementWindowElements);
        //-------------------------------------------------------------------------------
        this.add(scrollPane);
        this.setVisible(true);
    }
}
//todo ПРИЧЕСЫВАНИЕ решить вопрос с обновлением информации
//todo ПРИЧЕСЫВАНИЕ сделать так, чтобы шапка оставалась при прокрутке списка сдудентов, например путем выноса ее в отдельный JPanel