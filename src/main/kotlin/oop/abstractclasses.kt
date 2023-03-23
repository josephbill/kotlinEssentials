// abstract class is used to define abstract methods that need to be implemented when an abstract class is extended to a class
// the class extending provides implementation for the abstract methods defined in the abstract class.
// props of an abstract class
//1. An abstract class cannot be instantiated
//2. The methods defined in an abstract class are by default non abstract : meaning overriding occurs with use of the open keyword
//3. I can make functions and props open by declaring them using the abstract keyword.

abstract class Employee(val name: String, val experience: String){
    // an abstract property/variable must be overriden by the implementing class
    abstract val salary : Double
    // an abstract method must be implemented by the implementing class
    abstract fun dateofBirth(date: String)
//    non abstract method
     fun employeeDetails(){
        println("The employee name is ${name}")
        println("The employee experience is ${experience}")
    }
}
// to use an abstract class
class Accountant(name: String, experience: String) : Employee(name,experience ) {
    override val salary: Double = 50000.00
    override fun dateofBirth(date: String) {
       println(date)
    }
}
// an abstract class can also implement open classes
open class LivingThings(){
    open fun breathIn(){
        println("Breath in process")
    }
}
abstract class animal : LivingThings() {
    override abstract fun breathIn()
}
class Cat : animal() {
    override fun breathIn() {
        println("the cat .................. ")
    }
}
fun main(){
    var employee1 = Accountant("Mary","3")
    employee1.employeeDetails()
    val lt1 = LivingThings()
    println(lt1.breathIn())
    val cat  = Cat()
    println(cat.breathIn())
}