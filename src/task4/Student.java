package task4;

public class Student extends OnlineLearningSystem{

    @Override
    void login(String username, String password) {
        if(username.equalsIgnoreCase("Student") && password.equals("password1")){
            System.out.println("Student is logged in");
        }else {
            System.out.println("Invalid Username or Password");
        }
    }



}
