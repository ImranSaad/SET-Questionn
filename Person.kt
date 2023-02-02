package com.example.playground


fun main(args : Array<String>){
    var Numbers = listOf<Int>(1,4,7,8,9,4,4,1,15,24,74,48,64)
    var MaxNumber = Integer.MIN_VALUE
    for (i in Numbers){
        if (MaxNumber < i)
            MaxNumber = i

    }
        println(MaxNumber)

        if (MaxNumber % 2 == 0){
            println("valid")
        }else
            println("Invalid")

    var sum = Numbers.sum()
    println(sum)

    if (sum % 2 == 0){
        println("valid")
    }else
        println("invalid")

    var OddNumber = Numbers.filter { x -> x % 2 != 0}
    var  EvenNumber = Numbers.filter { x -> x % 2 == 0 }

    println(OddNumber)
    println(EvenNumber)

    var OddMax = Integer.MIN_VALUE
    for (i in OddNumber){
        if (OddMax < i)
            OddMax = i
    }
        println(OddMax)

    var MnNumber = Integer.MAX_VALUE
    for (i in EvenNumber){
        if (MnNumber > i)
            MnNumber = i
    }
       println(MnNumber)

    var MinMaxPlus = OddMax + MnNumber

    println(MinMaxPlus)

    if (MinMaxPlus % 2 == 0){
        println("valid")
    }else
        println("invalid")

    /*var Map: HashMap<Int , Int> = HashMap()
    var Freq = null
    for (i in Numbers){
        if ()
    }*/

}

   /* var Number = listOf<Int>(45454454,454545454)
    var sum = Number.sum()

   if (sum % 2 == 0){
       println("even")
   }else
       println("ODD")
}*/

/*    var PhoneNumber = readln()
    var istrue = true


    if (PhoneNumber.length == 10){

        for (i in PhoneNumber.indices){
            if (PhoneNumber[i].code in 48..57){


            }else istrue = false
        }

    }else istrue = false

    if (istrue) println("phonenumber is vlalid")
         else println("phonenumber is invlalid")


}*/
/*
    var name1 = "khannn"
    var name2 = "khan"
    val Anagram: HashMap<Char , Int> = HashMap()

    for (i in name1){
        if (Anagram.containsKey(i)){
            Anagram[i] = Anagram[i]!! + 1
        }else
            Anagram[i] =  1
    }
    for (i in name2){
        if (!Anagram.containsKey(i)){
            //Anagram[i] = Anagram[i]!!

        }else
            Anagram[i] = Anagram[i]!! - 1

            if (Anagram[i] == 0) {
                Anagram.remove(i)
                Anagram.isEmpty()
            }else
                Anagram[i] = Anagram[i]!!

    }
//        println(Anagram)
     if (Anagram.isEmpty()) {
         println("$name1 and $name2 are Anagrams")
     }else
         println("${Anagra} is not Anagram")
}*/

/*
        var str1 = "1545"
        var str2 = "1245"

        var isAnagram = Arrays.equals(str1.chars().sorted().toArray(),
            str2.chars().sorted().toArray())

        if (isAnagram)
            println("Strings are an anagrams of each other");
        else
            println("Strings are not Anagrams of each other");

}*/

   /* var name1 = "khan"
    var name2 = "hkna"
    val Anagram : HashMap<Char , Int> = HashMap()

    for (i in name1.toCharArray()) {
        if (Anagram.containsKey(i)){
            Anagram[i] = Anagram[i]!! + 1
        }else
            Anagram[i] = 1
    }
    for (i in name2.toCharArray()){
        if (!Anagram.containsKey(i)){
            return false
        }else
            Anagram[i] = Anagram[i]!! - 1

                if (Anagram[i] == 0)
                    Anagram.remove(i)
    }
    return Anagram.isEmpty()

}
fun */

  /*  var one = "khan"
    var two = "hkan"
    val Anagram: HashMap<Char,Int> = hashMapOf()

    for (i in one.toCharArray()){
        if (Anagram.containsKey(i)) {
            Anagram[i] = Anagram[i]!! + 1
        }else
            Anagram[i] = 1
    }

    for (i in two.toCharArray()) {
        if (!Anagram.containsKey(i)) {
                return false
        }else
            Anagram[i] = Anagram[i]!! - 1

    }*/



