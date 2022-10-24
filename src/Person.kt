class Person (var name: String = "name", var age: Int = 0, var height: Int = 0,
              var weight: Int = 0, var email: String = "email") {

    override fun toString(): String {
        return "Name: $name Age: $age Height: $height Weight: $weight e-mail: $email"
    }

}