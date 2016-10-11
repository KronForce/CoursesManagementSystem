package view.windows;

import model.Student;
import view.elements.StudentsManagementWindowElement;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by mikes on 24.09.2016.
 */
public class StudentsManagementWindow extends BaseFrame {
    //todo сделать так, чтобы шапка оставалась при прокрутке списка сдудентов, например путем выноса ее в отдельный JPanel
    //todo решить вопрос с нумерацией студентов, как вариант путем создания статической переменной COUNT и при инициализации нового элемента передавать в ее в качестве параметра для порядкового номера элемента
    ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements = new ArrayList<>();
    void addStudentsManagementWindowElements(JPanel jpanel, ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements){
        for(StudentsManagementWindowElement studentsManagementWindowElement: studentsManagementWindowElements)
            jpanel.add(studentsManagementWindowElement);
    }
    public StudentsManagementWindow() {
        //При открытии этого окна, делаем запрос в бд, оттуда приходят данные (выборка-таблица студентов), тут их парсим, записываем в коллекцию,
        //а коллекцию уже скармливаем на вход классу, отвечающему за графическое представление (JLabel + ... + JButton + JButton)
        super("Управление студентами", false);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(jPanel);

        //--------------------------------------------------
        StudentsManagementWindowElement studentsManagementWindowElement = new StudentsManagementWindowElement();
        jPanel.add(studentsManagementWindowElement);

        studentsManagementWindowElements.add(new StudentsManagementWindowElement(new Student("Сталин", "Иосиф", "Виссарионович", "MA1", "MR2", "FA1", "FR2", "RUS")));

        addStudentsManagementWindowElements(jPanel,studentsManagementWindowElements);

        //--------------------------------------------------


        this.add(scrollPane);
        this.setVisible(true);
    }
}
