object FilterEvenNumbers{

def filterEvenNumbers(numberList:List[Int]): List[Int]={
    numberList.filter(a => a % 2 == 0)
}

def main(args: Array[String]): Unit={
    val numberList = List(1,2,3,4,5,6,7,8,9,10)
    val returnList = filterEvenNumbers(numberList)
    println("\n-----------Even Numbers Filter-----------")
    println(s"\nInput List : $numberList" )
    println(s"outputList : $returnList\n")
}
}
