fun main() {
    val british = Cat("British Short Hair")
    println(british)

    val iphone = Mobile("Iphone 7")
    println(iphone)

    val macbook = Laptop("Macbook")
    println(macbook)
}

data class Cat(val catName: String)
data class Mobile(val mobileName: String)
data class Laptop(val laptopName: String)