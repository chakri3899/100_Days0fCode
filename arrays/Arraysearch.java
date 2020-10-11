import java.util.*;

public class Arraysearch {
    static boolean search(int[] arr, int n)
    {
        boolean temp = false;
        for(int j = 0; j<arr.length;j++)
        {
            if(arr[j] == n)
            {
                temp = true;
                break;
            }
        }
        return temp;
    }
    /*boolean binarysearch(int[] arr, int n)
    {
        int len = arr.length;

    }*/
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
        a[i] = s.nextInt();
        int x = s.nextInt();
        s.close();
        boolean t = search(a, x);
        System.out.println(t);
    }
}
