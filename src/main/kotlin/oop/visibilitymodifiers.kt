// visibility modifiers control the visibility of class in terms of classes properties and methods access
// 1. private : restricts control to the containing class
// 2. public : default , class /control is visible/ allowed to all classes
// 3. internal : restrict control to the same module (android) : module: set of kotlin files compiled together
// 4. protected : restricts control to the containing class and subclasses. (Visibility modifier for inheritance )

// public
class A {

}

public class B{

}

// private
private class C {
   private val numberPrint = 10
    fun display(){
        println(numberPrint)
    }
}

// protected
open class D{
    //protected variable
    open protected val numberPrint = 10
}

class E: D(){
    //changing the value of numberprint
    override val numberPrint = 20

    fun getValue(): Int{
        return numberPrint
    }
}

//constructors can also have a visibility mode
class F(name:String){

}

class G private constructor(name:String){

}



fun main() {
   var c  = C()
    // display has access to number print as the method is defined within the same scope /class
   c.display()
// cannot access numberprint due to its private nature
//    println(c.numberPrint)
    var e = E()
    println(e.getValue())
    var f = F("Joseph")
//    var g = G("Joseph")  # android
}


//Advantages of using visibility modifiers in Kotlin:
//Encapsulation: By restricting the visibility of the members of a class, you can enforce the principle of encapsulation and ensure that the internal state of the class remains hidden from the outside world.
//Modularity: By controlling the visibility of the members of a class, you can create modular components that can be easily reused and maintained.
//Abstraction: By hiding the implementation details of your classes behind public interfaces, you can create an abstraction layer that makes your code more maintainable and less prone to bugs.
//Disadvantages of using visibility modifiers in Kotlin:
//Complexity: Using visibility modifiers can make your code more complex, especially if you have many classes and members with different visibility levels.
//Overhead: Restricting the visibility of members can add some overhead to your code, as the compiler has to perform additional checks to enforce the visibility rules.
