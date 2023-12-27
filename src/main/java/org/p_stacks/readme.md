# Stacks


![](../../../../../img/14.47.43.png)


## Conditions

- A partial ordering of the given elements is required.
- The problem asks you to find an ordering of elements based on some dependency rules between them.

## Examples

![](../../../../../img/14.24.44.png)

![](../../../../../img/14.24.44.png)

### Real-world problems

Many problems in the real world use the topological sort pattern. Let’s look at an example.

Topological sort can be used for process scheduling in a computer system. When a system is booted, the operating system needs to run a number of processes. Some processes have dependencies, which are specified using ordered pairs of the form (a,b). This means that process b must be run before process a. Some processes don’t have any dependencies, meaning they don’t have to wait for any processes to finish. Additionally, there cannot be any circular dependencies between the processes like (a,b)(b,a). In order to successfully start the system, the operating system needs to select an order to run the processes in. The processes should be ordered in such a way that whenever a process is scheduled to run, all of its dependencies are already met.

These processes can be represented in the form of a graph where the vertices are the processes and the edges represent their dependency relationships. This makes scheduling a perfect example of the topological sort pattern.