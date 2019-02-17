import java.util.Scanner;
class Highestmark
{
    public static void main(String[] args)
    {
        int n, high;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of High mark");
        n = s.nextInt();
        int a[] = new int[n];
        if(n>0)
        {
            System.out.println("Invalid mark");
        }
        System.out.println("Enter the Highest mark");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        high = a[0];
        for(int i=0;i<n;i++)
        {
            if(high<a[i])
            high= a[i];
        }
         System.out.println("Highest value "+high);
}
    }

        
     
            
        
        
        
    
