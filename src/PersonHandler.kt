class PersonHandler {
    companion object{

        fun createPerson(name: String, age: Int, height: Int, weight: Int, email: String): Person {
            Main.dataBase.add(Person(name = name, age = age, height = height, weight = weight, email = email))
            return Person(name = name, age = age, height = height, weight = weight, email = email)


        }

        fun createPerson(name: String, age: Int, height: Int,
                         weight: Int, email: String, passwordStrength: Int): Person {
            Main.dataBase.add(Person(name = name, age = age, height = height,
                weight = weight, email = email, passwordStrength = passwordStrength))
            return Person(name = name, age = age, height = height,
                weight = weight, email = email, passwordStrength = passwordStrength)

        }
//        fun createPerson(name: String, age: Int, height: Int,
//                         weight: Int, email: String, password: String): Person {
//            return Person(name = name, age = age, height = height,
//                weight = weight, email = email, password = password)
//
//        }
//
//        fun createPerson(name: String, age: Int, height: Int,
//                         weight: Int, email: String, password: String, passwordStrenght: Int): Person {
//            return Person(name = name, age = age, height = height,
//                weight = weight, email = email, password = password, passwordStrength = passwordStrenght)
//
//        }


        fun Person.heightToInches(): Double {
            return this.height * 2.54
        }

        fun getHeightInInches(person: Person){
            person.heightToInches()

        }

    }


}