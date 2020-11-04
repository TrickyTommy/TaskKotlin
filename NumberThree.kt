fun main() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            println("$i Crucio")

        } else if (i % 5 == 0) {

            println("$i Imperio Aberto")
        } else if (i % 4 == 0) {

            println("$i Crucio Reducto")
        } else {

            println("$i Imperio")

        }
    }
}