Min-Max Sum

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

arr = [1.3,5,7,9]

The min sum is 1+3+5+7=16 and max sum is 3+5+7+9=24. The function prints:

16 24


    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min = arr.get(0);
    long max = arr.get(0);
    long sum = 0;
    
    for (int n : arr){
        sum += n;
        if (min > n) min = n;
        if (max < n) max = n;
    }
    // for (int i = 0; i < arr.size(); i++){
    //         sum += arr.get(i);
    //         if (min > arr.get(i)) min = arr.get(i);
    //         if (max < arr.get(i)) max = arr.get(i);
    //     }
    System.out.println((sum-max) + " " + (sum-min));

    }
