## Abstract Factory
### About Abstract Factory
* Creational design pattern that let you produce families of **related objects without specifying therir concrete classes**.
### Structure: 
  - Abstract products: here we have the interfaces of distinct but still related products 
  - Concrete products: implementation of abstract products, grouped by variants (eg, product: sofa, variant: modern)
  - Abstract factory: interface that declare a set of methods for creating the abstract products
  - Concrete factory: implement creation methods (for specific variant of products) of the abstract factory 
  - Client: communicate with objects (products and variants) via abstract interfaces
### Applicability
  - when you need to work with **various families and related products**, but you **don't want to depend on the concrete classes**
  - you should have an Abstract Factory when you have a class with set of Factory Methods whose responsibility is not clear
### Pros
  - products from factory are compatible with each other
  - loose coupling between concrete products and Client
  - Single Responsability & Open/Closed Principles are respected.
### Cons
  - code may become more complicated than it should be
