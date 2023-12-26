# Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list. If the number of nodes in the linked list is even, there will be two middle nodes, so return the second one.

Constraints:

Let n be the number of nodes in a linked list.

- 1 ≤ n ≤ 100
- 1 ≤ node.data ≤ 100
- head ≠ NULL

## Solution

In the naive approach, we use an external array to store the elements of the linked list, and then we return the element present at the index ⌊array.length/2⌋ as the middle node of the linked list. The time and space complexity of this approach is O(n), where n is the number of nodes in the linked list.

We can use the fast and slow pointers to solve this problem with constant space complexity. The following steps are applied:

1. Create two pointers, slow and fast, initially at the head of the linked list.
2. While traversing the linked list, move the slow pointer one step forward and the fast pointer two steps forward.
3. When the fast pointer reaches the last node or NULL, the slow pointer will point to the middle node of the linked list. Return the node that the slow pointer points to.

TODO
![](../../../../../../img/11.52.22.png)

### Time complexity

The time complexity of the algorithm is O(n), where nn is the number of nodes in the linked list.

### Space complexity

The space complexity for this algorithm is O(1).