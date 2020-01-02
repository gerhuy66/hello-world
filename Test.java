import java.lang.Runtime;
public class Test
{
    public  static void demo(){
        long start = System.nanoTime()/1000000;
        int tmp =0;
        for(int i = 0; i< 100; i++)
        {
            System.out.println("asdsdasd");
        }
        long end = System.nanoTime()/1000000;
        long runtime = end - start;
        System.out.print("~");
        System.out.print(runtime);
        System.out.print(" Milisecs");
        System.out.println();
    }
    public static void main(String args[]) throws Exception 
    {
        for(int i = 0; i< 100; i++)
        {
            demo();
        }
        
    }
}