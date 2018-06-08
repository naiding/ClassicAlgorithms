public class Shell {
    public static void sort(int[] array) {
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    swap(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}