import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        Shuffle.shuffle(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void shuffle(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int N = array.length;
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(i + 1);
            swap(array, i, r);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}