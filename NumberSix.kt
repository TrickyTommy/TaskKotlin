fun main() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            println("$i Crucio")

        } else if (i in 1..100 step 5) {

            println("$i Imperio Aberto")
        } else if (i in 1..100 step 4) {

            println("$i Crucio Reducto")
        } else {

            println("$i Imperio")

        }
    }
}