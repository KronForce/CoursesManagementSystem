package view;

/**
 * Created by mikes on 25.09.2016.
 */
public class StudentWindow extends BaseFrame{
    public StudentWindow(String studentName){
        super("Информация о студенте " + studentName, false);
        this.setVisible(true);
    }
}
