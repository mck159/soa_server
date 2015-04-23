package dziekanat.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 23.04.15.
 */
public class Student {
    private String name;
    private String surname;
    private String pesel;
    private List<String> subjects = new ArrayList<String>();

    @XmlElementWrapper(name="subjects")
    @XmlElement(name="subject")
    public List<String> getSubjects() {
        return subjects;
    }
    public boolean addSubject(String subject) {
        if(subjects.contains(subject))
            return false;
        subjects.add(subject);
        return true;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public Student(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public Student() {
//        this.name = "UNKNOWN";
//        this.surname = "UNKNOWN";
//        this.pesel = "UNKNOWN";
    }

}
