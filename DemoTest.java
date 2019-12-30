import java.util.Random; 
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
public class DemoTest
{



    public static void main(String[] args)
    {
        /*
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
        */
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        boolean running = true;
        int tmp = cal.get(Calendar.MINUTE);
        while(running)
        {
            cal = Calendar.getInstance();
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Hour:"+cal.get(Calendar.HOUR));
            System.out.println("Minute:"+cal.get(Calendar.MINUTE));
            System.out.println("Seccond:"+cal.get(Calendar.SECOND));
            if(cal.get(Calendar.MINUTE) > tmp)
            {
                running= false;
            }
        }
    }
}