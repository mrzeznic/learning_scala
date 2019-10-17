def stringTest(s1: String, s2: String): Unit = {
    s1.contains(s2)
    println("java")
}
stringTest("23","5")

val list: List[String] = List("Scala", "Java", "Go")
println("\n" + list.head)

import scala.collection.mutable.ListBuffer
var mNames = new ListBuffer[String]()
println(mNames)
mNames += "Scala"
mNames += "Java"

println(mNames)

// List - immutable constriction
//ListBuffer - mutable constriction

// when assert(condition) will generate exception(introduction) - when condition will not be met, we need to catch it with try-catch

// what will be the value of lif after execution of below code?
val li = Range(15,11).toList
val lif = for {
    a <- li
    if a % 2 != 0
    if a < 20
} yield a

print(lif)
// due to range (15,11), there will be no output


