package view.windows;

import model.Student;
import view.elements.StudentsManagementWindowElement;

import javax.swing.*;
import javax.swing.event.AncestorListener;
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
        addStudent.setFont(new Font(fontName, fontType, fontSize));
        createStudentPanel.setBackground(Color.gray);

        //photo
        JPanel photoPanel = new JPanel();
        photoPanel.setBackground(Color.DARK_GRAY);
        photoPanel.setPreferredSize(new Dimension(300, 300));

        JPanel fioPanel = new JPanel();

        fioPanel.setPreferredSize(new Dimension(900, 300));
        //f l + tf
        JLabel lastNameLabel = new JLabel("Фамилия: ");
        JTextField lastNameTextField = new JTextField();
        lastNameLabel.setPreferredSize(new Dimension(200, 90));
        lastNameTextField.setPreferredSize(new Dimension(600, 70));
        lastNameLabel.setFont(new Font(fontName, fontType, fontSize));
        lastNameTextField.setFont(new Font(fontName, fontType, fontSize));
        //i l + tf
        JLabel firstNameLabel = new JLabel("Имя: ");
        JTextField firstNameTextField = new JTextField();
        firstNameLabel.setPreferredSize(new Dimension(200, 90));
        firstNameTextField.setPreferredSize(new Dimension(600, 70));
        firstNameLabel.setFont(new Font(fontName, fontType, fontSize));
        firstNameTextField.setFont(new Font(fontName, fontType, fontSize));
        //o l + tf
        JLabel middleNameLabel = new JLabel("Отчество: ");
        JTextField middleNameTextField = new JTextField();
        middleNameLabel.setPreferredSize(new Dimension(200, 90));
        middleNameTextField.setPreferredSize(new Dimension(600, 70));
        middleNameLabel.setFont(new Font(fontName, fontType, fontSize));
        middleNameTextField.setFont(new Font(fontName, fontType, fontSize));

        fioPanel.add(lastNameLabel);
        fioPanel.add(lastNameTextField);
        fioPanel.add(firstNameLabel);
        fioPanel.add(firstNameTextField);
        fioPanel.add(middleNameLabel);
        fioPanel.add(middleNameTextField);

//-----------------------------------------------------------
        JPanel groupsPanel = new JPanel();
        groupsPanel.setPreferredSize(new Dimension(1200, 300));
