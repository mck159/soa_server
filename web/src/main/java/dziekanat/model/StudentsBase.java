package dziekanat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 23.04.15.
 */
public class StudentsBase {
    private List<Student> students = new ArrayList<Student>();

    public boolean addStudent(Student newStudent) {
        String newStudentPesel = newStudent.getPesel();
        for(Student student : students) {
            if(student.getPesel().equals(newStudentPesel)) {
                return false;
            }
        }
        students.add(newStudent);
        return true;
    }

    public Student findStudent(String pesel) {
        for(Student student : students) {
            if(student.getPesel().equals(pesel)) {
                return student;
            }
        }
        return new Student();
        //return null;
    }

    public List<Student> getAll() {
        return students;
    }
}
