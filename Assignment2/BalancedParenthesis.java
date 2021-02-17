package Assignment2;

public class BalancedParenthesis {
    static void printParenthesis(char[] s,int pos, int o, int c, int n) {
        
        if(c == n) {
            for(int i=0; i<s.length; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
            return;
        }
        else {
            if(c<o) {
                s[pos] = '}';
                printParenthesis(s, pos+1, o, c+1, n);
            }
            if(o<n) {
                s[pos] = '{'; 
                printParenthesis(s, pos+1, o+1, c, n);
            }
            
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[] s = new char[n*2];
        printParenthesis(s, 0, 0, 0, n); 
    }
}
