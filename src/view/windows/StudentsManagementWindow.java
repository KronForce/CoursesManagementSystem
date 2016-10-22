package view.windows;

import model.Student;
import view.elements.StudentsManagementWindowElement;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by mikes on 24.09.2016.
 */
public class StudentsManagementWindow extends BaseFrame {

    //todo ЗАДАЧА решить вопрос с нумерацией студентов, как вариант путем создания статической переменной COUNT и при инициализации нового элемента передавать в ее в качестве параметра для порядкового номера элемента
    //todo ЗАДАЧА решить вопрос с редактированием студентов
    //todo ЗАДАЧА решить вопрос с обновлением информации


    public static ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements = new ArrayList<>();

    public static JPanel jPanel;
    public static JScrollPane scrollPane;
//    public static void repaint1(){
//        System.out.println("Вызван метод REPAINT!");
////       StudentsManagementWindow.jPanel.repaint();
//       StudentsManagementWindow.scrollPane.revalidate();
//    }
    static void addStudentsManagementWindowElements(JPanel jpanel, ArrayList<StudentsManagementWindowElement> studentsManagementWindowElements){
        for(StudentsManagementWindowElement studentsManagementWindowElement: studentsManagementWindowElements)
            jpanel.add(studentsManagementWindowElement);
    }
    public StudentsManagementWindow() {
        //При открытии этого окна, делаем запрос в бд, оттуда приходят данные (выборка-таблица студентов), тут их парсим, записываем в коллекцию,
        //а коллекцию уже скармливаем на вход классу, отвечающему за графическое представление (JLabel + ... + JButton + JButton)
        super("Управление студентами", false);
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        scrollPane = new JScrollPane(jPanel);

        //--------------------------------------------------
        StudentsManagementWindowElement studentsManagementWindowElement = new StudentsManagementWindowElement();
        jPanel.add(studentsManagementWindowElement);

        //studentsManagementWindowElements.add(new StudentsManagementWindowElement(new Student("Сталин", "Иосиф", "Виссарионович", "MA1", "MR2", "FA1", "FR2", "RUS")));
//        jPanel.removeAll();
        addStudentsManagementWindowElements(jPanel,studentsManagementWindowElements);
//        repaint1();
        //--------------------------------------------------
        //for(StudentsManagementWindowElement s:studentsManagementWindowElements){
            //studentsManagementWindowElements.size();
        //}

        this.add(scrollPane);
        this.setVisible(true);
    }
}
//todo ПРИЧЕСЫВАНИЕ сделать так, чтобы шапка оставалась при прокрутке списка сдудентов, например путем выноса ее в отдельный JPanel