/*fun Anagram(one : String , two : String): Boolean {

    var Name = "khan"
    var Name2 = "hank"
    val anagram : HashMap<Char , Int> = HashMap()

    for (i in Name.toCharArray()){
        if (anagram.containsKey(i)){
            anagram[i] = anagram[i]!! + 1
        }else
            anagram[i] = 1
    }
    for (i in Name2.toCharArray()){
        if (!anagram.containsKey(i)){
            return false
        }else
            anagram[i] = anagram[i]!! - 1

                if (anagram[i] == 0)
                    anagram.remove(i)
    }
      return anagram.isEmpty()
}*/

  /*  var Digits = listOf<Int>(1,4,5,8,5,4,1,2,3,6,5,4,4)
    var  Freq : HashMap<Int , Int> = HashMap()

    for (i in Digits) {
        if (Freq[i] == null)
            Freq[i] = 1
        else
            Freq[i] = Freq[i]!! + 1
    }
       var  Most = Integer.MIN_VALUE

       for (i in Digits){
           if (Most < Freq[i]!!)
               Most = Freq[i]!!
       }

          println(Most)
}*/

    /*var Map: HashMap<Char , Int> = HashMap()
    var One = "name"
    var Two = "anme"
    var check = true

    for (i in One){
        if (Map.containsKey(i)) {
            Map[i] = Map[i]!! + 1
        }else
            check = false
            Map[i] = 1
    }

    return Map.isEmpty()
}
*/

   /* var ListOfEle = listOf<Int>( 4,  4, 5,  2, 2,  8, 8, 7, 9, 9, 5 )
    var FrequencyMap: HashMap<Int, Int> = HashMap()

    for (i in ListOfEle) {
        if (FrequencyMap[i] == null) {
            FrequencyMap[i] = 1
        } else
            FrequencyMap[i] = FrequencyMap[i]!! + 1
    }
      println(FrequencyMap)*/






  /*  val three = "dorm"
    val four = "mordor"
    //LOTR reference
    println(areAnagrams(three, four))

    val five = "tom marvolo riddle"
    val six = "iam lord voldemort"
    //the famous Harry Potter reference
    println(areAnagrams(five, six))

    val seven = "imran"
    val eight = "mravi"
    println(areAnagrams(seven, eight))


private fun areAnagrams(one: String, two: String): Boolean {
    val map = HashMap<Char, Int>()

    for (c in one.toCharArray())
        if (map.containsKey(c))
            map[c] = map[c]!! + 1
        else
            map[c] = 1

    for (c in two.toCharArray())
        if (!map.containsKey(c))
            return false
        else {
            map[c] = map[c]!! - 1

            if (map[c] == 0)
                map.remove(c)
        }
    return map.isEmpty()
}*/
  /*  val numbers = listOf(1,1,1,1,1,2,2,3,4,4,5,5,6,6,7,7,7,8,8,8,8,9,9)
    val freqMap = HashMap<Int, Int>()
    for(i in numbers){
        if(freqMap[i] == null)
            freqMap[i] = 1
        else
            freqMap[i] = freqMap[i]!!+1
    }
    var most = Integer.MAX_VALUE
    var maxValue = numbers[0]
//     key = value
//     {1=1, 2=1, 3=1, 4=1, 5=2, 6=1, 7=3, 8=1, 9=1}
    for(i in numbers){
        if(most > freqMap[i]!!){
            most = freqMap[i]!!
            maxValue = i
        }
    }
    println(maxValue)*/




/*   var sum = 0
   var ListOfElements = listOf<Int>(5,2,4,7,8,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3)
   var EvenNumber = ListOfElements.filter {x -> x - 1 != 2}

   for (i in EvenNumber)
       sum += i
   println(sum)

}*/

   /* var Numbers = listOf<Int>(4,5,8,7,3,6,9,55)
    var SmallNumber = Numbers[0]

    for (i in Numbers)

        if (SmallNumber > i)
            SmallNumber = i

    println(SmallNumber)*/


