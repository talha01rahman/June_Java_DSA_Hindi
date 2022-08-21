import java.util.Scanner;
public class IDFC{
public static Scanner scan = new Scanner(System.in); 
    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt(); // write
        }
    }
    
    public static void Count(int[] arr) {
        int countP=0, countN=0, countZ=0, i;
        for(i=0; i<4; i++)
      {
         if(arr[i]<0)
            countN++;
         else if(arr[i]>0)
            countP++;
         else
            countZ++;
      }
      
      System.out.println("\nTotal Positive Number: " +countP);
      System.out.println("Total Negative Number: " +countN);
      System.out.println("Total Zero: " +countZ);
   }
    

   public static void main(String[] args)
   {

      System.out.print("Enter Size of Numbers: ");
      int size = scan.nextInt();
      int[] arr = new int[size];
      input1D(arr);
      System.out.print("Enter 4 Numbers: ");
      Count(arr);
   }
      
      
}
