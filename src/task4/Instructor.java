package task4;

public class Instructor extends OnlineLearningSystem{

    @Override
    void login(String username, String password) {
        if(username.equalsIgnoreCase("Instructor") && password.equals("password2")){
            System.out.println("Instructor is logged in");
        }else {
            System.out.println("Invalid Username or Password");
        }
    }

    void uploadCourses(String courseName) {
        System.out.println("Instructor uploading Courses...");
        System.out.println(courseName + " Uploaded Successfully!");

    }
}
