package Assignment1;

public class TwoPeopleMeet {
    public static String doesMeets(int x1, int x2, int v1, int v2) {
        if(x1>x2 && v1>=v2) return "No";
        if(x2>x1 && v2>=v1) return "No";

        if(x1<x2) {
            x1 = x1 + x2;
            x2 = x1 - x2;
            x1 = x1 - x2;
            v1 = v1 + v2;
            v2 = v1 - v2;
            v1 = v1 - v2;
        }
        /* O(n)
        while(x1>=x2) {
            if(x1 == x2) return "Yes";
            x1 += v1;
            x2 += v2;
        } 
        */

        //O(1) 
        if((x1-x2)%(v1-v2) == 0) return "Yes";

        return "No";
    }

    public static void main(String[] args) {
        int[] x1 = {3,4,5,6,7};
        int[] x2 = {5,6,8,4,3};

        int[] v1 = {5,6,8,4,3};
        int[] v2 = {6,3,7,1,4};

        for(int i=0;i<x1.length; i++) {
            System.out.println(x1[i] + " " + x2[i]);
            System.out.println(v1[i] + " " + v2[i]);
            System.out.println(doesMeets(x1[i], x2[i], v1[i], v2[i]));
        }
        
    }
}