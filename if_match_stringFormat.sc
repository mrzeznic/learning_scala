def testIf(i:Int): Boolean = {
    if (i>2)
        true
    else
        false
}
var x = 3
println("For value: " + x + " result is equal: " + testIf(x))

var y = 1
println("For value: " + y + " result is equal: " + testIf(y))

x = 1
println("For value: " + x + " result is equal: " + testIf(x))

val abc = 123

val z = { if (abc > 12) true else false }
println (z)

def testMatch(text: String, int: Int): Unit = {
    (text, int) match {
        case("",12) =>
            assert((text, int) == ("",12))
            println("Case 1 -> empty text and int = 12.")

        case("test", _) =>
            assert(text == "test")
            println("Case 2 -> \"test\" as text and random int value: " + s"$int.")

        case(_, 123) =>
            assert(int == 123)
            println("Case 3 -> String is a random value: " + s"$text" + " and int is: " + s"$int.")

        case(t:String, i:Int) if t.contains("Learning Scala") && i > 54 =>
            assert(t.contains("Learning Scala"))
            assert(i > 54)
            println("Case 4 -> String contains: \"Learning Scala\" phrase and " + s"$i is bigger than 54.")

        case(t:String, i:Int) if !t.contains("Learning Scala") && i <= 54 =>
            assert(!t.contains("Learning Scala"))
            assert(i <= 54)
            println("Case 4 -> String not contain: \"Learning Scala\" phrase and " + s"$i is lower or equal than 54.")

        case(t:String, i:Int) =>
            println("Case 5 -> String formatting examples.")
            println(s"text: $t")
            println(s"int: $i")
            println(s"all: ${t.toUpperCase} $i")

        case _ =>
        println("Other values.")
        ???
    }
}
testMatch("",12)
testMatch("test", 12)
testMatch("text", 123)
testMatch("I am Learning Scala all night long", 80)
testMatch("Something else", 500)

