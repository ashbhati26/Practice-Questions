import java.util.*;
public class Math_library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();

        double minimum = Math.min(a,b);
        System.out.println("Minimum value is " + minimum);

        double maximum = Math.max(a,b);
        System.out.println("Maximum value is " + maximum);

        double powerOf = Math.pow(a, b);
        System.out.println("Power " + b + " to the base " + a + " is " + powerOf);

        double squareRoot = Math.sqrt(a);
        System.out.println("Square Root is " + squareRoot);
        
        double cubeRoot = Math.cbrt(a);
        System.out.println("Cube Root is " + cubeRoot);

        double log = Math.log(a);
        System.out.println("The value of log is " + log);

        double signRemove = Math.abs(a); // abs is used to remove negative(-) sign
        System.out.println("Answer is " + signRemove);
    } 
}

