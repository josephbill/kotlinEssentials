package oop//    What is oop
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
//    We can create an object off this car : callClassName()
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

// creating a class with a constructor
// we can have function within classes to perform certain actions
class Car2(var brand: String,var model: String, var yom: String, var sound: String) {
    //function
    fun drive(){
//        logic
        println(brand + " makes this sound "  + sound + "!...")
    }
    fun speed(maxSpeed: Int){
        println("The car speed is a max of " + maxSpeed)
    }
}

fun main(){
//    creating from the class defined without a constructor
    val car_one = Car()
    val car_two = Car()
//    Access the properties and manipulate the props.
    car_one.brand = "Toyota"
    car_one.model = "Corolla"
    car_one.yom = "2004"
    car_two.brand = "Mercedes"
    println(car_one.brand)
    println(car_two.brand)
    //    creating from the class defined with a constructor
    val car_three = Car2("Volvo","V2","2000","Wrooom")
    val car_four = Car2("Benz","Wseries","2000","swish")
    println(car_three.yom)
    println(car_three.drive())
    println(car_four.drive())
    println(car_four.speed(120))
}



























