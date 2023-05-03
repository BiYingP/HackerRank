Left Rotation

A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer d, rotate the array that many steps left and return the result.

Example

d = 2

arr = [1,2,3,4,5]

After 2 rotations, arr = [3,4,5,1,2]



    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        // List<Integer> res = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < d; j++){
            arr.add(arr.remove(i));
        }
        return arr;
    }
