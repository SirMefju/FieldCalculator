package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Menu {
    public static int menu() {
        System.out.println("-----------------------------");
        System.out.println("-         MAIN MENU         -");
        System.out.println("1.   Field of square.");
        System.out.println("2.   Field of rectangle.");
        System.out.println("3.   Field of triangle.");
        System.out.println("4.   Field of circle.");
        System.out.println("5.   Exit.");
        System.out.println("-----------------------------");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }

    public static void choose() {
        int choice = menu();
        if (choice == 1) {
            System.out.println("Tell me about square frame size:");
            Scanner in = new Scanner(System.in);
            Double a = in.nextDouble();
            double squareArea = a * a;
            double squarePerimeter = 4 * a;
            System.out.println("The area of the square is equal = " + squareArea);
            System.out.println("The perimeter of the square is equal = " + squarePerimeter);
            Menu.choose();
        } else if (choice == 2) {
            System.out.println("Tell me about rectangle first frame size:");
            Scanner in = new Scanner(System.in);
            double a = in.nextDouble();
            System.out.println("Tell me about rectangle second frame size:");
            double b = in.nextDouble();
            double rectangleArea = a * b;
            double rectanglePerimeter = 2 * a + 2 * b;
            System.out.println("The area of the rectangle is equal = " + rectangleArea);
            System.out.println("The perimeter of the rectangle is equal = " + rectanglePerimeter);
            Menu.choose();
        } else if (choice == 3) {
            System.out.println("------------------------");
            System.out.println("1. Equilateral triangle.");
            System.out.println("2.   Regular triangle.  ");
            System.out.println("3.     Back to menu.    ");
            System.out.println("------------------------");
            Scanner in = new Scanner(System.in);
            int y = in.nextInt();
            if (y == 1) {
                System.out.println("Tell me about triangle frame size:");
                double a = in.nextDouble();
                double triangleArea = (a * a * (pow(3, 0.5))) / 4;
                double trianglePerimeter = 3 * a;
                double triangleHeight = (a * (pow(3, 0.5))) / 2;
                System.out.println("The area of the rectangle is equal = " + triangleArea);
                System.out.println("The perimeter of the rectangle is equal = " + trianglePerimeter);
                System.out.println("The height of the rectangle is equal = " + triangleHeight);
                Menu.choose();
            } else if (y == 2) {
                System.out.println("Tell me about triangle base size:");
                double a = in.nextDouble();
                System.out.println("Tell me about triangle first frame size:");
                double b = in.nextDouble();
                System.out.println("Tell me about triangle second frame size:");
                double c = in.nextDouble();
                System.out.println("Tell me about triangle height size:");
                double h = in.nextDouble();
                double triangleArea = 0.5 * a * h;
                double trianglePerimeter = a + b + c;
                System.out.println("The area of the rectangle is equal = " + triangleArea);
                System.out.println("The perimeter of the rectangle is equal = " + trianglePerimeter);
                Menu.choose();
            } else if (y == 3)
                Menu.choose();
            else {
                System.out.println("Wrong choice try again.");
                Menu.choose();
            }
        } else if (choice == 4) {
            System.out.println("Tell me about radius of the circle:");
            Scanner in = new Scanner(System.in);
            Double r = in.nextDouble();
            double circleArea = PI*r*r;
            double circlePerimeter = 2*PI*r;
            System.out.println("The area of the circle is equal = " + circleArea);
            System.out.println("The perimeter of the circle is equal = " + circlePerimeter);
            Menu.choose();
        } else if (choice == 5)
            System.exit(0);
        else {
            System.out.println("Wrong choice try again.");
            Menu.choose();
        }
    }
}