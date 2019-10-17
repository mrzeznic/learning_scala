

def testMatch(l: List[String]): Unit = {
    (`l`) match {
//lista jest pusta
        case(Nil) =>
            println("Case 1 -> empty list.")

//lista zawiera tylko jeden element i jest to string "Scala"
        case(`l`) if l.length == 1 && l.contains("Scala") =>
            assert(l.length == 1)
            assert(l.contains("Scala"))
            println("Case 2 -> List have exactly 1 item and it is string \"Scala\".")
//lista zawiera tylko jeden dowolny element
        case(`l`) if l.length == 1=>
            assert(l.length == 1)
            println("Case 3 -> List have exactly 1 item.")
//dwa pierwsze elementy list to "Scala" i "Forever"
        //case(`l`) if l.head.contains("Scala") && l.tail.contains("Forever") =>
        case List("Scala","Forever", _*) =>
            assert(l.contains("Scala"))
            assert(l.contains("Forever"))
            val l_first_element = l(0)
            val l_second_element = l(1)
            println("Case 4 -> List have " + s"$l_first_element" + " and " + s"$l_second_element" + " on first two places.")
//inne warunki      
        case _ =>
        println("Other values.")
        ???



    }
}

var testList: List[String] = List() //Nil
var testList2: List[String] = List("frodo", "gimli")
var testList3: List[String] = List("Scala")
var testList4: List[String] = List("Maniek")
var testList5: List[String] = List("Scala", "Forever","Spark")
var testList6: List[String] = List("Scala", "Spark", "Forever")

testMatch(testList5)

//val empty: List[String] = List()
//val better: List[String] = Nil