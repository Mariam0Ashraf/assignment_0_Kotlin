class EquilateralTriangle(name: String, _side: Double = 0.0) : Shape(name) {
    var side = _side
    override fun getArea(): Double {
        // the area of it is (√3)/4 * (side length)^2
        return (Math.sqrt(3.0) / 4) * side * side
    }

    override fun printDimensions() {
        println("The dimension is $side")
    }
}
