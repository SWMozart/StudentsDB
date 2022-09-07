package repo;

import model.Student;

import java.util.HashMap;

public class StudentDB {

    HashMap<String, Student> students = new HashMap<>();
    public Student add(Student student) {
        students.put(student.getId(), student);
        return student;
    }
    public void remove(String id) {
        students.remove(id);
    }


    @Override
    public String toString() {
        String dbAsString = "";

        for (Student student: students.values()) {
            dbAsString = dbAsString + " " + students.toString();
        }

        return dbAsString;
    }
}