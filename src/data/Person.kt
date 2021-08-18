package data

class Person(){
    var firstName:String=""
    var middleName:String?= null
    var lastName:String=""
    var age:Int=0

    fun inputName(FirstName:String, MiddleName:String?=null, LastName:String){
        firstName=FirstName
        middleName=MiddleName
        lastName=LastName
    }

    fun getFullName():String{
        var print = firstName.capitalize()
        if(middleName!=null){print+= " ${middleName!!.capitalize()}"}
        return print+" ${lastName.capitalize()}"
    }
}