## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Principles of OOPS

- **Encapsulation**: Group all related fields and methods into common class(es).
    - _getters_ - fetch fields' values
    - _setters_ - set fields' values

- **Abstraction**: Reducing comlpexity for end user by hiding all unnecessary details.

    - **Coupling** - level of dependency between classes<br>
    for example, the main class is coupled to the employee class at multiple points - like creating employee instance, using class methods, etc.
    
    * The lesser mehtods you have exposed, the lesser is the complexity <br>

    > _Constructors_: When a class is instantiated, java automatically calls a    default constructor method to initialize a new instance. 
    > We can alter that instance by declaring a custom method `public className(<params>){<use setters to set fields>}`

- **Overloading**: Having different implementations of a method based on type of input parameters
(for example, sout( \<int> ) OR sout( \<String> ) )
    - To do it, we can duplicate the method and change it's parameters and logic accordingly
    - We can also have overloaded constructors 

> Note: Make sure that there's a balence between abstraction and overloaing


## **Field/Method Membership**:<br>
- `static` members are those which belong to the class itself (whose values are independent of objects) <br>
- `instance` members are those which belong to each instance of the class (whose values are unique to every instance)

For example, the number of employees can be a static field which can be inceremented and stored "globally"

> _Note_: The `main` method for every class is always `static` because the JRE can call the `main` method without instantiating a new object of that class. 