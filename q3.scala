object FilterPrime{

def isPrime(num:Int): Boolean={
     if(num <= 0){
        false
     }
     else if(num == 1){
        false
    }else if(num == 2 || num == 3){
        true
    }else{
       !(2 to (num-1)).exists(
        x => num % x == 0
       )
    }
}

def filterPrime(numList:List[Int]): List[Int]={
    numList.filter(a =>isPrime(a) )
}

def main(args: Array[String]): Unit={
    val inputList = List(1,2,3,4,5,6,7,8,9,10)
    val outputList = filterPrime(inputList)
    println("\n------------Prime Numbers Filter-------------")
    println(s"\nInputList : $inputList")
    println(s"OutputList : $outputList\n")
}
}