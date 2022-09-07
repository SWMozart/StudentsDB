import model.CSStudent;
import repo.StudentDB;

public class Main {

    public static void main(String[] args) {

        StudentDB studentArchiv = new StudentDB();

        CSStudent student1 = new CSStudent(123, "Andy" , "Java");
        CSStudent student2 = new CSStudent(443, "Sandy" , "C++");
        CSStudent student3 = new CSStudent(987, "Randy" , "Java");


        studentArchiv.add(student1);
        studentArchiv.add(student2);
        studentArchiv.add(student3);

        studentArchiv.remove(student1.getId());
        studentArchiv.remove(student2.getId());

        System.out.println(studentArchiv);


    }
}
