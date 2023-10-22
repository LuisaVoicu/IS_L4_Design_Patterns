## Command Pattern
### About Command Pattern
* behavioral design pattern
* turns a request into a stand-alone object that contains all information about the request
* you can pass the request as a method arguments
* GUI object don't send request directly to Business Logic

### Structure
* Sender/Invoker: responsable for initiating requests;
  - must have a field for storing a reference to a command object
  - it triggers the command instead of sending the request directly to the receiver
* Command: interface that declars a method for executing the command
* Concrete Commands: implements requests
  - concrete commands are not supposed to perform work, but rather to pass the call to one of the business logic object
* Reveiver: contains business logic; objects act like receivers
* Client: creates and configure concrete command objects.
  - must pass all of the request parameters into the command's constructor

### Applicability
* use Command pattern when
  - you want to parametrize objects with operations
  - you want to queue operations, schedule their execution or execute them remotely

### Pros
* you can implement undo/redo
* you can assemble sets of simple commands into complex ones
* Single Responsability & Open/Closed Principles are respected

### Cons
* code may become complicated because you're introducing a new layer between senders and receivers