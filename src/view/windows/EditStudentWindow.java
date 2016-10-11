package view.windows;

import model.Student;
import view.windows.BaseFrame;

/**
 * Created by mikes on 25.09.2016.
 */
public class EditStudentWindow extends BaseFrame {


    public EditStudentWindow(Student student){
        super(student.getLastName()+" " + student.getFirstName()+ " "+ student.getMiddleName(), false); //"Информация о студенте: " +
        this.setVisible(true);
    }
}
