//Write method that returns x,y,z from a,b input where x is sum, y is difference and z is multiplication.

//rookie verion
def summ(a: Int, b: Int): Int = {
    a + b
}
var x: Int = summ(5,6)

def minn(a: Int, b: Int): Int = {
    a - b
}
var y:Int = minn(5,6)

def multip(a: Int, b: Int): Int = {
  a * b
}
var z:Int = multip(5,6)

println(x,y,z)



//how it should look like
def value(a: Int, b: Int): Unit = {
    def x() = {
    a + b
    }
    def y() = {
    a - b
    }
    def z() = {
    a * b
    }
println(x,y,z)
}
value(5,6)