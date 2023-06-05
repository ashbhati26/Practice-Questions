import java.util.*;
public class VariableAndDataType {
    public static void main(String[] args) {
        // Q1  In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers
        int A = 10;
        int B = 12;
        int C = 11;
        int avg = (A+B+C)/3;
        System.out.println("Average of the given number is : " + avg);

        // Q2 In a program, input the side of a square. You have to output the area of the square.
        int side = 10;
        int area = side*side;
        System.out.println("Area of given square is : " + area);

        // Q3 Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of a pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        // Add on 18% GST
        float newBill = total + (0.18f * total);
        System.out.println("New Bill : " + newBill);

        // Q4 What will be the type of result in the following Java code?
        byte b = 4;
        char c = 'a';
        int i = 10000;
        float f = 3.14f;
        double d = 99.9954;
        // In the mentioned code, the result variable will be of double type because of type conversion

        // Q5 Will the following statement give any error in Java?
        int $ = 24;
        // No, the statement will not give any error.
        // Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
        // According to the rule the given variable name is a valid identifier
    }
}
