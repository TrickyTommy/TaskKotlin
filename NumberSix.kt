fun main() {
    for (i in 1..200) {
        if (i % 2 == 0) {
            println("$i Genap")
            if (i % 8 == 0) {
                println("$i Genap kelipatan delapan")
            }else if (i % 100 == 0 ){
                println("$i kelipatan seratus")
            }
        }else {
            println("$i Ganjil")
            if (i % 7 == 0) {
                println("$i Ganjil kelipatan ke tujuh")
            }

        }
    }
}