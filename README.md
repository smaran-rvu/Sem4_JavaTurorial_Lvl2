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
    
    - The lesser mehtods you have exposed, the lesser is the complexity <br>

    > The `private` access modifier can be used to hide the implementation of methods/fields outside the class file. <br>
    > The `protected` access modifier allows visibility of the method/field within that package or within other packages containing the child class(es) inheriting that class. <br>
    > By default, if no access modifier is mentinoed, the method/field is visible only whithin that package

- **Overloading**: Having different implementations of a method based on type of input parameters
(for example, sout( \<int> ) OR sout( \<String> ) )
    
    - To do it, we can duplicate the method and change it's parameters and logic accordingly
    
    - We can also have overloaded constructors 

> Note: Make sure that there's a balence between abstraction and overloaing

- **Inheritance**: inherit methods and fields of a parent class (to reuse code and properties of a class)
    
    - To do it, we can alter the child class defition like: <br>
    `public class <ChildClassName> extends <ParentClass>`

    - Make sure that parent class is initialized properly in the child class if the parent class constructor requires paremeters. <br>
    To do so, add this to the first line of the constructor of the child class <br>
    `super(<params>);`
    
    - By default, every object instantiated in java inherits properties of the `Object` class <br>
    Thus, you can always see default methods such as `getClass()`, `equals()`, `hashCode()`, `toString()`, etc. <br>
    
    > `getClass()` method displays all the methods and fields of that object (with other metadata) <br>
    >`hashCode()` method returns an integer based on the address of that object in memory. <br>
    >`equals()` method checks if a given instance references same object as another instance <br>
    > `toString()` method returns a coded string with the address and full name of the package and class

    - **Overriding**: <br>
    If a property derived from the parent class isn't the desired for the child class, we can _override_ that property in the child class. <br>
    For example, the `toString()` method can be ovverriden to print a certain field in string form (rather than the default coded string) like so <br>
        ```
        @Override
        public String toString(){
            return <string_value>
        }
        ```    


## Field/Method Membership:<br>
- `static` members are those which belong to the class itself (whose values are independent of objects) <br>
- `instance` members are those which belong to each instance of the class (whose values are unique to every instance)

For example, the number of employees can be a static field which can be inceremented and stored "globally"

> _Note_: The `main` method for every class is always `static` because the JRE can call the `main` method without instantiating a new object of that class. 


## Constructors: 
When a class is instantiated, java automatically calls a default constructor method to initialize a new instance. <br> 
It's helful in the abstraction of code by hiding all the getters and setters while making the code more short and readable.

> We can alter the constructor by declaring a custom method <br> `public className(<params>){<use setters to set fields>}`
