public class MergeBU {
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int N = array.length;
        int[] aux = new int[N];
        for (int sz = 1; sz < N; sz = sz+sz) {
            for (int i = 0; i < N - sz; i += sz+sz) {
                merge(array, aux, i, i+sz-1, Math.min(i+sz+sz-1, N-1));
            }
        }
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