public class StringEqualorNot{

  public static void main(String[] args)
    {
        String column1 = "Sugar";
        String column2 = "panda";
        String column3 = "sugar";

        // Test any of the above Strings equal to one another
		
        boolean equals1 = column1.equalsIgnoreCase(column2);
        boolean equals2 = column1.equalsIgnoreCase(column3);

        // Display the results of the equality checks.
		
        System.out.println("\"" + column1 + "\" equals \"" +
            column2 + "\"? " + equals1);
        System.out.println("\"" + column1 + "\" equals \"" +
            column3 + "\"? " + equals2);
    }
}