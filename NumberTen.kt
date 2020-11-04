fun main (){
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    val indices = listOf(8, 7, 2, 8, 2, 6)
    for (i in numbers){
        if (indices.contains(i)){
            print(i)
        }
    }
}