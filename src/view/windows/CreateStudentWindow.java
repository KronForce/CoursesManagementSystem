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
        //fioPanel.setBackground(Color.BLUE);
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
//-----------------------------------------------------------
        JPanel groupsPanel = new JPanel();
        //groupsPanel.setBackground(Color.YELLOW);
        groupsPanel.setPreferredSize(new Dimension(1200, 300));



//----------------------------------------------------
        //MATH
        JLabel mathLabel = new JLabel("Математика");
        mathLabel.setFont(new Font(fontName, fontType, fontSize));
//        mathLabel.setPreferredSize(new Dimension(300, 90));

        JPanel mathPanel = new JPanel();

//        mathPanel.setPreferredSize(new Dimension(1200, 100));

        JPanel mathPanelMathLabelArea = new JPanel();

//        mathPanelMathLabelArea.setPreferredSize(new Dimension(300, 90));

        mathPanel.add(mathPanelMathLabelArea);
        mathPanelMathLabelArea.add(mathLabel);

        JPanel mathPanelElementsArea = new JPanel();
        //mathPanelElementsArea.setBackground(Color.ORANGE);
        //mathPanelElementsArea.setPreferredSize(new Dimension(850, 100));


        JPanel mathPanelMathGroupsLabelsArea = new JPanel();
        //mathPanelMathGroupsLabelsArea.setPreferredSize(new Dimension(850, 45));
        //mathPanelMathGroupsLabelsArea.setBackground(Color.GREEN);


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

        //------------------------------------------------

        JPanel mathPanelMathGroupsButtonsArea = new JPanel();
//        mathPanelMathGroupsButtonsArea.setPreferredSize(new Dimension(850, 45));
        mathPanelElementsArea.add(mathPanelMathGroupsButtonsArea);
        //mathPanelMathGroupsButtonsArea.setBackground(Color.BLUE);


        JButton ma1Button = new JButton("MA1");
        ma1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ma1Label.setText("MA1");
            }
        });

        JButton ma2Button = new JButton("MA2");
        ma2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ma2Label.setText("MA2");
            }
        });

        JButton mbButton = new JButton("MB");
        mbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mbLabel.setText("MB");
            }
        });

        JButton mcButton = new JButton("MC");
        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mcLabel.setText("MC");
            }
        });

        JButton msButton = new JButton("MS");
        msButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msLabel.setText("MS");
            }
        });

        JButton moButton = new JButton("MO");
        moButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moLabel.setText("MO");
            }
        });

        JButton mo2Button = new JButton("MO2");
        mo2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mo2Label.setText("MO2");
            }
        });
        mathPanelMathGroupsButtonsArea.add(ma1Button);
        mathPanelMathGroupsButtonsArea.add(ma2Button);
        mathPanelMathGroupsButtonsArea.add(mbButton);
        mathPanelMathGroupsButtonsArea.add(mcButton);
        mathPanelMathGroupsButtonsArea.add(msButton);
        mathPanelMathGroupsButtonsArea.add(moButton);
        mathPanelMathGroupsButtonsArea.add(mo2Button);


        //---------------

        mathPanel.setPreferredSize(new Dimension(1200, 100));
            mathPanelMathLabelArea.setPreferredSize(new Dimension(300, 90));
                mathLabel.setPreferredSize(new Dimension(300, 90));

            mathPanelElementsArea.setPreferredSize(new Dimension(850, 100));
                mathPanelMathGroupsLabelsArea.setPreferredSize(new Dimension(850, 30));
                mathPanelMathGroupsButtonsArea.setPreferredSize(new Dimension(850, 60));
        //---------------

//-----------------------------------------------------------------------
        //PHYS
        JLabel physLabel = new JLabel("Физика");
        physLabel.setFont(new Font(fontName, fontType, fontSize));


        JPanel physPanel = new JPanel();



        JPanel physPanelPhysLabelArea = new JPanel();


        JPanel physPanelElementsArea = new JPanel();



        JPanel physPanelLabelsArea = new JPanel();

        //physPanelLabelsArea.setBackground(Color.YELLOW);

        JPanel physPanelButtonsArea = new JPanel();

        //physPanelButtonsArea.setBackground(Color.GREEN);

        physPanel.add(physPanelPhysLabelArea);
        physPanel.add(physPanelElementsArea);
        physPanelElementsArea.add(physPanelLabelsArea);
        physPanelElementsArea.add(physPanelButtonsArea);

        physPanelPhysLabelArea.add(physLabel);

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
                fa1Label.setText("FA1");
            }
        });
        JButton fa2Button = new JButton("FA2");
        fa2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fa2Label.setText("FA2");
            }
        });
        JButton fb1Button = new JButton("FB1");
        fb1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fb1Label.setText("FB1");
            }
        });
        JButton fc1Button = new JButton("FC1");
        fc1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fc1Label.setText("FC1");
            }
        });
        JButton fr1Button = new JButton("FR1");
        fr1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr1Label.setText("FR1");
            }
        });
        JButton fr2Button = new JButton("FR2");
        fr2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr2Label.setText("FR2");
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

//        rusPanel.add(rusLabel);


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
                rusGroupLabel.setText("RUS");
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
                StudentsManagementWindow.studentsManagementWindowElements.add(new StudentsManagementWindowElement(new Student(lastNameTextField.getText(), firstNameTextField.getText(), middleNameTextField.getText())));
                //StudentsManagementWindow.jPanel.repaint();

                System.out.println(StudentsManagementWindow.studentsManagementWindowElements.size());

                System.out.println("-------------");
                for (StudentsManagementWindowElement s : StudentsManagementWindow.studentsManagementWindowElements) {
                    System.out.println(s.student.getLastName());
                }
                System.out.println("-------------");
                //StudentsManagementWindow.repaint1();
            }
        });


        this.setVisible(true);
    }
}
