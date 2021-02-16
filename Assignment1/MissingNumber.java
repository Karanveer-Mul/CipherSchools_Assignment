public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};

        int sum = 0;
        int sumArr = 0;

        for(int i=0; i<arr.length; i++) {
            sumArr += arr[i];
            sum += i + 1;
        }

        System.out.println(sum + arr.length + 1 - sumArr);
    }
}
