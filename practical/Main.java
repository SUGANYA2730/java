public Class LogicalOperator1{
  public static void main(String[] args) {

    // && operator
    System.out.println((5 > 3) && (8 > 5)); //true 
    System.out.println((5 > 3) && (8 < 5)); //falue  

    // || operator
    System.out.println((5 < 3) || (8 > 5)); //true
    System.out.println((5 > 3) || (8 < 5)); //true 
    System.out.println((5 < 3) || (8 < 5)); //falue

    // ! operator
    System.out.println(!(5 == 3)); //true
    System.out.println(!(5 > 3));  //falue
  }
}