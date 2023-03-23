sealed class Fruit(var x: String) {
//    subclasses
    class Mango : Fruit("Mango")
    class Orange : Fruit("Orange")
}
// creting a sub class outside of the sealed class defination
class Banana : Fruit("Banana")

fun display(fruit: Fruit){
    when(fruit){
        is Fruit.Orange -> println("${fruit.x} is good for iron: Orange")
        is Fruit.Mango -> println("${fruit.x} is good for iron : Mango")
        is Banana -> println("${fruit.x} is good for iron : Banana")

        else -> {

        }
    }

}
fun main(){
    var ob1 = Fruit.Mango()
    println(display(ob1))
}
