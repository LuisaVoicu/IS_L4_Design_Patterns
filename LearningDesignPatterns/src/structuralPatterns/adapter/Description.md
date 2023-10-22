## Adapter
### About Adapter
* structural design pattern
* allows objects with incompatible interfaces to collaborate
* Adapter is a special object that converts the interface of one object so that the other one can understand it.
### Structure
* Client: class that contains the existing business logic of the program
* Client Interface: describe a protocol that other classes must follow to be able to collaborate with Client
* Service: 3rd-party class
* Adapter: class that is able to work with both Client and Service
### Applicability
* use Adapter class when you want to use existing classes, but its interface is not compatible with your code
* use Adapter class when you want to reuse existing subclasses that lack common functionality
### Pros
* Single Responsability & Open/Closed Principles are respected.
### Cons
* overall complexity of code increased: need to define new interfaces and classes