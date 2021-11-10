Compare the Triplets


The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.

a = [1, 2, 3]
b = [3, 2, 1]

For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here

    List<Integer> res = new ArrayList();
    int[] count = new int[2];
    for (int i = 0; i < a.size(); i++){
        if (a.get(i) > b.get(i)){
            count[0] += 1;
        }
        else if (a.get(i) == b.get(i)){
            count[0] += 0;
            count[1] += 0;
        }
        else if (a.get(i) < b.get(i)){
            count[1] += 1;

        }
    }
    for (int i = 0 ; i < count.length; i++){
        res.add(count[i]);
    }
    return res;
    }
}
