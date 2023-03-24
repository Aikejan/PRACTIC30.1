package db;

import model.Groub;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBaza {
  private List<Groub>groubs = new ArrayList<>();
  private List<Student>students = new ArrayList<>();

    public List<Groub> getGroubs() {
        return groubs;
    }

    public void setGroubs(List<Groub> groubs) {
        this.groubs = groubs;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
