import java.util.Random; 
import java.util.Arrays;
public class DemoTest
{



    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] arr = new int[10];
        
        for(int i = 0; i <10; i++)
        {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Array of Numbers:");
        for(int i = 0; i <10; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Array of Numbers (Sorted):");
        for(int i = 0; i <10; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}