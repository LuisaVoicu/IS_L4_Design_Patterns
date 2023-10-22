## Composite
### About Composite
* structural design pattern
* allows you compose objects into tree structures and then work with there structures as it they were individual objects
* core model of the app should be represented as a tree in order to use Composite pattern
### Structure
* Component: interface - describe operations that are common to all elements of the tree
* Leaf: basic element of a tree that does not have subelements
* Container/Composite: element that has subelements 
  - it doesn't know the concrete classes of its children
  - it work with all subelements via the component interface
* Client: works with all elements through the component interface
### Applicability
* You may want to use Composite pattern 
  - when you have to implement tree-like models
  - when you want Client code to treat both simple and complex elements the same
### Pros
* working efficiently with complex tree structures: polymorphism & recursion
* Open/Closed Principle is respected
### Cons
* Difficult to provide common interface for classes with different functionality