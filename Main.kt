fun main(){

    val sekar : Human = Human("Sekar Arum")
    val andi : Human = Human("Andi")

    sekar.email = "sekar@gmail.com"
    sekar.address = "Tridadi, Sleman, Yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    sekar.talk()
    andi.talk()

    sekar.introduce()

    println(sekar.verify("sekar@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(sekar)

}