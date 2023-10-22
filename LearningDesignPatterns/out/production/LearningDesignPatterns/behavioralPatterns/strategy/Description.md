## Strategy Pattern
### About Strategy Pattern
* behavioral design
* Stategy pattern = extract all algorithms from a class that does something specific and put them into separate classes (called strategies)
* original class (called **context**) must have fields to store references to one of the strategies
* Client class is responsable for passing the desired strategy to the context class
* Context class becomes indepentent of content strategies
  - this way you can add/modify alogorithms without changing the code of context class
### Structure
* Context: maintains reference to one of the concrete strategies and communicate with this object only via strategy interface
* Strategy: common interface for all strategies; has a method used by context to execute strategy
* Concrete Strategies: implement algoritms
* Client: creates specific strategy objects and passes them to the context

### Applicability
* use when
  - you want to use different variants of an algorithm within an object and still be able to switch from one to another
  - you have similar classes that only differ in the way they execute some behavior

### Pros
* you can swap alogrithms used in an object at runtime
* isolate the implementation details of an algorithm from the code that uses it
* replace inheritance with composition
* Open/Closed Principle is respected

### Cons
* Client must be aware of the differences between strategies