//----------------------------------------------------
        //MATH
        JLabel mathLabel = new JLabel("Математика");
        mathLabel.setFont(new Font(fontName, fontType, fontSize));
        JPanel mathPanel = new JPanel();
        JPanel mathPanelMathLabelArea = new JPanel();
        mathPanel.add(mathPanelMathLabelArea);
        mathPanelMathLabelArea.add(mathLabel);
        JPanel mathPanelElementsArea = new JPanel();
        JPanel mathPanelMathGroupsLabelsArea = new JPanel();
        //--------------------LABELS-------------------------
        JLabel ma1Label = new JLabel();
        JLabel ma2Label = new JLabel();
        JLabel mbLabel = new JLabel();
        JLabel mcLabel = new JLabel();
        JLabel msLabel = new JLabel();
        JLabel moLabel = new JLabel();
        JLabel mo2Label = new JLabel();

        mathPanelElementsArea.add(mathPanelMathGroupsLabelsArea);
        mathPanelMathGroupsLabelsArea.add(ma1Label);
        mathPanelMathGroupsLabelsArea.add(ma2Label);
        mathPanelMathGroupsLabelsArea.add(mbLabel);
        mathPanelMathGroupsLabelsArea.add(mcLabel);
        mathPanelMathGroupsLabelsArea.add(msLabel);
        mathPanelMathGroupsLabelsArea.add(moLabel);
        mathPanelMathGroupsLabelsArea.add(mo2Label);

        //--------------------BUTTONS-------------------------
        JPanel mathPanelMathGroupsButtonsArea = new JPanel();
        mathPanelElementsArea.add(mathPanelMathGroupsButtonsArea);
        JButton ma1Button = new JButton("MA1");
        ma1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ma1Label.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    ma1Label.setText("MA1");
                } else {
                    ma1Label.setText("");
                }
            }
        });

        JButton ma2Button = new JButton("MA2");
        ma2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ma2Label.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    ma2Label.setText("MA2");
                } else {
                    ma2Label.setText("");
                }
            }
        });

        JButton mbButton = new JButton("MB");
        mbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mbLabel.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    mbLabel.setText("MB");
                } else {
                    mbLabel.setText("");
                }
            }
        });

        JButton mcButton = new JButton("MC");
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mcLabel.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    mcLabel.setText("MC");
                } else {
                    mcLabel.setText("");
                }
            }
        });

        JButton msButton = new JButton("MS");
        msButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (msLabel.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    msLabel.setText("MS");
                } else {
                    msLabel.setText("");
                }
            }
        });

        JButton moButton = new JButton("MO");
        moButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (moLabel.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    moLabel.setText("MO");
                } else {
                    moLabel.setText("");
                }
            }
        });

        JButton mo2Button = new JButton("MO2");
        mo2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mo2Label.getText().isEmpty()) {
                    ma1Label.setText("");
                    ma2Label.setText("");
                    mbLabel.setText("");
                    mcLabel.setText("");
                    moLabel.setText("");
                    mo2Label.setText("");
                    msLabel.setText("");
                    mo2Label.setText("MO2");
                } else {
                    mo2Label.setText("");
                }
            }
        });
        mathPanelMathGroupsButtonsArea.add(ma1Button);
        mathPanelMathGroupsButtonsArea.add(ma2Button);
        mathPanelMathGroupsButtonsArea.add(mbButton);
        mathPanelMathGroupsButtonsArea.add(mcButton);
        mathPanelMathGroupsButtonsArea.add(msButton);
        mathPanelMathGroupsButtonsArea.add(moButton);
        mathPanelMathGroupsButtonsArea.add(mo2Button);


        //-------SIZE--------
        mathPanel.setPreferredSize(new Dimension(1200, 100));
        mathPanelMathLabelArea.setPreferredSize(new Dimension(300, 90));
        mathLabel.setPreferredSize(new Dimension(300, 90));
        mathPanelElementsArea.setPreferredSize(new Dimension(850, 100));
        mathPanelMathGroupsLabelsArea.setPreferredSize(new Dimension(850, 30));
        mathPanelMathGroupsButtonsArea.setPreferredSize(new Dimension(850, 60));