/*    var Numbers = listOf<Int>(1,5,8,6,4,7)
    var mean = Numbers.average()

    println(mean)

}*/

  /*  var Numbers = listOf<Int>(4,5,8,7,3,6,9,55)
    var SmallNumber = Numbers[0]

    for (i in Numbers)

        if (SmallNumber > i)
            SmallNumber = i

      println(SmallNumber)


}*/
    /*var sum = 0
    var ListOfElements = listOf<Int>(5,2,4,7,8)
    var EvenNumber = ListOfElements.filter { x -> x % 2 != 0 }

    for (i in EvenNumber)
        sum += i
    println(sum)
}*/
/*fun OddEven(digits: List<Int>) {

    var Odd = true
    var sum = 0


    for (i in digits)
        sum += i
    Odd = (sum % 2) != 1

    return if  (Odd) println("$sum is Even") else println("$sum is Odd")
}*/

    /*val ListOfNum = listOf(1,4,8,5,6,7,10,17,3)
    var MaxValue = 0
    for (i in ListOfNum){
          MaxValue += i
    }
    if (MaxValue % 2 == 0){
        println("$MaxValue is Even")
    }else
        println("$MaxValue is Odd")*/


  /* OddEven(listOf(1,4,5,4))
}
fun OddEven(total:List<Int>): Int {

    var prin = "k"
    var sum = 0
    for (i in total)
        sum += i
    if (sum % 2 == 0){
        prin = "is odd"
    }else{
        prin = "is even"
    }
    return sum
}

*/
/*
fun OddEven(list: List<Int>) {

    if (list.isEmpty()){
        println("list is empty")
    }else{
        var sum = 0
        for (i in list)
            sum += i
         if (sum % 2 == 0){
            println("$sum is even")
        }else
            println("$sum is odd")

    }

}
*/



/* val Numbers = listOf<Int>()

 if (Numbers.isEmpty()){
     println("list is empty")

 } else  {

      var SmallNumber: Int = Numbers[0]

     for (i in Numbers){

         if (SmallNumber > i)

             SmallNumber = i


     }
     println("Small number is $SmallNumber")
 }
}*/



   /* var List = listOf(1, 2, 5, 7, 4, 3)
    var Odd = List.filter { x -> x % 2 != 0 }
    var Even = List.filter { x -> x % 2 != 1  }

    println("List of numbers are $List")
    println("List of odd number is $Odd")
    println("List of even number is $Even")*/




/* val ab = readln()
 var check = true
 var b = readln().toInt()


 if (ab.length > b){
     for (i in ab.toInt() downTo b)
         ab[i].code in 48..57


 }else
     check = false

 if (check) = println(true)*/






   /* var result = total(1 , 5)
    print(result)
}

fun total(a:Int , b:Int ): Int{

    var sum = 0

    for (i in a..b){
        if (b == i)
            print("$i = ")
        else
            print("$i+")

        sum += i

    }

    return(sum)


}*/









    //println(addedOn)

   /* val name = readln()

    var mymutublelist = mutableListOf("india", "japan", "china", "america")



    if (name in mymutublelist){

        mymutublelist.remove(name)

        for (i in mymutublelist){

            println(i)

        }


    }else println("it is not in list")*/






   /* var num1 = readln()
    var num2 = readln()
    var sum = num1.sumOf {  }
    println("sum of $num1 and $num2 is")*/


    /*println("enter e-mail")

    var email = readln()
    var isvalidemail = true

    if (email.length in 13..40) {

        for (index in email.indices)
            if (email[index].code in 21..126) {
                if (email[index].isLowerCase()) {



                } else isvalidemail = false


            } else isvalidemail = false


    } else isvalidemail = false

    if (isvalidemail) println("valid")
    else println("invalid")*/



    /*println("enter phone-number")
    var numebr = readln()
    var isValidNumber = true

    if (numebr.length == 10) {

        for (index in numebr.indices){
            if (numebr[index].code in 48..57){

            } else {
                isValidNumber = false
            }
        }
    }else isValidNumber = false


    if (isValidNumber) println("valid")
    else println("Invalid")*/



    /*if (numebr in ("a,b,ab"))
        println("number is not correct")*/

    /*println("enter phone number")

    val phonenumber = readln()
    val alphabet = ('a'..'z').toMutableList().toString()

    if (phonenumber in alphabet)
        println("$phonenumber is not correct number")
    else if (phonenumber.toLong() in 999999999..10000000000)
        println("$phonenumber is correct number")
    else
        println("$phonenumber is not correct number")*/


    /*else if (phonenumber.toString() in alpha)
        println("${phonenumber.toString()} is not correct")
    else
        println("${phonenumber.toLong()} is not correct")*/



    /*val fruit = readln()

    val listoffruits = listOf("apple", "orange", "banana", "grapes")
    if ( fruit in listoffruits )
        println("$fruit  is in the listoffruit")
    else
        println("$fruit is not in the listoffruit")*/



