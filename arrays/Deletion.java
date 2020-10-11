import java.util.*;

public class Deletion {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
        a[i] = s.nextInt();
        int x = s.nextInt();
        //int pos = s.nextInt();
        s.close();
        System.out.println(Arrays.toString(delete(a, n, x)));
    }
    static int[] delete(int[] arr, int n, int x)
    {
        for(int i = search(arr, x);i<n-1;i++)
        {
           arr[i] = arr[i+1];
        }
        return arr;
    }
    static int search(int[] arr, int n)
    {
        int temp = 0;
        for(int j = 0; j<arr.length;j++)
        {
            if(arr[j] == n)
            {
                temp = j;
                break;
            }
        }
        return temp;
    }
}
