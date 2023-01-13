package Client;

import Developer.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();

        Cylinder cylinder = new Cylinder(height, radius);

        System.out.println("Surface Area = " + String.format("%.2f", cylinder.getSurfaceArea()));
        System.out.println("Perimeter of Cylinder = " +  String.format("%.2f", cylinder.getPerimeterOfCylinder()));
    }
}
