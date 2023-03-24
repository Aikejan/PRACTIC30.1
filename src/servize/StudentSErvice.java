package servize;

import model.Student;

import java.util.List;


public interface StudentSErvice {
    String addStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudent();

    String updateStudentFullName(int id, String fullName);

    List<Student> filterByGender();

    void deleteStudentById(int id);
}
