Staircase

Staircase detail

This is a staircase of size n= 4

   #
  ##
 ###
####

Its base and height are both equal to n. It is drawn using # symbols ans spaces.


    public static void staircase(int n) {
    // Write your code here
    // String star = "#";
    // String space = " ";
    char[] c = new char[n];
    Arrays.fill(c, ' ');
    for (int i = n-1; i >= 0; i--){
        c[i] = '#';
        System.out.println(new String(c));
        // String space = new String(new char[n-i]);
        // String star = new String(new char[i]);
        // System.out.println(space.replace("\0", " ")  + star.replace("\0", "#"));
  
    }

    }  
