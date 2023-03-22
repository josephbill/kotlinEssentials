// nested classes : reference a class inside a class
// the nested classes will have access to the fields and methods in the outer class
class Car(var make: String, var model: String, var year: Int) {
////    lateinit : it allows us to give values to our class props later not during defination
//    lateinit var make: String
//    lateinit var model: String
//    var year: Int = 0

    fun getInfo(): String{
        return "$make $model $year"
    }
//    nested class
// to define a nested class : use the keyword inner , class
    inner class Engine {
        // Engine has access to the make model and year properties , and also the methods / functions
        var horsepower: Int = 0
        var cylinders: Int = 0

        fun getEngineInfo(): String {
            return "$horsepower engine horsepower, $cylinders engine cylinders, in a $make $model"
        }
    }
}

fun main(){
    val myCar = Car("toyota","corrola",2004)
    println(myCar.getInfo())
//    to use the inner class
    val engine = myCar.Engine()
    println(engine.getEngineInfo())
    println(engine.horsepower)
}