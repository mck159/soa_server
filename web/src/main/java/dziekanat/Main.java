package dziekanat; /**
 * Created by root on 23.04.15.
 */

import dziekanat.model.Student;
import dziekanat.model.StudentsBase;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

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
    public String hi(@WebParam(name="name")String name) {
        return "Hi " + name;
    }

    @WebMethod
    public Student getStudent(@WebParam(name="pesel") String pesel) {
        return students.findStudent(pesel);
    }

    @WebMethod
    public List<Student> getStudents() {
        return students.getAll();
    }
}
