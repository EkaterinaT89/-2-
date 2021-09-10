fun main() {

    val likes: Int = 101

    if (likes % 11 == 1) {
        println("Нравится $likes людям.")
    } else if (likes == 1) {
        println("Нравится $likes человеку.")
    } else if (likes % 10 == 1) {
            println("Нравится $likes человеку.")
    } else {
        println("Нравится $likes людям.")
    }

}