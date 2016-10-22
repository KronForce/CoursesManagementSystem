package model;

/**
 * Created by mikes on 25.09.2016.
 */
public class Student {
    // Студент имеет поля посещаемости и статуса оплаты обучения метод, заполняющий поля посещаемости и статуса задолженности по обучению.
    private String lastName;
    private String firstName;
    private String middleName;


    private String mathBaseGroupName;
    private String mathAdvancedGroupName;

    private String physBaseGroupName;
    private String physAdvancedGroupName;

    private String rusGroupName;

    public Student(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Student(String lastName, String firstName, String middleName, String mathBaseGroupName, String mathAdvancedGroupName, String physBaseGroupName, String physAdvancedGroupName, String rusGroupName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.mathBaseGroupName = mathBaseGroupName;
        this.mathAdvancedGroupName = mathAdvancedGroupName;
        this.physBaseGroupName = physBaseGroupName;
        this.physAdvancedGroupName = physAdvancedGroupName;
        this.rusGroupName = rusGroupName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMathBaseGroupName() {
        return mathBaseGroupName;
    }

    public void setMathBaseGroupName(String mathBaseGroupName) {
        this.mathBaseGroupName = mathBaseGroupName;
    }

    public String getMathAdvancedGroupName() {
        return mathAdvancedGroupName;
    }

    public void setMathAdvancedGroupName(String mathAdvancedGroupName) {
        this.mathAdvancedGroupName = mathAdvancedGroupName;
    }

    public String getPhysBaseGroupName() {
        return physBaseGroupName;
    }

    public void setPhysBaseGroupName(String physBaseGroupName) {
        this.physBaseGroupName = physBaseGroupName;
    }

    public String getPhysAdvancedGroupName() {
        return physAdvancedGroupName;
    }

    public void setPhysAdvancedGroupName(String physAdvancedGroupName) {
        this.physAdvancedGroupName = physAdvancedGroupName;
    }

    public String getRusGroupName() {
        return rusGroupName;
    }

    public void setRusGroupName(String rusGroupName) {
        this.rusGroupName = rusGroupName;
    }
    //
}
