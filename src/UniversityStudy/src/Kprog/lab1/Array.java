package UniversityStudy.src.Kprog.lab1;

/**
 * Created by Sukora Stas.
 */
public class Array {
    private int[] arr1;
    private int[] arr2;

    public Array(int size_arr1, int size_arr2) {
        arr1 = random(size_arr1);
        arr2 = random(size_arr2);
    }

    private int[] random(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public int[] getArr1() {
        return arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

}
