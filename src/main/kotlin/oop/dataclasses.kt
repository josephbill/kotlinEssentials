// we use data classes to hold data
// it has some custom inbuilt methods to work with the data
// rules in creating data classes :
// 1. The primary constructor needs to have atleast one parameter
// 2. All parameters should be marked as val or var
// 3. Data classes cannot be abstract, open , sealed , inner class
// 4. Data classes can only implement interfaces

fun main(){
//    declaring a data class : data class nameofthedataclass
    data class person(val name: String, val gender: String, var height: Double)
//    usage
//    declare a variable to reference the data held in the data class
    val person1 = person("Joseph","Male",5.9)

//   printing details from a data class
    println(person1.toString())

    data class car(val model: String, val make: String){
        var engineType = "xyz"
    }

    val car1 = car("Corolla","Toyota")
//    copy() copying objects and changing details
    val car2 = car1.copy(model = "Carina")

    car1.engineType = "ZYX"

    //to print/access one thing
    println(car1.engineType)
    println(car2.toString())

    //hash codes and equals
    // hashCode() returns a hash code value for the object
//     equals() returns true if two objects have the same content

        //data class
       val person2 = person1.copy(name = "John")
       val person3 = person1.copy()

//     checking for equality of the objects // hashCode()
//    1. Two hash codes declared two times on the same object will be equal
//    2. If two objects are equal then the hash codes are also equal

    val hash1 = person1.hashCode()
    val hash2 = person2.hashCode()
    val hash3 = person3.hashCode()

    println(hash1)
    println(hash2)
    println(hash3)

//    checking for equality of the object
    println("hash1 is equal to hash2  ${hash1.equals(hash2)}")
    println("hash2 is equal to hash3  ${hash2.equals(hash3)}")
    println("hash1 is equal to hash3  ${hash1.equals(hash3)}")


}






















