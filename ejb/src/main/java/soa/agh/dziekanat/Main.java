package soa.agh.dziekanat; /**
 * Created by root on 23.04.15.
 */

import soa.agh.dziekanat.model.Student;
import soa.agh.dziekanat.model.StudentsBase;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Stateless
@WebService
public class Main {
    private StudentsBase students = new StudentsBase();

    public Main() {
        Student s1 = new Student("Maciej", "Sroka", "P1");
        Student s2 = new Student("Jan", "Kowalski", "P2");
        s2.addSubject("Informatyka");
        s2.addSubject("Matematyka");
        students.addStudent(s1);
        students.addStudent(s2);
    }

    @WebMethod
    public String hi(String name) {
        return "Hi " + name;
    }

    @WebMethod
    public Student getStudent(String pesel) {
        return students.findStudent(pesel);
    }

    @WebMethod
    public List<Student> getStudents() {
        return students.getAll();
    }
}
