package task3;
import java.util.Scanner;

public class Circle implements Graphics {

    Scanner input = new Scanner(System.in);

    @Override
    public void area(){
        System.out.println("\tArea Of the Circle");
        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double area = Math.PI * Math.pow(r,2);
        String area2 = String.format("%.3f", area);
        System.out.println("The area of the Circle is: " + area2);

    }

}
