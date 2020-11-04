fun main() {
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    val max = numbers.max() ?: 0
    var sum = 0

    for (i in numbers) {

        if (i == max) {
            continue
        }
        sum += i
    }
    println("$sum")
    // Output: 28
}
