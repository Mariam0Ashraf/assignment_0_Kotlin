class Triangle(name: String, _a: Double = 0.0, _b: Double = 0.0, _c: Double = 0.0) : Shape(name) {
    var a = _a
    var b = _b
    var c = _c

    override fun printDimensions() {
        println("The three sides are $a, $b, $c")
    }
    override fun getArea(): Double {
        //calculate the value of s( the perimeter)
        val s = (a + b + c) / 2
        // the area √ (s (s-a) (s-b) (s-c))
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
}
