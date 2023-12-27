# Stacks

A stack is a linear data structure that follows a last in, first out (LIFO) order to perform operations on its elements. This means that whenever we obtain an element from the stack, it will always return the last inserted element. It’s widely used by programmers to solve computational problems.

A stack has two primary operations – push and pop. The push operation adds an element to the top of the stack while the pop operation removes an element from the top of the stack. Unlike a list, an element can only be added to the top of the stack, and to add an element at some specified index, all elements at the top of that index must first be removed from the stack and then reinserted.

A stack has many real-world uses, which you might be performing in your daily life without being aware of. For example, consider a pile of plates placed on each other. To get to the bottom plate, all plates on top must be removed first. The plate at the top is the first to be removed, and the plate at the bottom is the last to be removed. This is just one example of a stack used in the real world.

Stacks in programming are used to store elements that are sequentially dependent on each other. When required, the elements can then be popped from the stack while maintaining a fixed order. The nature and correlation of these elements are to be decided by you, as the programmer when deciding how to implement the stack based on the problem at hand. In addition, they are used when elements need to be stored in a safe manner where it is not desirable to modify them from an arbitrary position such as the middle. Repeatedly modifying a stream of elements is another property of the stack where elements are pushed onto it and then popped when certain specified conditions are met between the top of the stack and the next incoming element.

The following illustration demonstrates the push and pop functionality of the stack:

![](../../../../../img/14.47.43.png)


## Conditions

-  If you want to get elements out in the reverse order in which you inserted them (LIFO).

## Examples

![](../../../../../img/14.24.44.png)

![](../../../../../img/14.24.44.png)

### Real-world problems

Many problems in the real world share the stack pattern. Let’s look at some examples.

- Checking code files: Stacks are used in compilers to check if the parentheses in a code file are balanced.
- Undo/redo functionality: Stacks are commonly used to undo/redo things while editing.
- Recursive call stacks: The compiler internally calls stack itself when storing information about the recursion calls. Stacks facilitate recursive subroutines where the state of every call is gathered in a stack frame and then put on a stack.

