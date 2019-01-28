


class Rational(val numerator: Int, val denominator: Int) {
    init {
        require(denominator != 0, {"denominator must not be null"})
    }
    override fun toString(): String = "${numerator}/${denominator}"
}    

fun main(args: Array<String>) {
    println("hello")

    println(Rational(1, 3))

    println(Rational(3, 0))
}


