import scala.util.Try
import scala.util.Success
import scala.util.Failure


class ToDo(val startDesc: String = "", var priority: Int = 0) {
    val HighPriority = 5
    private var _desc = ""

    def desc: String = _desc
    def desc_= (newDesc: String): Unit = {
        require(! newDesc.isEmpty, "Task need to have a description.")
        _desc = newDesc
    }
    def isTaskHighPriority: Boolean = priority > HighPriority
    def isTaskLowPriority: Boolean = priority < HighPriority

    this.desc = startDesc
    
}

val task1 = new ToDo(startDesc = "Very urgent task", priority = 10)

assert(task1.isTaskHighPriority)

task1.priority = 2
assert(task1.isTaskLowPriority)
assert(task1.priority == 2)

try {
    val task2 = new ToDo(startDesc = "")
} catch {
    case e: Exception => println("No, no, no, you couldn't do like this.")
}

import java.util.{Calendar, Date}

object todoHelper {
    var canAddOverdue = false

    def now: Calendar = Calendar.getInstance()

    def isOverdue(date: Date):Boolean = now.getTime.getTime > date.getTime

    def changeByDays(days: Int): Date = {
        val calender = now
        calender.add(Calendar.DAY_OF_MONTH, days)
        calender.getTime
    }
}
