public class StringEx {

   public static void main(String[] args)
    {
        String column1 = "Sugar";
        String column2 = "panda";
        String column3 = "donut";

        // Are any of the above Strings equal to one another?
        boolean equals1 = column1.equals(column2);
        boolean equals2 = column3.equals(column2);

        // Display the results of the equality checks.
        System.out.println("\"" + column1 + "\" equals \"" +
            column2 + "\"? " + equals1);
        System.out.println("\"" + column3 + "\" equals \"" +
            column2 + "\"? " + equals2);
    }
}