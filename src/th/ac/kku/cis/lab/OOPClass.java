package th.ac.kku.cis.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OOPClass {
    ArrayList<Student> students;
    public OOPClass() {
        students = new ArrayList<Student>();
        loadStudentFromCSV();
    }
    public void loadStudentFromCSV(){
        Path pathToFile = Paths.get("C:\\Users\\dell\\Documents\\name.csv");
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");

                Student studentFromCSV = new Student();
                studentFromCSV.student_id = attributes[0];
                studentFromCSV.firstname = attributes[1];
                studentFromCSV.lastname = attributes[2];
                studentFromCSV.email = attributes[3];

                students.add(studentFromCSV);

                line = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public int getStudentCount(){
        return this.students.size();
    }
    public Student createStudent(String[] attributes){
        Student newStudent = new Student();
        newStudent.student_id = attributes[0];
        newStudent.firstname = attributes[1];
        newStudent.lastname = attributes[2];
        newStudent.email = attributes[3];

        return newStudent;
    }
}
