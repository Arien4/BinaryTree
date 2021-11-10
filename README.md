# BinaryTree
Here is the implementation of a binary tree in Java from https://www.baeldung.com/java-binary-tree.

For the sake of this tutorial, we'll use a sorted binary tree that contains int values.
A binary tree is a recursive data structure where each node can have 2 children at most.

> A common type of binary tree is a binary search tree, in which every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree.
> 
> For the implementation, we'll use an auxiliary Node class that will store int values, and keep a reference to each child.
> ## Inserting Elements
> The first operation we're going to cover is the insertion of new nodes.
>
> First, **we have to find the place where we want to add a new node in order to keep the tree sorted**. We'll follow these rules starting from the root node:
> 
> - if the new node's value is lower than the current node's, we go to the left child
> - if the new node's value is greater than the current node's, we go to the right child
> - when the current node is null, we've reached a leaf node and we can insert the new node in that position
> ## Finding an Element
> Now let's add a method to check if the tree contains a specific value.
>
>As before, we'll first create a recursive method that traverses the tree.
>
> Here we're searching for the value by comparing it to the value in the current node; we'll then continue in the left or right child depending on the outcome.
> 
> Next we'll create the public method that starts from the root.
> 
> ## Deleting an Element
> Another common operation is the deletion of a node from the tree.
>
> First, we have to find the node to delete in a similar way as before.
> Once we find the node to delete, there are 3 main different cases:
> - a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
> - a node has exactly one child – in the parent node, we replace this node with its only child.
> - a node has two children – this is the most complex case because it requires a tree reorganization.
> ## Traversing the Tree
> In this section, we'll explore different ways of traversing a tree, covering in detail the depth-first and breadth-first searches.
> We'll use the same tree that we used before, and we'll examine the traversal order for each case.
> ### Depth-First Search
> Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
>
> There are several ways to perform a depth-first search: in-order, pre-order and post-order.
>
> The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree.
>
> Pre-order traversal visits first the root node, then the left sub-tree, and finally the right sub-tree.
> 
> Post-order traversal visits the left sub-tree, the right subt-ree, and the root node at the end.
> 
> ### Breadth-First Search
> This is another common type of traversal that visits all the nodes of a level before going to the next level.
>
> This kind of traversal is also called level-order, and visits all the levels of the tree starting from the root, and from left to right.
>
> For the implementation, we'll use a Queue to hold the nodes from each level in order. We'll extract each node from the list, print its values, then add its children to the queue.