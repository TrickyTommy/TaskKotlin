fun main(){
    for (i in 1..1000){
        var bil = 0
        for (j in 1..1000){
            if (i%j==0){
                bil=bil+1
            }
        }
        if (bil==2){
            println("$i bilangan prima")
        }
    }
}
