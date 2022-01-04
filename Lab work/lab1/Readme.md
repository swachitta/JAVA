9th Dec-16th Dec 

 Lab Assignment 
 
 1)Constructors 
 
 Constructors name must match with class name and it cannt have a return type like void.It is called when the object is created.All classes have constructors by default.If you dont create a class constructor yourself,Java creates one for you.
 
 Types of Constructor 
 
- Default Constructor
- Parameterized Constructor 
- Copy Constructor 

2)Stack Using Array

Stack is a linear data structure that follows a particular order in which the operations are performed.It may be like LIFO OR FILO.

-Push:Adds an item in the stack.If the stack is full ,then it is said to be overflow condition.

-Pop :Removes an item from the stack

-Peek or Top:returns the top element of the stack.

-isEmpty:Returns true if the stack is empty,else false.

3) Uses of abstract class in java 

Java Abstract class can implement interfaces without even providing the implementation of interface methods.Java abstract class is used to provide common method implementation to all the subclasses .

4)Multiple inheritance 

 we can acheive multiple inheritance in java by implementing multiple interfaces.In java,one can implement multiple interaces.
 
 5)Command-Line Arguments
 
 A Java application can accept any number of arguments from the command line. This allows the user to specify configuration information when the application is launched.

6)this,super,final

Uses of superclass
- super variables refer to the object of the immediate parent class.

- super() invokes the constructor of immediate parent class.

- super refers to the method of the parent class.
  
  Final
  
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...). Final Keyword can be used with:

- variable
- method
- class

7.Default Method(Interface)

The primary idea of including default method in interface is that don’t force the implementing classes to override it. Generally, Methods we declare a method as default which has very less or negligible chances to be overridden by subclasses. Example

interface Human {

   void speaks();
   
   void eats();
   
   default void walks(){
   
      System.out.println("Every human follows the same walking pattern");
   }
   
}
Human's speak method should be overridden as human's can speak English,Nepali,etc. language. Human's eats method should be overridden as human's can Vegetarian,Non-Veg. But, every human have similar walking style

8.Static Method/Variable

The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:

- Variable (also known as a class variable)
- Method (also known as a class method)
- Block
 - Nested class
