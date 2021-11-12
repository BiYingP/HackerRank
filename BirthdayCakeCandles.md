Birthday Cake Candles

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example

candles = [4,4,1,3]

Then max height candles are 4 units high. There are 2 of them, so return 2.


    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int tallest = 0;
    int count = 0;

    for (int n : candles){
        if (n > tallest){
            tallest = n;
        }
    }
    for (int n : candles){
        if (n == tallest){
            count++;
        }
    }
    return count;
    }
