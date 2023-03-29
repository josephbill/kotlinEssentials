// we use this to create a mutable setOf i.e. set that can be read and written
// fun hashSetOf(elements): HashSet
//// unordered collection of elements
//// does not contain any duplicate elements

fun main(){
    val set1 = hashSetOf<Int>(1,2,3)
    val set2 = hashSetOf("1",2,3)
    val set3 = hashSetOf(4,5,6)
    //creating an empty hashSetOf
    val hash = hashSetOf<String>()
    println(set1)
    println(set2)
    for(item in set1){
        println(item)
    }
    // add and remove in hashSets
    // adding a single element
    hash.add("Kite")
    println(hash)
    set1.add(8)
    println(set1)
    // to add a set to an existing set
    set1.addAll(set3)
    println(set1)
    //remove
    set2.remove(1)
    println(set2)
    // element at specific index
    println(set2.elementAt(0)) //first
    println(set2.last()) //last
    println(set2.indexOf(2))

}