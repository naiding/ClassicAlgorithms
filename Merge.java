public class Merge {
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int N = array.length;
        int[] aux = new int[N];
        sort(array, aux, 0, N - 1);
    }

    private static void sort(int[] array, int[] aux, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(array, aux, left, mid);
        sort(array, aux, mid+1, right);
        merge(array, aux, left, mid, right);
    }

    private static void merge(int[] array, int[] aux, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            aux[i] = array[i];
        }

        int i = left, j = mid+1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > right) {
                array[k] = aux[i++];
            } else if (array[j] < aux[i]) {
                array[k] = aux[j++];
            } else {
                array[k] = aux[i++];
            }
        }
    }
}