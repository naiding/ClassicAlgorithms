public class Insertion {
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        } 

        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j+1] < array[j]; j--) {
                swap(array, j, j+1);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}