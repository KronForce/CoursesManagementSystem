package view.elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Student;
import view.windows.CreateStudentWindow;
import view.windows.EditStudentWindow;

/**
 * Created by Miike on 09.10.2016.
 */
public class StudentsManagementWindowElement extends JPanel {

    private int fontSize = 25;
    private int fontType = 2;
    private String fontName = "Times New Roman";
    private int sizeOfBaseGroup = 80;
    private int sizeOfAdvancedGroup = 90;
    private int sizeOfLastNameLabel = 200;
    private int sizeOfFirstNameLabel = 200;
    private int sizeOfMiddleNameLabel = 200;
    private int height = 70;
    private Font elementFont = new Font(fontName, fontType, fontSize);
    //---------------------------------------
    private int idStudentsManagementElement = 0;
    //---------------------------------------
    public static Student student;
    //-----------------------
    private static int elementsCount = 0;
    //-----------------------
    private JLabel numberLabel;
    private JLabel lastNameLabel;
    private JLabel firstNameLabel;
    private JLabel middleNameLabel;
    private JLabel mathBaseGroupLabel;
    private JLabel mathAdvancedGroupLabel;
    private JLabel physBaseGroupLabel;
    private JLabel physAdvancedGroupLabel;
    private JLabel rusGroupLabel;
    private JButton openEditStudentInformation;

    //---------------------Шапка---------------------
    public StudentsManagementWindowElement() {
        numberLabel = new JLabel("№");
        lastNameLabel = new JLabel("Фамилия");
        firstNameLabel = new JLabel("Имя");
        middleNameLabel = new JLabel("Отчество");
        mathBaseGroupLabel = new JLabel("МБаза");
        mathAdvancedGroupLabel = new JLabel("МРасш");
        physBaseGroupLabel = new JLabel("ФБаза");
        physAdvancedGroupLabel = new JLabel("ФРасш");
        rusGroupLabel = new JLabel("РУС");

        this.setBackground(Color.GRAY);

        this.setPreferredSize(new Dimension(1000, height));
        this.setMaximumSize(new Dimension(1500, height));

        numberLabel.setPreferredSize(new Dimension(30, height));
        lastNameLabel.setPreferredSize(new Dimension(sizeOfLastNameLabel, height));
        firstNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel, height));
        middleNameLabel.setPreferredSize(new Dimension(sizeOfMiddleNameLabel, height));
        mathBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));
        mathAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup, height));
        physBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));
        physAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup, height));
        rusGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));

        numberLabel.setFont(elementFont);
        lastNameLabel.setFont(elementFont);
        middleNameLabel.setFont(elementFont);
        firstNameLabel.setFont(elementFont);
        physAdvancedGroupLabel.setFont(elementFont);
        openEditStudentInformation.setFont(elementFont);
        physBaseGroupLabel.setFont(elementFont);
        mathAdvancedGroupLabel.setFont(elementFont);
        mathBaseGroupLabel.setFont(elementFont);
        rusGroupLabel.setFont(elementFont);

        this.add(numberLabel);
        this.add(lastNameLabel);
        this.add(firstNameLabel);
        this.add(middleNameLabel);
        this.add(mathBaseGroupLabel);
        this.add(mathAdvancedGroupLabel);
        this.add(physBaseGroupLabel);
        this.add(physAdvancedGroupLabel);
        this.add(rusGroupLabel);
        this.add(openEditStudentInformation);

        openEditStudentInformation = new JButton("Новый Студент");
        openEditStudentInformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateStudentWindow();
            }
        });
    }

    //---------------------Строка---------------------
    public StudentsManagementWindowElement(Student student) {
        this.student = student;
        this.setBackground(Color.YELLOW);

        idStudentsManagementElement = ++elementsCount;

        numberLabel = new JLabel("" + (idStudentsManagementElement));
        lastNameLabel = new JLabel(student.getLastName());
        firstNameLabel = new JLabel(student.getFirstName());
        middleNameLabel = new JLabel(student.getMiddleName());
        mathBaseGroupLabel = new JLabel(student.getMathBaseGroupName());
        mathAdvancedGroupLabel = new JLabel(student.getMathAdvancedGroupName());
        physBaseGroupLabel = new JLabel(student.getPhysBaseGroupName());
        physAdvancedGroupLabel = new JLabel(student.getPhysAdvancedGroupName());
        rusGroupLabel = new JLabel(student.getRusGroupName());

        openEditStudentInformation = new JButton("Редактировать");
        openEditStudentInformation.setFont(elementFont);
        openEditStudentInformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditStudentWindow(student, idStudentsManagementElement);
            }
        });

        this.setPreferredSize(new Dimension(1000, height));
        this.setMaximumSize(new Dimension(1500, height));
        numberLabel.setPreferredSize(new Dimension(30, height));
        lastNameLabel.setPreferredSize(new Dimension(sizeOfLastNameLabel, height));
        firstNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel, height));
        middleNameLabel.setPreferredSize(new Dimension(sizeOfMiddleNameLabel, height));
        mathBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));
        mathAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup, height));
        physBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));
        physAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup, height));
        rusGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup, height));

        numberLabel.setFont(elementFont);
        lastNameLabel.setFont(elementFont);
        firstNameLabel.setFont(elementFont);
        middleNameLabel.setFont(elementFont);
        mathBaseGroupLabel.setFont(elementFont);
        mathAdvancedGroupLabel.setFont(elementFont);
        physBaseGroupLabel.setFont(elementFont);
        physAdvancedGroupLabel.setFont(elementFont);
        rusGroupLabel.setFont(elementFont);

        this.add(numberLabel);
        this.add(lastNameLabel);
        this.add(firstNameLabel);
        this.add(middleNameLabel);
        this.add(mathBaseGroupLabel);
        this.add(mathAdvancedGroupLabel);
        this.add(physBaseGroupLabel);
        this.add(physAdvancedGroupLabel);
        this.add(rusGroupLabel);
        this.add(openEditStudentInformation);
    }
}