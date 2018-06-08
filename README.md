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
