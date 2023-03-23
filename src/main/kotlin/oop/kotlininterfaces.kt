// Interfaces is a feature of OOP that is basically a collection of abstract methods and properties that defines a common contract
//for classes that implement the interface

// creating an interface : use the keyword interface
interface Vehicle {
    // inside we can have our abstract methods
//    default function with params
    fun start(process: String)

    //    default method
    fun startPrintProcess() {
        println("This is a default method in the interface")
    }
    fun stop()
}

// implementing the interface
class CarInterface : Vehicle {
    override fun stop() {
        TODO("Not yet implemented")
    }

    override fun start(process: String) {
        TODO("Not yet implemented")

    }

    override fun startPrintProcess() {
        super.startPrintProcess()
    }
}

// create the object


// interface with properties
interface InterfaceProperties {
    val a : Int
    val b : String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties {
    override val a: Int = 5000
    override val b: String = "Property Override"
}

// Inheritance in Interfaces
// Interface in Kotlin can inherit other interfaces
// An interface can inherit more than one interface (multiple inheritance)
// when an interface inherits from another interface it can add its own properties and methods
interface Measurements{
    val length : Int
    val width : Int

    fun printMeasurements()
}

interface CalculateAreas : Measurements {
    fun area()
    fun perimeter()
}
// multiple interface implementation
class ConstructionClass : CalculateAreas, InterfaceProperties {
    override val length: Int = 10
    override val width: Int = 10
    override val a: Int = 20
    override fun area() {
        TODO("Not yet implemented")
        var area = length * width
        println(area)
    }

    override fun perimeter() {
        TODO("Not yet implemented")
    }

    override fun printMeasurements() {
        TODO("Not yet implemented")
    }
}

fun main() {
    var ab = PropertiesDemo()
    println(ab.a)
    var c = ConstructionClass()
    println(c.area())
}





















