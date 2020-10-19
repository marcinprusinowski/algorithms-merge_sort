# Merge Sort!

Merge Sort like Quick Sort is an algorithm from the Divide and Conquer group.
It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge function is to merge those sorted arrays which were spited before into sorted one.

Glad we have such portal as Wikipedia and we can just take a look at every step of Merge sort.
![Wikipedia](https://upload.wikimedia.org/wikipedia/commons/6/60/Mergesort_algorithm_diagram.png)
To sum up mechanism lets point key procedures.
1. Division of given array to two separated 
2. Recusive call of each sub array till the given array has one element.
3. Call merge function to connect sorted sub-arrays 
# Conclusion
Merge sort is not in place sorting algorithm, because of dividing array nature. So its memory complexity is O(n) as we can se in the picture above when we have a situation when every single element of base array is in its own array.
Merge sort is recursive algorithm.
Time complexity of Merge Sort is O(n logn) as merge sort always **divides** the array in two halves and takes linear time to **merge** two halves.
Feel free to download the code and try, but I suggest you to implement it by yourself first.
