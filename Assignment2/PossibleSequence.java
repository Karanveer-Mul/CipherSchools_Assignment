package Assignment2;

public class PossibleSequence {
    static int getCount(char[] word, int n) {
        if(word.length == 0) return 0;
        
        if(n <=1) return 1;
        
        if(word[0] == '0') return 0;

        int count = 0;

        if(word[n-1] > '0') count = getCount(word, n-1);

        if(word[n-1] <= '6' && (word[n-2] == '2' || word[n-2] == '1')) {
            count += getCount(word, n-2);
        }

        return count;
    }



    public static void main(String[] args) {
        char[] word = {'1', '2','6', '5'};
        System.out.println(getCount(word, word.length));
    }
}
