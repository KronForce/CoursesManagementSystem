package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Student;

/**
 * Created by Miike on 09.10.2016.
 */
public class StudentsManagementWindowElement extends JPanel{

    private int fontSize = 25;
    private int fontType = 2;
    private String fontName = "Times New Roman";
    private int sizeOfBaseGroup = 80;
    private int sizeOfAdvancedGroup = 90;
    private int sizeOfLastNameLabel = 200;
    private int sizeOfFirstNameLabel = 200;
    private int sizeOfMiddleNameLabel = 200;


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


    public StudentsManagementWindowElement(){

        this.setPreferredSize(new Dimension(1000, 70));
        this.setMaximumSize(new Dimension(1500, 70));
        this.setBackground(Color.GRAY);

        numberLabel = new JLabel("№");
        numberLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        numberLabel.setPreferredSize(new Dimension(30,70));

        lastNameLabel = new JLabel("Фамилия");
        lastNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        lastNameLabel.setPreferredSize(new Dimension(sizeOfLastNameLabel,70));

        firstNameLabel = new JLabel("Имя");
        firstNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        firstNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel,70));

        middleNameLabel = new JLabel("Отчество");
        middleNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        middleNameLabel.setPreferredSize(new Dimension(sizeOfMiddleNameLabel,70));

        mathBaseGroupLabel = new JLabel("МБаза");
        mathBaseGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        mathBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        mathAdvancedGroupLabel = new JLabel("МРасш");
        mathAdvancedGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        mathAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup,70));

        physBaseGroupLabel = new JLabel("ФБаза");
        physBaseGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        physBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        physAdvancedGroupLabel = new JLabel("ФРасш");
        physAdvancedGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        physAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup,70));

        rusGroupLabel = new JLabel("РУС");
        rusGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        rusGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        openEditStudentInformation = new JButton("Новый Студент");
        openEditStudentInformation.setFont(new java.awt.Font(fontName,fontType,fontSize));
        openEditStudentInformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //new StudentWindow();
            }
        });

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
    public StudentsManagementWindowElement(Student student){
        this.setPreferredSize(new Dimension(1000, 70));
        this.setMaximumSize(new Dimension(1500, 70));
        this.setBackground(Color.YELLOW);

        numberLabel = new JLabel("№");
        numberLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        numberLabel.setPreferredSize(new Dimension(30,70));

        lastNameLabel = new JLabel(student.getLastName());
        lastNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        lastNameLabel.setPreferredSize(new Dimension(sizeOfLastNameLabel,70));

        firstNameLabel = new JLabel(student.getFirstName());
        firstNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        firstNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel,70));

        middleNameLabel = new JLabel(student.getMiddleName());
        middleNameLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        middleNameLabel.setPreferredSize(new Dimension(sizeOfMiddleNameLabel,70));

        mathBaseGroupLabel = new JLabel(student.getMathBaseGroupName());
        mathBaseGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        mathBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        mathAdvancedGroupLabel = new JLabel(student.getMathAdvancedGroupName());
        mathAdvancedGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        mathAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup,70));

        physBaseGroupLabel = new JLabel(student.getPhysBaseGroupName());
        physBaseGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        physBaseGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        physAdvancedGroupLabel = new JLabel(student.getPhysAdvancedGroupName());
        physAdvancedGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        physAdvancedGroupLabel.setPreferredSize(new Dimension(sizeOfAdvancedGroup,70));

        rusGroupLabel = new JLabel(student.getRusGroupName());
        rusGroupLabel.setFont(new java.awt.Font(fontName,fontType,fontSize));
        rusGroupLabel.setPreferredSize(new Dimension(sizeOfBaseGroup,70));

        openEditStudentInformation = new JButton("Редактировать");
        openEditStudentInformation.setFont(new java.awt.Font(fontName,fontType,fontSize));
        openEditStudentInformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new StudentWindow(student);
            }
        });

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