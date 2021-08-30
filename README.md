# MergeSort

## Whiteboard Process

### problem domain : Write a function that accepts an array of unsorted integers, and returns a sorted array by a recursive merge sort algorithm.
### algorithm : 
#### * Divide by finding the number m of the position midway between l and r. Do this step the same way we found the midpoint in binary search: add ppp and r, divide by 2, and round down.
#### *  Conquer by recursively sorting the subarrays in each of the two subproblems created by the divide step. That is, recursively sort the subarray array[l..r] and recursively sort the subarray array[m+1..r].
#### *  Combine by merging the two sorted subarrays back into the single sorted subarray array[l..r].

## Approach & Efficiency
### O(n) space
### O(n log n)

### Solution
#### int[] arr = {7, 5, 13, 11, 6, 12};
#### MergeSort.sort(arr);
#### [5, 6, 7, 11, 12, 13]

#### Given Array
#### [7, 5, 13, 11, 6, 12]
#### A 7, 5, 13 ||  11, 6, 12

#### B 7, 5, || 13     11 ,6 || 12

#### C 7 || 5          11 || 6  
************************************
#### C
#### [7] leftArray
#### [5] rightArray
####  7 > 5    => 
#### [5, 7]  originalLeftArray
**********************************
#### B
#### [5,7] leftArray
#### [13] rightArray
#### 5 < 13 & 7 <13    => 
#### [5, 7, 13] originalLeftArray
***********************************
#### C2
#### [11] leftArray
#### [6] rightArray
#### 11 > 6   => 
#### [6, 11] originalRightArray
***********************************
#### B2
#### [6, 11] leftArray
#### [12] rightArray
#### 6 < 12 & 11 <12    => 
#### [6, 11, 12] originalRightArray
***********************************
#### [5, 7, 13] originalLeftArray
#### [6, 11, 12] originalRightArray
####  5 < 6    => [5]
####  7 > 6     => [5,6]
####  7 < 11     => [5,6,7]
#### 13 > 11      => [5,6,7,11]
#### 13 > 12        => [5,6,7,11,12]
#### 13              => [5,6,7,11,12,13]   
#### Sorted array
#### [5, 6, 7, 11, 12, 13]

## Pseudo Code

```ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```


