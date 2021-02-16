package Assignment2;

public class Factorial {
    int facotorial(int n) {
        if(n==0) return 1;
        if(n==1) return 1;

        int fact = n;
        fact *= facotorial(n-1);

        return fact;
    }

    public static void main(String[] args) {
        Factorial ob = new Factorial();
        System.out.println(ob.facotorial(0));
    }
}
