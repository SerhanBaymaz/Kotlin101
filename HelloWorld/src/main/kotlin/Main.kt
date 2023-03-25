//import java.io.StringBufferInputStream
import java.math.BigDecimal
import java.math.BigInteger

fun main(){
    println("*************************START*****************************")
    println("Hello world!")

    //Defining variable
    var firstVariable = "Hi!"
    println("The value is : $firstVariable")
    firstVariable = "I've changed the String."
    println("The value is : $firstVariable")



    var a :Double = 16.2
    println("The value is : $a")
    a = 18.0
    println("The value is : $a")
    a = 18.2
    println("The value is : $a")


    //val is like a "final" in Java
    val immutableValue = 8
    println("The value is : $immutableValue")
    //immutableValue = 9    ------> val cannot be reassigned!


    println("-----------------Operators and Types-------------------")
    var abc : Int = 98
    var abcStr : String = abc.toString()
    var abcBigDec : BigDecimal  = abcStr.toBigDecimal()

    println("abc's data type is : ${abc::class}")
    println("abcStr's  data type is : ${abcStr::class}")
    println("abcBigDec's data type is : ${abcBigDec::class}")

    val oneMillion : Int = 1_000_000 //it is more readeble
    println("One million is :"+oneMillion)

    println("-------------Conditions--------------")
    var matematikNotu =72
    if (matematikNotu >85){
        println("AA aldınız.")
    }else if(matematikNotu <= 85 && matematikNotu >70){
        println("BB aldınız.")
    }else if(matematikNotu <= 70 && matematikNotu >50){
        println("CC aldınız.")
    }else if(matematikNotu <= 50 && matematikNotu >35){
        println("DD aldınız.")
    }else if(matematikNotu <= 35 && matematikNotu >0){
        println("FF aldınız.")
    }else{
        println("Geçersiz not!")
    }

    val fizikNotu =88
    when(fizikNotu){
        in 86..100 -> println("AA aldınız.")
        in 71..85 -> println("BB aldınız.")
        in 51..70 -> println("CC aldınız.")
        in 36..50 -> println("DD aldınız.")
        else -> println("Geçersiz not!")
    }


    println("----------Loops---------")
    val sehirler= arrayOf("İstanbul","Ankara","Antalya","İzmir")

    for (i in sehirler) {

        println(i)
    }


    println("Telefonu şarja takınız.")

    var sarj = 94
    while (sarj< 100) {
        println("Şarj ediliyor. Mevcut şarjınız : ${sarj} ")
            sarj++;
        }

        println("Şarjınız doldu.")








    println("**************************END******************************")
}