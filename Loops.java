import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1 How many times 'Hello' is printed?
        // for(int i=0; i<5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }
        // Hello is printed 2 times

        // Q2 Write a program that reads a set of integers, and then prints the sum of the even and odd integers
        // int evenSum = 0;
        // int oddSum = 0;
        // int choice;
        // do{
        //     System.out.print("Enter a number: ");
        //     int num = sc.nextInt();
        //     if(num%2 == 0){
        //         evenSum = evenSum + num;
        //     }
        //     else{
        //         oddSum = oddSum + num;
        //     }
        //     System.out.print("Press 1 to continue and press 0 to exit: ");
        //     choice = sc.nextInt();
        // }
        // while(choice == 1);
        // System.out.println("Sum of even number: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // Q3 Write a program to find the factorial of any number entered by the user.
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i <= num; i++){
        //     fact = fact*i;
        // }
        // System.out.println("Factorial of " + num + " is " + fact);

        // Q4 Write a program to print the multiplication table of a number N, entered by the user.
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // for(int i = 1; i <= 10; i++){
        //     int prod = num*i;
        //     System.out.println(num + " * " + i + " = " + prod);
        // }

        // Q5 What is wrong in the following program?
        // for(int i = 0; i <= 5; i++ ) {
        //     System.out.println("i = " + i );
        // }
        // System.out.println("i after the loop = " + i );
        // Answer:- In this program variable i is declared in the for loop. So scope of variable i is limited to the for loop only that is between { and } of the for loop. 
        // There is a display statement after the for loop where variable i is used which means i is used out of scope. 
        // This leads to compilation errors.
    }  
}
