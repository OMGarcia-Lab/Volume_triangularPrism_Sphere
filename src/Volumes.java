import java.util.Scanner;

public class Volumes {
    public static void main(String[] args) {
        // First Import Scanner so user can add their own sizes to Calculate //
        Scanner input = new Scanner(System.in);

        // Then define the base, height and length //
        System.out.print("Please Enter Base: ");
        double base = input.nextDouble();
        System.out.print("Please Enter Height: ");
        double height = input.nextDouble();
        System.out.print("Please Enter Length: ");
        double length = input.nextDouble();

        // After, define the volume //
        double volume;
        volume = (double) 1 / 2 * base * height * length;

        // For Space in between user input and solution //
        System.out.println();

        System.out.println("The volume of the Triangular Prism with Base: " + base + " Height: " + height + " and Length: " + length + " is: " + volume);

        // For Space in Between Questions //
        System.out.println();

        // Make sure to add final to a variable you don't want to ever change, like the number for PI //
        final double PI = 3.1415926;
        System.out.print("Please Enter Radius: ");
        double radius = input.nextDouble();
        double Volume;
        Volume = 4 / 3. * PI * Math.pow(radius, 3);

        // For Space in between user input and solution //
        System.out.println();

        System.out.println("The volume of the Sphere of Radius: " + radius + " is: " + Volume);
        // If you want to round it off to the nearest whole number:
        // System.out.println("The Volume of the Sphere of radius 13.000 is: " + Math.round(Volume)); //

        // If you want to round off to the nearest 10th:
        // System.out.println("The Volume of the Sphere of radius is: " + Math.round(Volume*100.)/100.);

    }
}

