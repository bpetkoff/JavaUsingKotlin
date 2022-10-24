class PersonHandler {
    companion object{

        fun createPerson(name: String, age: Int, height: Int, weight: Int, email: String): Person {
            return Person(name = name, age = age, height = height, weight = weight, email = email)

        }

        fun Person.heightToInches(): Double {
            return this.height * 2.54
        }

        fun getHeightInInches(person: Person){
            person.heightToInches()

        }

    }


}