public class Array {
    // Q1:- Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public boolean containsDuplicate(int num[]){
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // Q2:- You are given an array prices where prices[i] is the price of a given stock on the ith day. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    public int maxProfit(int prices[]){
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buy < prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            }
            else{
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        // Q1
        // int num[] = {1, 2, 3, 1, 4};
        // Array arr = new Array();
        // boolean containsDuplicate = arr.containsDuplicate(num);
        // System.out.println(containsDuplicate);

        // Q2
        int prices[] = {2, 1, 4, 8, 2, 5, 10, 3};
        Array arr = new Array();
        int maxProfit = arr.maxProfit(prices);
        System.out.println(maxProfit);
    }  
}
