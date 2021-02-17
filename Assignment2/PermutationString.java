package Assignment2;

public class PermutationString {
    
    static void getPermutations(char[] s, int count, int len) {
    
        if(count == len) {
            for(char x: s) {
                System.out.print(x);
            }
            System.out.print(" ");
            return;
        }

        for(int i=count; i<=len; i++) {
            s = swap(s, count, i);
            getPermutations(s, count+1, len);
            s = swap(s, count, i);
        }
    } 

    static char[] swap(char[] s, int i, int j) {

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        return s;
    }

    public static void main(String[] args) {
        
        char[] c = {'A','B','C','D'};
        
        getPermutations(c, 0, c.length-1);
    }
}
