public class Armstrong {

    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
public class GFG
{
     
    // Function to calculate the
    // sum of digits of the number N
    static int sumOfDigits(int N)
    {
       
        // Stores the sum of digits
        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }
       
        // Return the sum
        return sum;
    }
       
    // Function to count array elements
    static void elementsHavingDigitSumK(int[] arr, int N, int K)
    {
       
        // Store the count of array
        // elements having sum of digits K
        int count = 0;
       
        // Traverse the array
        for (int i = 0; i < N; ++i)
        {
       
            // If sum of digits is equal to K
            if (sumOfDigits(arr[i]) == K)
            {
       
                // Increment the count
                count++;
            }
        }
       
        // Print the count
        System.out.println(count);
    } 
 
  // Driver code
  public static void main(String args[])
  {
     
    // Given array
    int[] arr = { 23, 54, 87, 29, 92, 62 };
   
    // Given value of K
    int K = 11;
   
    // Size of the array
    int N = arr.length;
   
    // Function call to count array elements
    // having sum of digits equal to K
    elementsHavingDigitSumK(arr, N, K);
  }
}