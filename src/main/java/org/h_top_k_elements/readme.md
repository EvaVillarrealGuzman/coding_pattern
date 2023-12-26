# Top k elements

The top K elements pattern helps find some specific k number of elements from the given data with optimum time complexity.

Many problems ask us to find the top, the smallest, or the most/least frequent k elements in an unsorted list of elements. To solve such problems, sorting the list takes O(nlog(n)) time, then finding the k elements takes O(k) time. However, the top k elements pattern can allow us to solve the problem using O(n.logk) time without sorting the list first.

Which data structure can we use to solve such problems? The best data structure to keep track of the smallest or largest k elements is heap. With this pattern, we either use a max-heap or a min-heap to find the smallest or largest k elements, respectively.

For example, let’s look at how this pattern takes steps to solve the problem of finding the top k largest elements (using min-heap) or top k smallest elements (using max-heap):

1. Insert the first k elements from the given set of elements to the min-heap or max-heap.
2. Iterate through the rest of the elements.  
    a. For min-heap, if you find the larger element, remove the top (smallest number) of the min-heap and insert the new larger element.  
    b. For max-heap, if you find the smaller element, remove the top (largest number) of the max-heap and insert the new smaller element.  

Iterating the complete list takes O(n) time, and the heap takes O(log⁡k) time for insertion. However, we get the O(1) access to the k elements using the heap.

Let’s look at the following illustration to understand how we can use min-heap to find the top k elements.

![](../../../../../img/14.47.43.png)

## Conditions

- We need to find the largest, smallest, most frequent, or least frequent subset of elements in an unsorted list.
- This may be the requirement of the final solution, or it may be necessary as an intermediate step toward the final solution.


## Examples

- Short characters by frequency

![](../../../../../img/14.24.44.png)

- Connect n ropes with minimum cost

![](../../../../../img/14.24.44.png)

### Real-world problems

Many problems in the real world use the top K elements pattern. Let’s look at some examples.

- Uber: Select at least the n nearest drivers within the user’s vicinity, avoiding the drivers that are too far away.
- Stocks: Given the set of IDs of brokers, determine the top K broker’s performance with the frequently repeated IDs in the given data set.

