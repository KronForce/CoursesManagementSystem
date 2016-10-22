package view.windows;

import model.Student;
import view.elements.StudentsManagementWindowElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Miike on 12.10.2016.
 */
public class CreateStudentWindow extends BaseFrame {
    private int fontType = 2;
    private int fontSize = 35;
    private String fontName = "Times New Roman";
    public CreateStudentWindow() {
        super("Добавление нового студента", false); //"Информация о студенте: " +
        JPanel createStudentPanel = new JPanel();
        this.add(createStudentPanel);

        JButton addStudent = new JButton("Добавить студента");
        addStudent.setPreferredSize(new Dimension(600, 70));
        addStudent.setFont(new Font(fontName, fontType,fontSize));
        createStudentPanel.setBackground(Color.gray);

        //photo
        JPanel photoPanel = new JPanel();
        photoPanel.setBackground(Color.DARK_GRAY);
        photoPanel.setPreferredSize(new Dimension(300, 300));

        JPanel fioPanel = new JPanel();
        fioPanel.setBackground(Color.BLUE);
        fioPanel.setPreferredSize(new Dimension(900, 300));
        //f l + tf
        JLabel lastNameLabel = new JLabel("Фамилия: ");
        JTextField lastNameTextField = new JTextField();
        lastNameLabel.setPreferredSize(new Dimension(200, 90));
        lastNameTextField.setPreferredSize(new Dimension(600, 70));
        lastNameLabel.setFont(new Font(fontName, fontType,fontSize));
        lastNameTextField.setFont(new Font(fontName, fontType,fontSize));
        //i l + tf
        JLabel firstNameLabel = new JLabel("Имя: ");
        JTextField firstNameTextField = new JTextField();
        firstNameLabel.setPreferredSize(new Dimension(200, 90));
        firstNameTextField.setPreferredSize(new Dimension(600, 70));
        firstNameLabel.setFont(new Font(fontName, fontType,fontSize));
        firstNameTextField.setFont(new Font(fontName, fontType,fontSize));
        //o l + tf
        JLabel middleNameLabel = new JLabel("Отчество: ");
        JTextField middleNameTextField = new JTextField();
        middleNameLabel.setPreferredSize(new Dimension(200, 90));
        middleNameTextField.setPreferredSize(new Dimension(600, 70));
        middleNameLabel.setFont(new Font(fontName, fontType,fontSize));
        middleNameTextField.setFont(new Font(fontName, fontType,fontSize));

        fioPanel.add(lastNameLabel);
        fioPanel.add(lastNameTextField);
        fioPanel.add(firstNameLabel);
        fioPanel.add(firstNameTextField);
        fioPanel.add(middleNameLabel);
        fioPanel.add(middleNameTextField);


        JPanel groupsPanel = new JPanel();
        groupsPanel.setBackground(Color.YELLOW);
        groupsPanel.setPreferredSize(new Dimension(1200, 300));

        //MBase l + ch
        JLabel mathLabel = new JLabel("Математика");
        mathLabel.setFont(new Font(fontName, fontType,fontSize));
        mathLabel.setPreferredSize(new Dimension(300, 90));

        /*
            mathPanel.add(ma1Button);
            mathPanel.add(ma2Button);
            mathPanel.add(mbButton);
            mathPanel.add(mcButton);
            mathPanel.add(msButton);
            mathPanel.add(moButton);
            mathPanel.add(mo2Button);
        * */

        //FBase l + ch
        JLabel physLabel = new JLabel("Физика");
        physLabel.setFont(new Font(fontName, fontType,fontSize));
        physLabel.setPreferredSize(new Dimension(300, 90));
        /*
            physPanel.add(fa1Button);
            physPanel.add(fa2Button);
            physPanel.add(fb1Button);
            physPanel.add(fc1Button);
            physPanel.add(fr1Button);
            physPanel.add(fr2Button);
         */

        //Rus l + ch
        JLabel rusLabel = new JLabel("Русский Язык");
        rusLabel.setFont(new Font(fontName, fontType,fontSize));
        rusLabel.setPreferredSize(new Dimension(300, 90));
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setMinimumSize(new Dimension(100,100));


        groupsPanel.add(mathLabel);
        groupsPanel.add(physLabel);
        groupsPanel.add(rusLabel);
        groupsPanel.add(jCheckBox);

        createStudentPanel.add(photoPanel);
        createStudentPanel.add(fioPanel);
        createStudentPanel.add(groupsPanel);


        createStudentPanel.add(addStudent);
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentsManagementWindow.studentsManagementWindowElements.add(new StudentsManagementWindowElement(new Student(lastNameTextField.getText(), firstNameTextField.getText(), middleNameTextField.getText())));
                //StudentsManagementWindow.jPanel.repaint();

                System.out.println(StudentsManagementWindow.studentsManagementWindowElements.size());

                System.out.println("-------------");
                for (StudentsManagementWindowElement s : StudentsManagementWindow.studentsManagementWindowElements) {
                    System.out.println(s.student.getLastName());
                }
                System.out.println("-------------");
                StudentsManagementWindow.repaint1();
            }
        });


        this.setVisible(true);
    }
}
