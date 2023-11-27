import java.util.Scanner
fun main(args:Array<String>) {
   for (i in 2000 .. 2050 step 2)
       if (i % 4==0 ){
           println("${i} is a leap year")
       }
        else{
            println("${i} is not a leap year")
       }
}

