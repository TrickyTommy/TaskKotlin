import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val x =64
    val y =2
    println("Hasil penjumlahan dari $x + $y adalah ${x+y} ")
    println("Hasil pengurangan dari $x - $y adalah ${x-y} ")
    println("Hasil perpangkatan dari $x pangkat $y adalah ${Math.pow(x.toDouble(), y.toDouble())} ")
    println("Hasil pengakaran dari akar $y dari $x adalah ${sqrt(x.toFloat())} ")
    println("Hasil pembagian dari $x / $y adalah ${x/y} ")
    println("Hasil perkalian dari $x + $y adalah ${x*y} ")
}