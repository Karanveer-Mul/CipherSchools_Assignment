package Assignment1;

public class MinimumPlatform {
    
    static int numberOfPlatform(int[] arv, int[] dep) {
        int count = 0, plat_needed = 0;

        for(int i=0; i<arv.length; i++) {
            plat_needed = 1;

            for(int j=i+1; j<arv.length; j++) {
                if((arv[i] >= arv[j] && arv[i] <= dep[j]) || (arv[j] >= arv[i] && arv[j] <= dep[i])) plat_needed++;
            }

            count = Math.max(count, plat_needed);
        }

        return count;
    } 
    
    public static void main(String[] args) {
        int arv[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(numberOfPlatform(arv, dep));
    }
}
