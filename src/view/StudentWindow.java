package view;

import model.Student;

/**
 * Created by mikes on 25.09.2016.
 */
public class StudentWindow extends BaseFrame{


    public StudentWindow(Student student){
        super(student.getLastName()+" " + student.getFirstName()+ " "+ student.getMiddleName(), false); //"Информация о студенте: " +
        this.setVisible(true);
    }
}
