## Observer
### About Observer Pattern
* behavioral pattern that lets you define subscription mechanism to notify objects about events that happened to an object
* Object states:
  - subject
  - publisher: object that is going to notify other objects about changes to its state
  - subscribers: other objects (not publisher) that want to track changes to the publisher's state
* Observer pattern: you can add subscripiton mechanism to the publisher class so individual objects can (un)subscribe from a stream of events coming from that publisher.

### Structure
* Publisher: notify events of interest to other objects; 
  - events occur when publisher changes its state .
  - contains a subscription infrastructure and let new subscribers to join and current ones to leave 
* Subscriber: interface that declare the notification interface ; it consists of **update** method
* Concrete Subscribers: performs actios in response to notifications issues by publisher
* Client: create publisher & subscriber objects

### Applicability
* use when 
  - changes to the state of object may require changing other objects
  - object in your app must observe other objects for limited time / specific cases
### Pros 
* Open/Closed Principle is respected.
* establish relations between objects at runtime

### Cons
* Subscribes notified in random order