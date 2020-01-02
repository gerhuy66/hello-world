import java.util.*;
import java.lang.Runtime;
public class Exam
{
    public static int UCLN(int a, int b)
    {
        if(b == 0) return a;
        return UCLN(b,a%b);
    }
    public static int BCNN(int a, int b)
    {
        
        return (a*b)/UCLN(a,b);
    }
    public static boolean isPrime(int a)
    {
        if(a < 2)    return false;
        int i =0;
        for(i = 2;i <= Math.sqrt(a);i++)
        {
            if(a%i == 0) return false;
        }
        return true;
    }
    public static void draw(int n)
    {
            for(int i = 1;i <= n;i++)
            {
                System.out.print("-");
            }
            System.out.println();
    }
    public static void main(String[] args)
    {
        
        
        
    }
    
}


    





