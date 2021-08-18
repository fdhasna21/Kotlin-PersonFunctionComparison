package app
import data.Person
import data.PersonWithConstructor

fun main(){
    val p1 = Person()
    p1.inputName(FirstName = "fernanda",LastName = "hasna")
    println(p1.getFullName())

    val p2 = PersonWithConstructor(firstName = "ferizka",lastName = "zahra")
}