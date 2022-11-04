import java.util.Random as Randy

data class Person (var name: String = "name", var age: Int = 0, var height: Int = 0,
              var weight: Int = 0, var email: String = "email") {

    var userName: String = ""
    var password: String = ""


    init {
        userName = name + Randy().nextInt(100)


    }


    constructor(name: String, age: Int, height: Int, weight: Int, email: String, passwordStrength: Int = 0) :
            this(name, age, height, weight, email){

        for(i in 1..passwordStrength){
            this.password += Randy().nextInt(10)
        }

          }

//    constructor(name: String, age: Int, height: Int, weight: Int, email: String) :
//            this(name, age, height, weight, email){
//
//      
//
//    }


//    override fun toString(): String {
//        return "Name: $name Age: $age Height: $height Weight: $weight e-mail: $email username: $userName password: $password"
//    }


}