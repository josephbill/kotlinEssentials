// Lists in kotlin are an ordered collection of elements that allow duplicates
// to define one : choose whether you want a mutable or immutable list
// ARRAYLIST : objects
// Array lists create dynamic arrays
// by dynamic meaning we have the ability to increase or decrease the size of an array
// arraylists can contain duplicates

// defination
// constructors
//1.ArrayList<E>() : creates an empty ArrayList
//2. ArrayList(capacity:Int) - creates an array list of a specified size
//3. ArrayList(elements: Collection<E>): - creates an array list filled with collection elements


// To add to an arrayList
// add(index:Int , element: E): Boolean
// -1 : referencing the last object in the array list

fun main(){
    var arrayList =  ArrayList<String>() //create an empty string arraylist
    //adding
    arrayList.add("First String")
    arrayList.add("First String")
    //iterating/looping over the arraylist
    println("...................................")
    for (i in arrayList){
        println(i)
    }
    arrayList.add(1, "Second String")
    println(".............specified index......................")
    for (i in arrayList){
        println(i)
    }
    // addAll(index: Int, elements:Collection)
    var arrayList2 = ArrayList<String>()
    println(".............adding collections to arraylists ......................")
    arrayList2.addAll(arrayList)
    arrayList2.add(1,"Third String")
    for (i in arrayList2){
        println(i)
    }
    // get method to access
    println(".............accessing items using get ......................")
    println("Item at first position " + arrayList2.get(0))
    println(arrayList2.size)
    // using set to set item to arrayList
    println(".............setting/updating items using set ......................")
    arrayList2.set(0,"Changed Value")
    for (i in arrayList2){
        println(i)
    }
    // to get index position of an element in array list
    // indexOf
    println(" index position of value third string is " + arrayList2.indexOf("Third String"))
    // to remove from array list
    //specify the value to remove using the .remove method
    arrayList2.remove("Third String")
    println(".............removing elements......................")
    for (i in arrayList2){
        println(i)
    }
    println(".............clearing/emptying an arraylist ......................")
    arrayList2.clear()
    for (i in arrayList2){
        println(i)
    }
    println(arrayList2.size)


}
















