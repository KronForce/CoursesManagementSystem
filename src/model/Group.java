package model;

import java.util.ArrayList;

/**
 * Created by mikes on 25.09.2016.
 */
public class Group {
    //todo Группа должна подгружать список учащихся в момент открытия окна работы с группой
    String name;
    ArrayList<Student> students = new ArrayList<>();
}
