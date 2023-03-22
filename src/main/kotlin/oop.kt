fun main(){
//    What is oop
// Object-Oriented Programming : creating objects that contain both data and methods
// procedural programming : writing procedures or methods that perform operations on data

//    OOP has several advantages of procedural programming
//    - oop is faster and easier to execute
//    - provide a clear structure for your programs
//            - Helps keep code DRY "Dont repeat yourself"(objects are reusable)
//    - increases productiviyu : full reusable applications with shorter development time.

//    Class  / Object
//    - a class is a template for an object
//    - an object is an instance of a class

//    Class : Fruit(color,taste,germinationperiod, growth process)   Objects : Apples , bananas, oranges etc.
//    Class : Car (color, brake , accelerate , limitspeed) Objects : Audi , Toyota , benz


//    classes / objects
//    Class
//    To create a class use the class keyword
    class Car {
//        all classes have properties(variables) and methods(functions) to work on those properties
//    always name classes with an uppercase letter , especially when dealing with first letter.
    var brand = ""
    var model = ""
    var yom = ""
    }

//    We can create an object off this car : callClassName()
    val car_one = Car()
    val car_two = Car()
//    Access the properties and manipulate the props.
    car_one.brand = "Toyota"
    car_one.model = "Corolla"
    car_one.yom = "2004"

    car_two.brand = "Mercedes"
    println(car_one.brand)
    println(car_two.brand)
}



























