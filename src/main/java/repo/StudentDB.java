package repo;

import model.Student;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students){
        this.students = students;
    }

    public Student[] getAllStudents(){
        return this.students;
    }

    @Override
    public String toString() {
        String dbAsString = "";

        for (Student student: students) {
            dbAsString = dbAsString + " " + students.toString();
        }

        return dbAsString;
    }
}