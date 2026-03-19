package task4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        OnlineLearningSystem student = new Student();

        //cant call uploadCourses with abstract reference
        //hence using Instructor class reference directly
        Instructor instructor = new Instructor();

        //can take username/password as input too
        /*
        System.out.print("Enter Username: ");
        String username = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();
        student.login(username, password);
        instructor.login(username, password);
        */

        //or hard-code instead
        student.login("student", "password1");
        instructor.login("instructor", "password2");

        System.out.println();
        instructor.uploadCourses("Physics 101");

    }
}
