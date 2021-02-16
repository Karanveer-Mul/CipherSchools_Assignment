package Assignment2;

public class FibonacciNumber {
    int fibonnaci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int fibSum =0;
        fibSum += fibonnaci(n-1) + fibonnaci(n-2);
        
        return fibSum;
    }

    public static void main(String[] args) {
        FibonacciNumber ob = new FibonacciNumber();
        System.out.println(ob.fibonnaci(9));

    }
}
