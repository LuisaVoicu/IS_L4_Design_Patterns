## Factory Method

### Overview

#### Factory Method
- creational design pattern
* superclasses can create objects using an interface
* subclasses can alter the type of objects that will be created
* replace object construction calls with class to a special factory method 
  - override the factory method in a subclass - you can easily change the class of products ( = objects) created by the method

#### Limitations 
Subclasses may return different types of products.

#### When to use Factory Method?
* when you don't know beforehand the exact types and dependencies of the objects your code should work with;
* when you want to reuse existing objects;
* when you want to provide users or frameworks with a way to extend its internal components.

#### Pros
* tight coupling between creator and concrete products;
* Single Responsability & Open/Closed Principles are respected.

#### Cons
* code may become more complicated : you need to introduce new subclasses to implement the pattern.
