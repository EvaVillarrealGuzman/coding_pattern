# Cyclic Sort

Cyclic sort is an in-place, unstable, comparison sort algorithm. It is based on the insight that subsequences of numbers in the input array that are not in sorted order actually describe cycles, and that the process of placing each number in its correct position removes these cycles.

The slides below illustrate a traversal through the given array in which the value of the element at the current position determines the next position in the traversal.

![](../../../../../img/14.47.43.png)

As shown in the slides above, we move in a cyclic manner from the 2nd element onwards, returning to the same element after eight moves.

The Cyclic Sort pattern works well for problems involving arrays with numbers ranging from [1−n], where nn is the length of the array, such that one or more cycles exist in it. The algorithm places each element at its correct position within the array. This is achieved by cycling through the array and swapping each element with the element where it should be, then repeating the same operation with the swapped element, continuing in this manner until all the cycles have been removed.

Let’s look at an illustration to understand how cyclic sort is used to sort an array.

![](../../../../../img/14.47.43.png)

## Conditions

- The problem requires sorting the array without using any additional memory, and the numbers in the array are in the range [1,n][1,n], where nn is the length of the array.
- The input array can be divided into cycles.

## Examples

![](../../../../../img/14.24.44.png)


![](../../../../../img/14.24.44.png)

### Real-world problems

Many problems in the real world share the cyclic sort pattern. Let’s look at some examples.

- Computational Biology: The species on a planet have n distinct genes numbered 1…n. Find the k^th missing​​ gene in a given DNA sequence.
- Data Validation: Cyclic sort can be used for data validation tasks, especially when dealing with datasets that are expected to have distinct values within a certain range. By applying cyclic sort to the dataset, you can quickly identify any missing or duplicate values, which can help in validating the integrity and accuracy of the data.
- Database Operations: Optimizing database operations often entails sorting arrays of distinct values. For instance, during database indexing, cyclic sort can be integrated into the sorting process, facilitating efficient organization of indexed values. This technique aids in expediting search operations and enhances overall database performance.
- Data Analysis and Visualization: In the field of data analysis and visualization, cyclic sort can be employed to sort and organize datasets that involve distinct categorical variables. For instance, if you have a dataset containing survey responses with multiple-choice questions, cyclic sort can be used to sort and arrange the responses according to the categories or choices provided.
