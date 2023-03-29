//interface SET
// unordered collection of elements
// does not contain any duplicate elements
// Kotlin supports two types of sets -> mutable sets AND immutable sets
// syntax of the set : fun setOf(elements): Set : immutable

fun main(){
    //define using setOf
    val set1 = setOf("Geek","Wiz","IT")
    val set2 = setOf("Geek","Wiz","IT",7,true)
    //transverse/ iterate
    //for in
    for(item in set1){
        println(item)
    }
    //get element at a specific index
    println(set1.elementAt(2)) // IT
    // get index based of element
    println(set2.indexOf(true))
    println(set2.lastIndexOf("Wiz"))
    //get set's first and last element
    println(set1.first()) //gives first element
    println(set1.last()) //gives last element
    //basic integer functions
    val num = setOf<Int>(1,2,10,0,100,10000000,200)
    println("--------------------------Integer FUnctions")
    println(num.count()) //count of items in collections
    println(num.max()) //max of items in collections
    println(num.min()) //min of items in collections
    println(num.sum()) //sum of items in collections
    println(num.average()) //average of items in collections

    // we can check whether a set contains an elements
    println(set2.contains("Joseph")) //result boolean value : true,false
    println(set2.containsAll(setOf(true,"IT","Wiz"))) // multiple values

    //check if a set is empty
    println(set1.isEmpty()) // boolean result
    //check if 2 sets are equal(is it the same : data type) or not   7 and "7" : not equal -> 7 : 7 -> equal
    val set3 = setOf(1,2,3,4)
    val set4 = setOf(1,2,3,4)
    val set5 = setOf(1,2,3,4)
    val set6 = setOf(true,2,3,4)
    println("is set 3 equal to set 4 : ${set3 == set4}" )
    println("is set 5 equal to set 6 : ${set5 == set6}" )

}
























