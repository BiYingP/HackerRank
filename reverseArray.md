Array - DS

An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, A, of size N, each memory location has some unique index, i, that can be referenced as A[i]. Reverse an array of integers.

Example

A = [1,2,3]

return [3,2,1]



    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int i = 0;
        int j = a.size()-1;
        while(i < j){
            int temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            i++;
            j--;
        }
        return a;

    }
