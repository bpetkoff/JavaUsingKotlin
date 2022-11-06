class PersonHandler {
    companion object{

        fun createPerson(name: String, age: Int, height: Int, weight: Int, email: String): Person {
            Main.dataBase.add(Person(name = name, age = age, height = height, weight = weight, email = email))
            return Person(name = name, age = age, height = height, weight = weight, email = email)


        }

        fun createPerson(age: Int, height: Int, weight: Int, email: String): Person {
            Main.dataBase.add(Person(age = age, height = height, weight = weight, email = email))
            return Person(age = age, height = height, weight = weight, email = email)


        }

        fun createPerson(height: Int, weight: Int, email: String): Person {
            Main.dataBase.add(Person(height = height, weight = weight, email = email))
            return Person(height = height, weight = weight, email = email)

        }

        fun createPerson(weight: Int, email: String): Person {
            Main.dataBase.add(Person(weight = weight, email = email))
            return Person(weight = weight, email = email)

        }

        fun createPerson(email: String): Person {
            Main.dataBase.add(Person(email = email))
            return Person(email = email)

        }


        fun createPerson() : Person {
            Main.dataBase.add(Person())
            return Person()

        }

        fun createPerson(name: String, passwordStrength: Int): Person {
            Main.dataBase.add(Person(name = name, passwordStrength = passwordStrength))
            return Person(name = name, passwordStrength = passwordStrength)

        }



        fun Person.heightToInches(): Double {
            return this.height * 2.54
        }

        fun getHeightInInches(person: Person){
            person.heightToInches()

        }

    }


}