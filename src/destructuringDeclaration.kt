fun main() {
    val british = Cat1("British Short Hair", "United Kingdom")
    val (catName, catOrigin) = british
    println(catName)
    println(catOrigin)

    println()

    val iphone = Mobile1("Iphone 7", "Apple")
    val (mobileName, mobileBrand) = iphone
    println(mobileName)
    println(mobileBrand)

    println()

    val macbook = Laptop1("Macbook", "Apple")
    val (laptopName, laptopBrand) = macbook
    println(laptopName)
    println(laptopBrand)
}

data class Cat1(val catName: String, val catOrigin: String)
data class Mobile1(val mobileName: String, val mobileBrand: String)
data class Laptop1(val laptopName: String, val laptopBrand: String)