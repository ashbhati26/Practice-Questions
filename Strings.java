import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Q1:- Count how many times lowercase vowels occurred in a String entered by the user
        // System.out.println("Type something...");
        // String str = new Scanner(System.in).next();
        // int count = 0;
        // for(int i = 0; i < str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         count++;
        //     }
        // }
        // System.out.println("count of vowels is : " + count);

        // Q2:-  What will be the output of the following code?
        // String str = "Round";
        // String str1 = "Square";
        // String str2 = "Round";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // Q3:- What will be the output of the following code?
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        // Q4:- Determine if 2 Strings are anagrams of each other.
        String str1 = "earth";
        String str2 = "heart";
        // convert Strings to lowercase because we don't have to check separately for lower and uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check if the lenghts are the same
        if(str1.length() == str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrms of each other");
        }
    }
}