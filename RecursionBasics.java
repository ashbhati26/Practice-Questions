public class RecursionBasics {
    // Q1
    public static void allOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurence(arr, key, i+1);
    }
    // Q2
    public static void printdigits(int number, String digits[]){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printdigits(number/10, digits);
        System.out.print(digits[lastDigit] + " ");
    }
    // Q3 
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    // Q4
    public static int countSubStrs(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int res = countSubStrs(str, i+1, j, n-1) + 
        countSubStrs(str, i, j-1, n-1) - countSubStrs(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    // Q5
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        // transfer top n-1 from source to helper using destination as helper
        towerOfHanoi(n-1, source, destination, helper);
        // transfer n from source to destination
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        // transfer n-1 form helper to destination using source as helper
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        // Q1
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // allOccurence(arr, key, 0); // i is for index 

        // Q2
        // int number = 1947;
        // String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // printdigits(number, digits);

        // Q3
        // String str = "abcde";
        // System.out.println(length(str));

        // Q4
        // String str = "abcab";
        // int n = str.length();
        // System.out.println(countSubStrs(str, 0, n-1, n));

        // Q5
        int n = 3;
        String source = "A";
        String helper = "B";
        String destination = "C";
        towerOfHanoi(n, source, helper, destination);
    }
}