Fibonacci Modified

Implement a modified Fibonacci sequence using the following definition

Given terms t[i] and t[i+1] where i in (1, infinity), term t[i+2] is computed as 

ti+2 = ti + (ti+1)**2

Given three integers, t1, t2, and n, compute and print the nth term of a modified Fibonacci sequence.

Example

t1 = 0
t2 = 1
n = 6

t3 = 0 + 1**2 = 1
t4 = 1 + 1**2 = 2
t5 = 1 + 2**2 = 5
t6 = 2 + 5**2 = 27

return 27

Java:

    public static int fibonacciModified(int t1, int t2, int n) {
    // Write your code here
    int temp = 0;
    for (int i = 2; i < n; i++){
        temp = t2;
        t2 = t1+t2*t2;
        t1 = temp;
    }
    return t2;
    }

Python:

def fibonacciModified(t1, t2, n):
    # Write your code here
    for i in range(2, n):
        # temp = t2
        # t2 = t1 + t2 * t2
        # t1 = temp
        t1, t2 = t2, t1+t2*t2
    return t2
