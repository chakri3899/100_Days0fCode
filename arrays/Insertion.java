import java.util.*;

public class Insertion {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
        a[i] = s.nextInt();
        int x = s.nextInt();
        int pos = s.nextInt();
        s.close();
        System.out.println(Arrays.toString(insert(a, n, x)));
        System.out.println(Arrays.toString(insertatpos(a, n, x, pos)));
        
    }
    static int[] insert(int[] arr, int n, int x)
    {
        int[] newarr = new int[n+1];
        for(int i = 0; i<n; i++)
        {
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }
    static int[] insertatpos(int[] arr, int n, int x, int pos)
    {
        int[] newarr = new int[n+1];
        for(int i = 0;i<n+1; i++)
        {
            if(i < pos-1)
            newarr[i] = arr[i];
            else if(i == pos-1)
            newarr[i] = x;
            else 
            newarr[i] = arr[i - 1];
        }
        return newarr;
    }
}
