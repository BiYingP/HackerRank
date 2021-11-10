Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.

Example

a = [1,1,2,2,4,4,5,5,5]

There are two subarrays meeting the criterion:[1,1,2,2]  and [4,4,5,5,5]. The maximum length subarray has  elements.

Returns
int: the length of the longest subarray that meets the criterion

Sample input

6
4 6 5 3 3 1

Sample output

3


    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int max = 0;
    int[] count = new int[100];
    for (int i = 0; i < a.size(); i ++){
        count[a.get(i)]++;
    }
    for (int i = 1; i < count.length; i++){
        if (max < count[i] + count[i-1]){
            max = Math.max(count[i], count[i]+ count[i-1]);
        }
    }
    return max;
    }

