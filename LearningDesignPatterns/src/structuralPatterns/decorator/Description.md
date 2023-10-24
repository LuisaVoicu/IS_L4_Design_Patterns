## Decorator
### About Decorator pattern
* structural design pattern
* allows you to attach new behaviors to objects by placing them into wrappers

### Structure
* Component: declares the common interface for both wrappers and wrapped objects
* Concrete Component: class with wrapped objects ; it contains the basic behaviour which can be altered by decorators
* Base Decorator: class with a field that reference the wrapped object (declared as component interface)
* Concrete Decorator: defines extra behaviors that can be added to components
* Client: can wrap components in multiple layers of decorators

### Applicability
* Use Decorator pattern when: 
  - you need to assign extra behaviours to objects **at runtime** without breaking the code
  - it's not possible to extend an object's behaviour using inheritance

### Pros
* you can extend object's behaviour without making a new subclass
* you can add or remove responsabilities from objects at runtime
* Single Responsability Principle is respected.

### Cons
* hard to remove a specific wrapper from the wrappers stack
