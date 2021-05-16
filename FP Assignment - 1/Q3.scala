object Q3 extends App{
  def totalCost (noOfBooks:Int):Double = {
    if(noOfBooks<=50)
      24.95*0.6*noOfBooks + noOfBooks*3
    else
      24.95*0.6*noOfBooks + 3*50 + (noOfBooks-50)*0.75
  }

  print("The total cost is: "+ totalCost(60))
}