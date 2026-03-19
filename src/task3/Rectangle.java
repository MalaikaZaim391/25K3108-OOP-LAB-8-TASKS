package task3;
import java.util.Scanner;

public class Rectangle implements Graphics {

    Scanner input = new Scanner(System.in);

    @Override
    public void area() {
        System.out.println("\tArea of the Rectangle");
        System.out.print("Enter Length: ");
        double l = input.nextDouble();
        System.out.print("Enter Width: ");
        double w = input.nextDouble();

        double area = l*w;
        String area2 = String.format("%.3f", area);
        System.out.println("The area of the Rectangle is: " + area2);

    }

}
