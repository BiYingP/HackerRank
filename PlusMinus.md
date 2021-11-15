Plus Minus

Given an array of integers, calcautate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.

Example 

arr = [1,1,0,-1,-1]

There are n = 5 elments, two positive, two negative and one zero. Their ratios are 2/5=0.400000, 2/5=0.400000, and 1/5=0.200000.


    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float count_postive = 0;
    float count_negative = 0;
    float count_zero = 0;
    
    for (int num : arr){
        if (num > 0){
            count_postive++;
        }
        else if (num < 0){
            count_negative++;
        }
        else if (num == 0){
            count_zero++;
        }
    }
    System.out.println(count_postive / arr.size());
    System.out.println(count_negative / arr.size());
    System.out.println(count_zero / arr.size());
    }