// val day1 = "monday"
// var daysofweek = listOf("sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "stutaday")
// for ((index,day1) in daysofweek.withIndex())
// println("$index : $day1")
// }
//
// /*  println("enter your number")
//
// val number: Long = 10000000000
// val exclude: Long = 99999999
// var age = readln()
//
// if (age >= 'a'.toString() && age <= 'z'.toString() || age >= 'A'.toString() && age <= 'Z'.toString()  )
//
// println("enter digit")
//
// else
// println("$age")
//
//
//
//
// /*val name: String = readln()
// val  age: Byte = 21
// val number: Long = 9602936673
//
// if (name == "9602936673")
// println("hello my name is $name and i am $age years old and my phonenumber is $number")
// else
// println("correct your name")*/
//
// }
//
// /*println("enter your name")
// val  name = readln().toString()
//
// if (name == "imran")
// println("enter password")
// else
// println("reenter your name")
//
// val password = readln().toString()
// if (password == "khan")
// println("whats day today")
// else
// println("password incorrect")
//
// val days = readln().toString()
//
// val monday    = "potato"
// val tuesday   = "chicken"
// val wednesday = "moton"
// val thuresday = "eggs"
// val friday    = "coriander"
// val stautday  = "rice"
// val sunday    = "biryani"
//
// if (days == "monday")
// println("lets cook $monday")*/
//
//
//
//
//
//
//
//
//
//
// /*  println("enter any number")
// val totalnumber = readln().toInt()
//
// println("re-enter any number")
// var choicenumber = readln().toInt()
//
// println("press 1 to multiple" +
// "  press 2 to division" +
// "  press 3 to addtion" +
// "  press 4 to mines")
//
// val selectnumber = readln().toInt()
//
// val i = 1
// val m = 2
// val r = 3
// val a = 4
//
// val multiplaenumber = choicenumber
// val multiple = totalnumber * multiplaenumber
// val divisonnumber = choicenumber
// val divison = totalnumber % divisonnumber
// val addtionnumber = choicenumber
// val addtion = totalnumber + multiplaenumber
// val minesnumber = choicenumber
// val mines = totalnumber - divisonnumber
//
// if (selectnumber == i)
// println("$totalnumber * $choicenumber is $multiple")
// else if (selectnumber == m)
// println("$totalnumber % $choicenumber is $divison")
// else if (selectnumber == r)
// println("$totalnumber + $choicenumber is $addtion")
// else if (selectnumber == a)
// println("$totalnumber - $choicenumber is $mines")
// else
// println("enter valid number")*/
//
//
//
// /* println("multiple of $totalnumber and $multiplaenumber is $multiple")
// println("devision of $totalnumber and $multiplaenumber is $divison")
// println("addtion of $totalnumber and $multiplaenumber is $addtion")
// println("mines of $totalnumber and $multiplaenumber is $mines")*/
//
//
//
// /*println("enter any number")
// val totalnumber = readln().toInt()
//
//
// println("re-enter any number")
// val choicenumber = readln().toInt()
//
// val i = 1
// val m = 2
// val r = 3
// val a = 4
//
// when (choicenumber){
//
// in i ->
// }*/
//
//
// //val multiplaenumber = choicenumber
// //val multiple = totalnumber * multiplaenumber
// //val divisonnumber = choicenumber
// //val divison = totalnumber % divisonnumber
// //val addtionnumber = choicenumber
// //val addtion = totalnumber + multiplaenumber
// //val minesnumber = choicenumber
// //val mines = totalnumber - divisonnumber
//
//
// //println("multiple of $totalnumber and $multiplaenumber is $multiple")
// //println("devision of $totalnumber and $multiplaenumber is $divison")
// //println("addtion of $totalnumber and $multiplaenumber is $addtion")
// //println("mines of $totalnumber and $multiplaenumber is $mines")*/
//
//
// // println("enter debited amount")
// //val debitedamount = readln().toInt()
//
// //val remainingamount = totalamount-debitedamount
   //  println("your remainung amount is $remainingamount rupees