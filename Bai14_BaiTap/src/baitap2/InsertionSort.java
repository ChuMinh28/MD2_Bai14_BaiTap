package baitap2;

public class InsertionSort {
    void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j>=0&&array[j]>key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
    }
    static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,3,7,9,8,3};
        System.out.println("Array before sort: ");
        printArray(array);
        InsertionSort sort = new InsertionSort();
        sort.sort(array);
        System.out.println("Array after sort: ");
        printArray(array);
    }
}
