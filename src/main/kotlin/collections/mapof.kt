// this is a special collection to contains pairs of objects
// collection of objects
// maps hold data in a key : value format
// key gives access to value
// mapOf : immutable map -> read
// Map interface
// fun mapOf(objects): Map
fun main(){
    //declaring
    val map = mapOf(1 to "Value for 1", 2 to "Value for two" , 3 to 3)
    //declaring an empty map
    println("accessing the map " + map)
    println("accessing the map keys " + map.keys) //gets all keys
    println("accessing the map values " + map.values) //gets all values
    // getting the size of the map
    println("Size is ${map.size}")
    println("Count is ${map.count()}")
    // getting  a specific value
    println("To get the value 'value for two' " + map[2]) //using []'s syntax
    println("To get the value 'value for two' " + map.getValue(2)) //using []'s syntax
    println("To get the value 'value for two' " + map.getOrDefault(5,3)) //using []'s syntax
    println("To get the value 'value for two' " + map.getOrElse(5,{3})) //using []'s syntax
    //checking if map contains value or keys
    println(map.containsKey(5)) //boolean result
    println(map.containsValue("Value for 1")) //boolean result
    // Two values and same key
    // if two values have the same key value then map will contain the last value of those numbers
    val map2 = mapOf(1 to "One", 2 to "two", 1 to "three", 1 to "four ")
    println("-------------------------- two values same key")
    println(map2.entries)
    // keys can also be strings
    val names = mapOf("name" to "Joseph" , "occupation" to "Software dev")
    // get the value associated with the key
    println("The occupation of " +   names["name"]  + " : " + names["occupation"])
    println(names.containsValue("Joseph")) //boolean result

    //transversing a map
    // for loop
    // decide whether to use the key or values to help in loop
    for(item in map2.keys){
        val value = map2[item]
        println(value)
    }
    for(item in map2.values){
       println(item)
    }
    // forEach
    map2.forEach{key,value ->
        println("${value}")
        println("${key}")
    }

}




















