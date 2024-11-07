package OOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your OOP.Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the OOP.Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the OOP.Rectangle: "+ rectangle.getArea());
    }
}