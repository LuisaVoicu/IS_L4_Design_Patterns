## Builder
### About Builder 
* creational design pattern
* used for creating complex objects step by step 
* extract object constructuion code out of its own class and move it to separate objects (=builders)
* Director class : class that defines the order in which to execute the building steps
    - Director class is not necessary! you can always call the building steps in specific order from client 
    - It hides the details of product construction

### Structure
* Builder interface: declares common product construction steps
* Concrete Builders: provide implementations for construction steps; they may produce products that don't follow Builder interface
* Products: objects resulted from Builders
* Director: defines the order in which to execute the building steps
* Client: have to associate one of the builder objects with the director so that builing process can begin

### Applicability
* get rid of telescoping constructors (= multiple constructors that calls each other by passing a null value in place of the missing parameter)
* you are able to create different representations of products

### Pros
* building objects step-by-step - easy to identify bugs (?)
* reuse code for different representations of products
* Single Responsability Principle is respected

### Cons
* overall complexity of code is increased (create multiple new classes)