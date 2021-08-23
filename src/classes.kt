fun main() {
    val myName: Name = Name("Kim Taehyung", "V")
    println(myName.nameIdentity)

    val myAge: Age = Age(26)
    println(myAge.ageIdentity)

    val myFavColour: FavColour = FavColour("Green")
    println(myFavColour.favColourIdentity)

    val myFavFood: FavFood = FavFood("Japchae")
    println(myFavFood.favFoodIdentity)

    val mySkill: Skill = Skill("Sing", "Play sexophone", "Dance")
    println(mySkill.skillIdentity)
}

class Name(var fullName: String, var nickName: String){
    val nameIdentity: String
    get() = "My full name is $fullName and my nick name is $nickName"
}

class Age(var age: Int){
    val ageIdentity: String
    get() = "My age is $age years old"
}

class FavColour(var favColour: String){
    val favColourIdentity: String
    get() = "My fav colour is $favColour"
}

class FavFood(var favFood: String){
    val favFoodIdentity: String
    get() = "My fav food is $favFood"
}

class Skill(var skill1: String, var skill2: String, var skill3: String){
    val skillIdentity: String
    get() = "My skills are $skill1, $skill2, $skill3"
}