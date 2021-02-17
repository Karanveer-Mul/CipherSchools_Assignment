package Assignment1;

public class DynamicArray {
    
    private int[] arr;
    private int size;
    private int count;

    DynamicArray() {
        arr = new int[1];
        size = 1;
        count = 0;
    }

    void doubleSize() {
        int[] newArr = new int[size*2];

        for(int i=0; i<size; i++) {
            newArr[i] = arr[i];
        }
        
        arr = newArr;
        size *= 2;
    }

    void add(int val) {
        if(count == size) {
            doubleSize();
        }
        arr[count] = val;
        count++;
    }

    void correctSize() {
        int[] newArr = new int[count];

        for(int i=0; i<count;i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        size = count;
    }

    void addAt(int i, int val) {
        if(count == size) {
            doubleSize();
        }

        for(int j=count-1; j>= i; j--) {
            arr[j+1] = arr[j];
        }

        arr[i] = val;
        count++;
    }

    void remove() {
        if(count>0) {
            arr[count-1] = 0;
            count--;
        }
    }

    void removeAt(int i) {
        if(count>0) {
            for(int j=i; j<count-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[count-1] = 0;
            count--;
        }
    }

    public static void main(String[] args) {
        
        DynamicArray ob = new DynamicArray();

        ob.add(2);
        ob.add(5);
        ob.add(3);
        ob.add(6);
        ob.add(7);
        ob.add(1);
        ob.add(4);
        ob.add(8);
        ob.add(3);
        
        for(int x:ob.arr) {
            System.out.print(x + " ");
        }

        
    }

}
