abstract class Shape(_name: String) : Dimensionable {
    var name: String = _name

    open fun getArea(): Double {
        return 0.0
    }
    fun printingDetails() {
        println("Shape type is ${name}")
        printDimensions()
        println("The area is ${getArea()}")
        println()
    }
}

