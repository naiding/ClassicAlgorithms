public class Quick {
    
    /* 
     *  classic quick sort
     */
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Shuffle.shuffle(array);
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left <= right) {
            return;
        }
        int mid = partition(array, left, right);
        sort(array, left, mid-1);
        sort(array, mid+1, right);

    }

    private static int partition(int[] array, int left, int right) {
        int i = left, j = right + 1;
        while (true) {
            while (array[++i] < array[left]) {
                if (i == right) {
                    break; 
                }
            }

            while (array[--j] > array[left]) {
                if (j == left) {
                    break;
                }
            }

            if (i >= j) {
                break;
            } else {
                swap(array, i, j);
            }
        }
        swap(array, left, j);
        return j;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /* 
     * quick select
     */ 
    public static int select(int[] array, int k) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VAL;
        }

        Shuffle.shuffle(array);
        int left = 0, right = array.length - 1;
        while (right > left) {
            int j = partition(array, left, right);
            if (j < k) {
                left = j + 1;
            } else if (j > k) {
                right = j - 1;
            } else {
                return array[k];
            }
        }
        return array[k];
    }

    /* 
     * 3-way quick sort
     * [0, lt) < V
     * [lt, i) = V
     * [i, gt] to explore
     * (gt, N-1] > V
     */

    public static sort3Way(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Shuffle.shuffle(array);
        sort3Way(array, 0, array.length - 1);
    }

    private static sort3Way(int[] array, int left, int right) {
        if (right <= left) {
            return ;
        }
        int lt = left, gt = right, i = left;
        int v = array[left];
        while (i <= gt) {
            if (array[i] < v) {
                swap(array, lt++, i++);
            } else if (array[i] > v) {
                swap(array, i, gt--);
            } else {
                i++;
            }
        }

        sort3Way(array, left, lt - 1);
        sort3Way(array, gt + 1, right);
    }
}