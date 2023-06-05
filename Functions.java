public class Functions {
    //Q1:- Write a Java method to compute the average of three numbers
    // public static double avg(double x, double y, double z){
    //     return (x+y+z)/3;
    // }

    // Q2:- Write a method named isEven that accepts an int argument. 
    // The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
    // public static boolean isEven(int number){
    //     if(number%2 == 0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // Q3:- Write a Java program to check if a number is a palindrome in Java?
    // public static boolean isPalindrome(int number){
    //     int num = number;
    //     int reverse = 0;
    //     while(num != 0){
    //         int remainder = num%10;
    //         reverse = reverse * 10 + remainder;
    //         num = num/10;
    //     }
    //     if(number == reverse){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // Q4:-Write a Java method to compute the sum of the digits in an integer
    // public static int sumOfDigit(int number){
    //     int sumOfDigit = 0;
    //     while(number > 0){
    //         int lastDigit = number%10;
    //         sumOfDigit = sumOfDigit + lastDigit;
    //         number = number/10;
    //     }
    //     return sumOfDigit;
    // }
    public static void main(String[] args) {
        //Q1:- Write a Java method to compute the average of three numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Number");
        // double x = sc.nextDouble();
        // System.out.println("Enter Second Number");
        // double y = sc.nextDouble();
        // System.out.println("Enter Third Number");
        // double z = sc.nextDouble();
        // System.out.println("Average of three numbers is" + avg(x, y, z));

    // Q2:- Write a method named isEven that accepts an int argument. 
    // The method should return true if the argument is even, or false otherwise. Also write a program to test your method. 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int number = sc.nextInt();
        // System.out.println(isEven(number));

    // Q3:- Write a Java program to check if a number is a palindrome in Java? 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // if(isPalindrome(num)) {
        //     System.out.println("Number : " + num + " is a palindrome");
        // } 
        // else {
        //     System.out.println("Number : " + num + " is not a palindrome");
        // }

    // Q4:- Write a Java method to compute the sum of the digits in an integer
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int number = sc.nextInt();
        // System.out.println(sumOfDigit(number));
    } 
}
