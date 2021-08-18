package data

class PersonWithConstructor(firstName:String, middleName:String?, lastName:String) {
    constructor(firstName:String, lastName:String):
            this(firstName,null,lastName)
    //tanpa constructor juga masih bisa, asalkan =null di middleName

    init{
        var print = firstName.capitalize()
        if(middleName!=null){print+= " ${middleName.capitalize()}"}
        println(print+" ${lastName.capitalize()}")
    }
}