//-----------------------------------------------------------------------
        //PHYS
        JLabel physLabel = new JLabel("Физика");
        physLabel.setFont(new Font(fontName, fontType, fontSize));

        JPanel physPanel = new JPanel();

        JPanel physPanelPhysLabelArea = new JPanel();
        JPanel physPanelElementsArea = new JPanel();
        JPanel physPanelLabelsArea = new JPanel();
        JPanel physPanelButtonsArea = new JPanel();

        physPanel.add(physPanelPhysLabelArea);
        physPanelPhysLabelArea.add(physLabel);
        physPanel.add(physPanelElementsArea);
        physPanelElementsArea.add(physPanelLabelsArea);
        physPanelElementsArea.add(physPanelButtonsArea);


        //--------------------LABELS-------------------------
        JLabel fa1Label = new JLabel();
        JLabel fa2Label = new JLabel();
        JLabel fb1Label = new JLabel();
        JLabel fc1Label = new JLabel();
        JLabel fr1Label = new JLabel();
        JLabel fr2Label = new JLabel();

        physPanelLabelsArea.add(fa1Label);
        physPanelLabelsArea.add(fa2Label);
        physPanelLabelsArea.add(fb1Label);
        physPanelLabelsArea.add(fc1Label);
        physPanelLabelsArea.add(fr1Label);
        physPanelLabelsArea.add(fr2Label);


        //--------------------BUTTONS-------------------------
        JButton fa1Button = new JButton("FA1");
        fa1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fa1Label.getText().isEmpty()) {
                    fa1Label.setText("");
                    fa2Label.setText("");
                    fb1Label.setText("");
                    fc1Label.setText("");
                    fa1Label.setText("FA1");
                } else {
                    fa1Label.setText("");
                }
            }
        });
        JButton fa2Button = new JButton("FA2");
        fa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fa2Label.getText().isEmpty()) {
                    fa1Label.setText("");
                    fa2Label.setText("");
                    fb1Label.setText("");
                    fc1Label.setText("");
                    fa2Label.setText("FA2");
                } else {
                    fa2Label.setText("");
                }
            }
        });
        JButton fb1Button = new JButton("FB1");
        fb1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fb1Label.getText().isEmpty()) {
                    fa1Label.setText("");
                    fa2Label.setText("");
                    fb1Label.setText("");
                    fc1Label.setText("");
                    fb1Label.setText("FB1");
                } else {
                    fb1Label.setText("");
                }
            }
        });
        JButton fc1Button = new JButton("FC1");
        fc1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fc1Label.getText().isEmpty()) {
                    fa1Label.setText("");
                    fa2Label.setText("");
                    fb1Label.setText("");
                    fc1Label.setText("");

                    fc1Label.setText("FC1");
                } else {
                    fc1Label.setText("");
                }
            }
        });
        JButton fr1Button = new JButton("FR1");
        fr1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fr1Label.getText().isEmpty()) {
                    fr1Label.setText("FR1");
                    fr2Label.setText("");
                } else {
                    fr1Label.setText("");
                }
            }
        });
        JButton fr2Button = new JButton("FR2");
        fr2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fr2Label.getText().isEmpty()) {
                    fr2Label.setText("FR2");
                    fr1Label.setText("");
                } else {
                    fr2Label.setText("");
                }
            }
        });


        physPanelButtonsArea.add(fa1Button);
        physPanelButtonsArea.add(fa2Button);
        physPanelButtonsArea.add(fb1Button);
        physPanelButtonsArea.add(fc1Button);
        physPanelButtonsArea.add(fr1Button);
        physPanelButtonsArea.add(fr2Button);


        //-------------
        physPanel.setPreferredSize(new Dimension(1200, 100));
        physPanelPhysLabelArea.setPreferredSize(new Dimension(300, 90));
        physLabel.setPreferredSize(new Dimension(300, 90));
        physPanelElementsArea.setPreferredSize(new Dimension(850, 100));
        physPanelLabelsArea.setPreferredSize(new Dimension(850, 30));
        physPanelButtonsArea.setPreferredSize(new Dimension(850, 60));
        //-------------

//----------------------------------------------------------------------------------
        //RUS
        JLabel rusLabel = new JLabel("Русский Язык");
        rusLabel.setFont(new Font(fontName, fontType, fontSize));

        JPanel rusPanel = new JPanel();
        JPanel rusPanelRusLabelArea = new JPanel();
        JPanel rusPanelElementsArea = new JPanel();
        JPanel rusPanelLabelsArea = new JPanel();
        JPanel rusPanelButtonsArea = new JPanel();

        rusPanel.add(rusPanelRusLabelArea);
        rusPanel.add(rusPanelElementsArea);
        rusPanelElementsArea.add(rusPanelLabelsArea);
        rusPanelElementsArea.add(rusPanelButtonsArea);


        //---------------------
        rusPanel.setPreferredSize(new Dimension(1200, 100));
        rusPanelRusLabelArea.setPreferredSize(new Dimension(300, 90));
        rusLabel.setPreferredSize(new Dimension(300, 90));
        rusPanelElementsArea.setPreferredSize(new Dimension(850, 100));
        rusPanelLabelsArea.setPreferredSize(new Dimension(850, 30));
        rusPanelButtonsArea.setPreferredSize(new Dimension(850, 60));
        //---------------------
        rusPanelRusLabelArea.add(rusLabel);


        //--------------------LABELS-------------------------
        JLabel rusGroupLabel = new JLabel();
        rusPanelLabelsArea.add(rusGroupLabel);
        //--------------------BUTTONS-------------------------
        JButton rusGroupButton = new JButton("RUS");
        rusGroupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rusGroupLabel.getText().isEmpty()) {
                    rusGroupLabel.setText("RUS");
                } else {
                    rusGroupLabel.setText("");
                }
            }
        });
        rusPanelButtonsArea.add(rusGroupButton);


