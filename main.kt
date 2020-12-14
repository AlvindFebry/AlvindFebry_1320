fun main() {

    val alvind : Human = Human("alvind")
    val andi : Human = Human("Andi")

    alvind.email = "alvind@gmail.com"
    alvind.address = "Riau"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    alvind.talk()
    andi.talk()

    alvind.introduce()

    println(alvind.verify("alvind@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(alvind)
}