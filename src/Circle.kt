class Circle(name: String, _radius: Double = 0.0) : Shape(name) {
    var radius: Double = _radius

    override fun printDimensions() {
        println("The radius is $radius")
    }

    override fun getArea(): Double {
        // area = PI * radius^2
        return Math.PI * radius * radius
    }


}
