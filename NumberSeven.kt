fun main() {
    var tahun =1
    var end = 5
    for (i in tahun until end){
        if (i % 400 == 0) {
            println(" $i Merupakan Tahun Kabisat");
        } else if (i % 100 == 0) {
            println("$i  Bukan Tahun Kabisat");
        } else if (i % 4 == 0) {
            println("$i  Merupakan Tahun Kabisat");
        } else {
            println("$i  Bukan Tahun Kabisat\n");
        }
    }
}
