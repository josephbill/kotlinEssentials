// kotlins version of a mutable map : mapOf
// hashMapOf

fun main(){
    //declaring and empty hashMapOf
    val myMap = hashMapOf<String,Int>()
    //add elements to a hashmap
    myMap.put("grade1",1000)
    myMap.put("grade2",100)
    myMap.put("grade3",10)
    println(myMap)

    // remove  //specify the key
    myMap.remove("grade3")
    println(myMap)
    //
    println(myMap.containsValue(10)) //false

}

