// listOf() is a function in Kotlin used to create an immutable list of elements
// takes in arguments and returns a new list containing those arguments
fun main(){
    val numbers = listOf(1,2,3,4,5)
    val firstNumber = numbers[0] //return 1
    println(numbers.size)
    // to access the last element the index position is number.size - 1
    val lastNumber = numbers.size - 1
    println(numbers[lastNumber])
    for (i in numbers){
        println(i)
    }
    // index of
    println(numbers.indexOf(4))
    // get first and last elements
    println(".....................first and last")
    println(numbers.first())
    println(numbers.last())

    val names = listOf("Joseph", "Mary", "Yusuf", "Maria")
//    iterating methods
    println("...............iterating methods")
    // using for in
    println("...............using for in methods")
    for (name in names){
        println("${name}")
    }
    // using until
    println("...............using until methods")
    for(i in 0 until names.size) {
        println("${names[i]}")
    }
    // list iterator
    println("...............using listiterator interface methods")
    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()){
        val i = it.next() // getting the index position of the next item
        println(i)
    }
    // sorting lists -> ascending or descending order
    val ascending = names.sorted() // ascending format
    println(ascending)
    println("..............ascending")
    val descending = names.sortedDescending() // descending format
    println("..............descending")
    println(descending)

    // contains() (data) or containsAll() (objects of data)functions
    // the above simply check whether an element exists or not
    // contains is case sensitive
    // joseph is not equal to Joseph
    // output is a boolean true or false
    println(".........checking for a single value in a list")
    val check = names.contains("Joseph")
    println(check)
    println(".........checking for a range in the list")
    // containsAll : any data type works
    // allows to check for multiple values
    // all values should be present for a true result
     val rangecheck = names.containsAll(listOf("Joseph","Mary"))
    println(rangecheck)
    if (rangecheck){
        println("Names exist ")
    }  else {
        println("Names do not exist")
    }
}


















