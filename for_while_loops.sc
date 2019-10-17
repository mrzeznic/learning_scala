//loop for values from 1 to 10
println("\nloop for values from 1 to 10")
for (a <- 1 to 10){
    println( s"Value a: $a")
}
//loop for values from 1 to 9, if a is 10 than loop stops
println("\nloop for values from 1 to 9, if a is 10 than loop stops")
for (a <- 1 until 10) {
    println( s"Value a: $a")
}
//loop for range 1,11
println("\nloop for range 1,11")
val list = Range(1,11).toList
for (a <- list) {
    println( s"Value a: $a")
}

//modulus operator
var a = 3
var b = 4

println(a%2)
println(b%2)

//only even values
println("\nOnly even values.")
for ( a <- list
    if a%2 ==0) {
        println( s"Value a: $a")
    }

//only even and bigger than 4
println("\nOnly even and bigger than 4.")
for  ( a<- list
    if a % 2 ==0
    if a >4 ) {
        println(s"Value a: $a")
    }

//only even and bigger than 4, in list
println("\nOnly even and bigger than 4, in list.")
val list = Range(1,11).toList
val l = for {
    a <- list
    if a % 2 ==0
    if a > 4
} yield a
println(l)

//assert(l == List(6,8,10))

//while
println("\nWhile loop")
var ax = 10
while (ax <20) {
    println(s"Actual value ax: $ax")
    ax += 1
}

val list1 = Range(1,11).toList
val list2 = Range(11,21).toList

val l = for {
    a <- list1
    b <- list2
} yield (a,b)
println(l)