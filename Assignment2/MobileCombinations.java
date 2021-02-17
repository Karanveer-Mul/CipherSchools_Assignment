package Assignment2;

public class MobileCombinations {
    
    

    static void possibleCombinations(int[] num, char[] word, int count, int len, char[][] keyboard) {
        if(count == len) {
            for(char c: word) {
                System.out.print(c);
            }
            System.out.print(" ");
            return;
        }
        if(count<len) {
            for(int i=0; i<keyboard[num[count]].length; i++) {
                word[count] = keyboard[num[count]][i];
                possibleCombinations(num, word, count+1, len, keyboard);
            }
        }
        


    }
    
    public static void main(String[] args) {
        char[][] keyboard = new char[10][5];
        keyboard[0] = new char[]{'\0'};
        keyboard[1] = new char[]{'\0'};
        keyboard[2] = new char[]{'a','b','c'};
        keyboard[3] = new char[]{'d','e','f'};
        keyboard[4] = new char[]{'g','h','i'};
        keyboard[5] = new char[]{'j','k','l'};
        keyboard[6] = new char[]{'m','n','o'};
        keyboard[7] = new char[]{'p','q','r','s'};
        keyboard[8] = new char[]{'t','u','v'};
        keyboard[9] = new char[]{'w','x','y','z'};
        int[] num = {3, 2, 4};
        char[] word = new char[num.length]; 
        possibleCombinations(num, word, 0, num.length, keyboard);
    }
}
