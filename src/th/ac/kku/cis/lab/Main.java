package th.ac.kku.cis.lab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Create object
        OOPClass oopClass = new OOPClass();
        //get student data from class
        ArrayList<Student> students = oopClass.students;
        //display data
        for (Student student: students) {
            System.out.println(String.format("Student name %s %s",student.firstname, student.lastname));
        }
    }
}
