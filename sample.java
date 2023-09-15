import java.util.*;

class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(i+" ");
        }
        sc.close();
    }
}