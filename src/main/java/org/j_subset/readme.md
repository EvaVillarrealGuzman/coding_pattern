# Subset

The subsets pattern is useful in finding the permutations and combinations of elements in a data structure. The input data structure might be a set containing unique elements. It can also be an array, or a list, which may contain duplicate elements. We then make a series of subsets from the elements in this data structure. The specific subsets generated are based on the conditions that the problem provides us.

We use backtracking to generate the required subsets of a given data structure of elements. The method is to build the subsets incrementally, including or excluding each element of the original data structure, depending on the constraints of the problem. This process is continued recursively for the remaining elements until all desired subsets have been generated.

The following illustration shows how subsets are made from a given array:

![](../../../../../img/14.47.43.png)

> Note: While subsets can be generated using backtracking, not all problems solved using backtracking involve subsets. Backtracking applies to a broader range of problems where exhaustive search, that is, evaluating all possibilities, is required. These problems may involve various constraints, rules, or conditions that guide the exploration process.

## Conditions

- The problem requires creating permutations or combinations of the elements in the input data structure, either as the final solution or as an intermediate step.

## Examples

![](../../../../../img/14.24.44.png)


![](../../../../../img/14.24.44.png)

### Real-world problems

Many problems in the real world use the subsets pattern. Let’s look at some examples.

- Movie combinations: Create a combination of movies, chosen from the given list of genres in a specific sequence.
- Movie viewing orders: Generate all possible permutations of a given list of movies to provide options for a movie marathon.
- Total cost of shopping items: An equation calculating the total cost of items needs to be divided into subsets of items.
