 class Square(name: String, _length: Double = 0.0, _height: Double = 0.0) : Shape(name) {
    var length: Double = _length
    var height: Double = _height

    override fun printDimensions() {
        println("The length is $length, and the height is $height")
    }
    override fun getArea(): Double {
        //area = length * height
        return length * height
    }


}
