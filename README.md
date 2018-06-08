#### Classic Algorithms

This is the implementation of classic algorithms, such as sorting algorithms.

For remembering and reviewing.



#### Contents

1. **Selection Sort**: uses $\sim N^2/2$ compares and $N$ exchanges.

2. **Insertion Sort**: uses $\sim N^2/4$ compares and $\sim N^2 / 4$ exchanges on average.

   For partially-sorted array, insertion sort runs in linear time.

3. **Shell Sort**: 3x+1 - 1, 4, 13, 40, .... Worse time complexity is $O(N^{3/2})$, no more than $2.5NlogN$.

4. **Knuth Shuffle**: In iteration, pick integer `r` between `0` and `i` uniformly at random and then swap `a[i]` and `a[r]`. 

5. **Merge Sort**: Time complexity $O(NlogN)$, space complexity $O(N)$.

   >  Optimization
   >
   > - Use insertion sort for small subarrays. (Merge sort has too much overhead for tiny subarrays, and we can cutoff to insertion sort for ~ 7 items).
   > - Stop if already sorted. After sorting left part and right part, check if `a[mid]<a[mid+1] ` , if it's true, then return before merge.

6. **Bottom-Up Merge Sort**:  Time complexity $O(NlogN)$, space complexity $O(N)$.

7. **Quick Sort**: Time complexity is $O(NlogN)$, space complexity is $O(1)$.

   > Optimization
   >
   > - Use insertion sort for small subarray.
   >
   > - Best choice of pivot item = median. Estimate true median by taking median of sample. Median-of-3(random) items. 
   >
   >   ```java
   >   int m = medianOf3(a, left, left + (right - left) / 2, right);
   >   swap(a, left, m);
   >   ```

8. **Quick Select**: $O(N)$ to find the k-th smallest item in an array.

9. **3-Way Quick Sort**: to handle too many duplicate keys. (Classic quick sort will sort equal keys in next recursion)

![](.\sorting-summary.png)