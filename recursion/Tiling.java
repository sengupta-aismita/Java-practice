public class Tiling {

    public static int ways(int n){ //2 x n(floor size)
        if(n == 0 || n == 1)
        return 1;
        //vertical choice
        //return ways(n-1);
        //horizontal choice
        //return ways(n-2);

        //totalways
        return ways(n-1) + ways(n-2);
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}

//Time complexity O(2n)