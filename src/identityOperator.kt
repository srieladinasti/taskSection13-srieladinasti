fun main() {
    var myCat = Animal1()
    var anotherCat = myCat

    myCat.name = "Cat A"
    println(myCat.name)
    println(anotherCat.name)

    if (myCat === anotherCat){
        println("These two references are the same")
    }
    else{
        println("These two references are not the same")
    }

    println()

    var myComputer = Computer1()
    var anotherComputer = myComputer

    myComputer.merk = "Computer A"
    println(myComputer.merk)
    println(anotherComputer.merk)

    if (myComputer === anotherComputer){
        println("These two references are the same")
    }
    else{
        println("These two references are not the same")
    }

    println()

    var myColour = Colour1()
    var anotherColour = myColour

    myColour.type = "Colour A"
    println(myColour.type)
    println(anotherColour.type)

    if (myColour === anotherColour){
        println("These two references are the same")
    }
    else{
        println("These two references are not the same")
    }

    println()

    var myFood = Food1()
    var anotherFood = myFood

    myFood.variety = "Food A"
    println(myFood.variety)
    println(anotherFood.variety)

    if (myFood === anotherFood){
        println("These two references are the same")
    }
    else{
        println("These two references are not the same")
    }

    println()

    var mySmartphone = Smartphone1()
    var anotherSmartphone = mySmartphone

    mySmartphone.brand = "Smartphone A"
    println(mySmartphone.brand)
    println(anotherSmartphone.brand)

    if (mySmartphone === anotherSmartphone){
        println("These two references are the same")
    }
    else{
        println("These two references are not the same")
    }
}

class Animal1(){
    var name: String = ""
}

class Computer1(){
    var merk: String = ""
}

class Colour1(){
    var type: String = ""
}

class Food1(){
    var variety: String = ""
}

class Smartphone1(){
    var brand: String = ""
}