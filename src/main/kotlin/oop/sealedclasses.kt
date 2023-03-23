// sealed classes  : conforming to restrictions
// declaring a sealed class :
// sealed class cannot be instantiated
//provides a way of declaring related classes as sub classes.
sealed class MySealedClass{
//    subclasses
    class A :MySealedClass(){
        fun display(){
            println("Hello from sealed a")
        }
    }

    class B :MySealedClass(){
        fun display(){
            println("Hello from sealed b")
        }
    }
}

// usage
// use it when you know in advance that a process or type conforms to one subclasses in the sealed class
fun main(){
    var myObj = MySealedClass.A()
    println(myObj.display())
}