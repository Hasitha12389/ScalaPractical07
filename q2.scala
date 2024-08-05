object CalculateSquare {

def calculateSquare(numList: List[Int]): List[Int]={
    numList.map(a => a * a)
}

def main(args: Array[String]): Unit={
    val inputList = List(1,2,3,4,5)
    val outputList = calculateSquare(inputList)
    println("\n--------------Square Calculator-----------")
    println(s"\nInputList : $inputList")
    println(s"OutputList : $outputList\n")
}
}