package view.elements;

import model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mikes on 23.10.2016.
 */
public class GroupWindowElement extends JPanel {

    private static int elementsCount = 0;
    private int fontSize = 18;
    private int fontType = 2;
    private String fontName = "Times New Roman";
    private int sizeOfBaseGroup = 80;
    private int sizeOfAdvancedGroup = 90;
    private int sizeOfLastNameLabel = 200;
    private int sizeOfFirstNameLabel = 200;
    private int sizeOfMiddleNameLabel = 200;
    private int height = 70;
    private Font elementFont = new Font(fontName, fontType, fontSize);
    JLabel numberLabel;
    JLabel lastNameLabel;
    JLabel firstNameLabel;
    JLabel middleNameLabel;

    JLabel day1Label;
    JLabel day2Label;
    JLabel day3Label;
    JLabel todayLabel;

    JLabel paymentStatusLabel;

    JLabel todayLabelButton;
    JLabel changePaymentStatusLabelButton;

    //-----шапка-----
    public GroupWindowElement() {
        this.setPreferredSize(new Dimension(1000, height));
        this.setMaximumSize(new Dimension(1500, height));
        this.setBackground(Color.GRAY);
        // number lastname firstname middlename day1 day2 day3 today isZadolzhennostNaTekushiyMesyac button
        numberLabel = new JLabel("№");
        lastNameLabel = new JLabel("Фамилия");
        firstNameLabel = new JLabel("Имя");
        middleNameLabel = new JLabel("Отчество");
        day1Label = new JLabel("01.13");
        day2Label = new JLabel("02.13");
        day3Label = new JLabel("03.13");
        todayLabel = new JLabel("04.13");
        paymentStatusLabel = new JLabel("Статус оплаты");
        todayLabelButton = new JLabel("Кнопка ТУТ");
        changePaymentStatusLabelButton = new JLabel("Кнопка ОПЛАТИТЬ");
        JButton addStudentFromList = new JButton("Добавить студента");

//--------------------------РАЗМЕРЫ------------------------------------------
        numberLabel.setPreferredSize(new Dimension(30, height));
        lastNameLabel.setPreferredSize(new Dimension(sizeOfLastNameLabel, height));
        firstNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel, height));
        middleNameLabel.setPreferredSize(new Dimension(sizeOfFirstNameLabel, height));
//--------------------------ШРИФТЫ------------------------------------------
        numberLabel.setFont(elementFont);
        lastNameLabel.setFont(elementFont);
        firstNameLabel.setFont(elementFont);
        middleNameLabel.setFont(elementFont);
        day1Label.setFont(elementFont);
        day2Label.setFont(elementFont);
        day3Label.setFont(elementFont);
        todayLabel.setFont(elementFont);
        paymentStatusLabel.setFont(elementFont);
        todayLabel.setFont(elementFont);
        todayLabelButton.setFont(elementFont);
//---------------------------------------------------------------------------
        this.add(numberLabel);
        this.add(lastNameLabel);
        this.add(firstNameLabel);
        this.add(middleNameLabel);
        this.add(day1Label);
        this.add(day2Label);
        this.add(day3Label);
        this.add(todayLabel);
        this.add(paymentStatusLabel);
        this.add(todayLabelButton);
        this.add(changePaymentStatusLabelButton);
        this.add(addStudentFromList);
//---------------------------------------------------------------------------
        addStudentFromList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата клавиша добавления студента!");
            }
        });
    }

    //-----строка-----
    public GroupWindowElement(Student student) {
// number lastname firstname middlename day1 day2 day3 today isZadolzhennostNaTekushiyMesyac button

        numberLabel = new JLabel("" + (++elementsCount));
        lastNameLabel = new JLabel(student.getLastName());
        firstNameLabel = new JLabel(student.getFirstName());
        middleNameLabel = new JLabel(student.getMiddleName());
        day1Label = new JLabel("день1");
        day2Label = new JLabel("день2");
        day3Label = new JLabel("день3");
        todayLabel = new JLabel("сегодня");
        paymentStatusLabel = new JLabel("Оплата");
        JButton setTodayButton = new JButton("Здесь");
        JButton setPaymentButton = new JButton("Оплатить");
        JButton editStudentInfoButton = new JButton("Редактировать");
        setTodayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка ТУТ");
            }
        });
        setPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка ОПЛАТИТЬ");
            }
        });
        editStudentInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата клавиша добавления студента!");
            }
        });
//--------------------------РАЗМЕРЫ------------------------------------------

//---------------------------------------------------------------------------
        this.add(numberLabel);
        this.add(lastNameLabel);
        this.add(firstNameLabel);
        this.add(middleNameLabel);
        this.add(day1Label);
        this.add(day2Label);
        this.add(day3Label);
        this.add(todayLabel);
        this.add(setTodayButton);
        this.add(setPaymentButton);
        this.add(editStudentInfoButton);
    }
}
