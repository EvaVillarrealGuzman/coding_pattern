# Find the duplicate number

Given an unsorted array of positive numbers, nums, such that the values lie in the range [1,n], inclusive, and that there are n+1 numbers in the array, find and return the duplicate number present in nums. There is only one repeated number in nums.

> Note: You cannot modify the given array nums. You have to solve the problem using only constant extra space.

Constraints:

- 1 ≤ n ≤ 1031
- nums.length = n+1
- 1 ≤ nums[i] ≤ n
- All the integers in nums are unique, except for one integer that will appear more than once.

## Solution

### Time complexity

The time complexity of the algorithm is O(n), where n is the length of nums. This is because, in each part of the solution, the slow pointer traverses nums just once.

### Space complexity

The space complexity for this algorithm is O(1), since we only used constant space to store the fast and slow pointers.