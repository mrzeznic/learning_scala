//create list with random value
val randoms = List.fill(30)(scala.util.Random.nextInt)


val names: List[String] = List("Scala", "Akka", "Twitter")
println(names)

assert(names.head == "Scala")
println(names.head)

assert(names.tail == List("Akka", "Twitter"))
println(names.tail)

assert(! names.isEmpty)

val numsExtra = List(1,2,3)
println ("numsConcat" + numsExtra)

val nums: List[Int] = List(1,2,3,4)
println ("nums" + nums)

val numsConcat = nums ::: numsExtra

println ("numsConcat" + numsConcat)

import scala.collection.mutable.ListBuffer

var mNames = new ListBuffer[String]()

mNames += "Scala"
mNames += "Akka"
mNames += "Twitter"

mNames ++= List("Lightbend","IBM", "Amazon", "Scala is the best!!!", "I love Scala", "Java")

println(mNames)

mNames -= ("Java")
println(mNames)

/*
assert(
    mNames.toList == List("Lightbend","IBM", "Amazon", "Scala is the best!!!", "I love Scala", "Java")
)
println(mNames)
*/

var companies: List[String] = List("Schenker", "GLS", "DHL", "Panalpina", "DSV")
println(companies)
var people: List[String] = List("Paul", "Mark", "Lars")
println(people)
var numbers: List[String] = List("45", "4535", "8768")
println(numbers)


val concatenate: List[String] = List(companies.head + ',' + people.head + ',' + numbers.head)
//val concatenate: List[String] = List.concat(companies.head, people.head, numbers.head)
println(concatenate)

val concatenate2: List[String] = List(companies(1) + ',' + people(1) + ',' + numbers(1))
println(concatenate2)

var numbers2: List[Int] = List(45, 4535, 8768)
println(numbers)

val summary: Int = numbers2(0) + numbers2(2)
println(summary)

val concatenate3 = people ::: companies
println(concatenate3)