//------------------------------------------------------------------------------------

        groupsPanel.add(mathPanel);
        mathPanel.add(mathPanelElementsArea);

        groupsPanel.add(physPanel);
        groupsPanel.add(rusPanel);
//--------------------------------------------------


        createStudentPanel.add(photoPanel);
        createStudentPanel.add(fioPanel);
        createStudentPanel.add(groupsPanel);
        createStudentPanel.add(addStudent);

        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
//                    new Exception();
//                    new Throwable();
                    //----------Работающий вариант-----------
                    //StudentsManagementWindow.studentsManagementWindowElements.add(new StudentsManagementWindowElement(new Student(lastNameTextField.getText(), firstNameTextField.getText(), middleNameTextField.getText())));
                    //---------------------------------------
                    String mathBaseGroupName = "" +
                            ma1Label.getText() + ma2Label.getText() + mbLabel.getText() + mcLabel.getText()
                            + msLabel.getText() + moLabel.getText() + mo2Label.getText();
                    String mathAdvancedGroupName = "" +
                            ma1Label.getText() + ma2Label.getText() + mbLabel.getText() + mcLabel.getText()
                            + msLabel.getText() + moLabel.getText() + mo2Label.getText();
                    String physBaseGroupName = "" + fa1Label.getText() + fa2Label.getText() + fb1Label.getText() +fc1Label.getText();
                    String physAdvancedGroupName = ""+ fr1Label.getText()+ fr2Label.getText();
                    String rusGroupName = "" + rusGroupLabel.getText();
                    //----------------Тестовый вариант-----------------------
                    Student newStudent = new Student(lastNameLabel.getText(), firstNameLabel.getText(), middleNameLabel.getText(),
                            mathBaseGroupName, mathAdvancedGroupName, physBaseGroupName, physAdvancedGroupName, rusGroupName);
                    //newStudent.
                    StudentsManagementWindow.studentsManagementWindowElements.add(new StudentsManagementWindowElement(newStudent));
                    //-------------------------------------------------------


                    // StudentsManagementWindow.jPanel.repaint();
                    //System.out.println(StudentsManagementWindow.studentsManagementWindowElements.size());
                    System.out.println("-------------");
                    for (StudentsManagementWindowElement s : StudentsManagementWindow.studentsManagementWindowElements) {
                        System.out.println(s.student.getLastName());
                    }
                    System.out.println("-------------");
                    //StudentsManagementWindow.repaint1();

                    JOptionPane.showMessageDialog(null, "Студент успешно добавлен!");
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Ошибка при добавлении студента!");
                }
            }
        });
        //groupsPanel.setBackground(Color.YELLOW);
        //physPanelLabelsArea.setBackground(Color.YELLOW);
        //physPanelButtonsArea.setBackground(Color.GREEN);
        //mathPanelMathGroupsButtonsArea.setBackground(Color.BLUE);
        //mathPanelElementsArea.setBackground(Color.ORANGE);
        //fioPanel.setBackground(Color.BLUE);
        //mathPanelMathGroupsLabelsArea.setBackground(Color.GREEN);
        this.setVisible(true);
    }
}
//todo ПРИЧЕСЫВАНИЕ При нажатии на кнопку сохранения окно должно закрыться, ведь мы студентов добавляем по одному
//todo ПРИЧЕСЫВАНИЕ убрать из консоли лишние выводы при создании студента
//todo ПРИЧЕСЫВАНИЕ подумать о том, чтобы JLabel-ы были не для всех групп, а для 1-я для базовой группы по предмету, 2я - для расширенной
//todo ПРИЧЕСЫВАНИЕ Поместить все данные на JScrollPane для того, чтобы в этом же окне были допданные (родители, школа, телефоны и тд).