case class Language(name: String, functional: Boolean, oo: Boolean)
    val langScala = Language("Scala", functional = true, oo = true)
    val langPython = langScala.copy("Python", functional = false)
    val langJava = langScala.copy("Java", functional = false)
    val langKotlin = langScala.copy("Kotlin")
    val langC = Language("C", functional = false, oo = false)


def testLang(lang: Language): Unit = {
    lang match {
        case Language("Scala", _, _) =>
            println("Scala is the best!")
        case Language(_, false, false) =>
            throw new Exception("what is that?!")
        case Language(lang, func, oo) =>
            val funcTxt = if(func) "is" else "is not"
            val ooTxt = if(oo) "is" else "is not"
            s"Language $lang $funcTxt is the functional and $ooTxt object language."
        case _ =>
        ???  
    }
}

def newTest(lang: Language): Unit = {
    lang match {
        case Language("Java", _, _) =>
            println("Don't waste your life!")
        case Language("Kotlin", _, _) =>
            println("Hi little brother! You still need to learn a lot, don't you?")
        case Language("C", _ , _) =>
            throw new Exception("no....")
        case _ =>
        ???
    }
}
//tests with string answer
testLang(langScala)
testLang(langPython)
newTest(langJava)
newTest(langKotlin)
//tests with Exception catch
try
    testLang(
        Language("Usless", functional = false, oo = false)
    )
catch {
    case e: Exception => println(s"Something went wrong: ${e.getMessage}")
}
try
    newTest(langC)
catch {
    case e: Exception => println(s"Something went wrong: ${e.getMessage}")
}
