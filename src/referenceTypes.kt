fun main() {
    var myCat = Animal()
    var anotherCat = myCat

    myCat.name = "Cat A"
    println(myCat.name)
    println(anotherCat.name)

    println()

    var myComputer = Computer()
    var anotherComputer = myComputer

    myComputer.merk = "Computer A"
    println(myComputer.merk)
    println(anotherComputer.merk)

    println()

    var myColour = Colour()
    var anotherColour = myColour

    myColour.type = "Colour A"
    println(myColour.type)
    println(anotherColour.type)

    println()

    var myFood = Food()
    var anotherFood = myFood

    myFood.variety = "Food A"
    println(myFood.variety)
    println(anotherFood.variety)

    println()

    var mySmartphone = Smartphone()
    var anotherSmartphone = mySmartphone

    mySmartphone.brand = "Smartphone A"
    println(mySmartphone.brand)
    println(anotherSmartphone.brand)
}

class Animal(){
    var name: String = ""
}

class Computer(){
    var merk: String = ""
}

class Colour(){
    var type: String = ""
}

class Food(){
    var variety: String = ""
}

class Smartphone(){
    var brand: String = ""
}