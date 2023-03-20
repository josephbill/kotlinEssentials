// block of code which only runs when invoked / called
fun main(){
    myGreeting() //invoked / called
    myGreeting() //invoked / called
    mySum(10,20)
    println("My sum 2 ................")
  var sum = mySum2(10,20)
    println(sum)
    println("end ................")
    var sum2 = myShortHand(30,30)
    println(sum2)
}
fun myGreeting(){
    println("hello world")
}
// function parameters
// information can be passed to function through parameters
fun mySum(a:Int, b:Int): Int{
    return (a + b)
}
//return value : output / end result of the block code / we can also specify what a function should return
//you can call a function within a function.
fun mySum2(a:Int, b:Int): String{
    var sum = a + b
    var finalsum = mySum(sum.toInt(),10)
    return finalsum.toString()
}

// shorthand method to write a function
fun myShortHand(x:Int, y:Int) = x + y