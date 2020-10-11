import java.util.*;
public class Sorting {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
        a[i] = s.nextInt();
        s.close();
        //int smaller = a[0];
        for(int i = 0;i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                /*if(smaller>a[j])
                {
                    smaller = a[j];
                }*/
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            //a[i] = smaller;
        }
        System.out.println(Arrays.toString(a));
    }
}
