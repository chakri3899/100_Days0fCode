import java.util.*;

public class ArrayrotationusingGCD {

    void rotate(int arr[], int d, int n)
    {
        d = d%n;
        int k,j,i,temp;
        int gcd = getgcd(d,n);
        for(i = 0; i<gcd; i++)
        {
            temp = arr[i];
            j = i;
            while(true)
            {
                k = j+d;
                if(k >= n)
                k = k-n;
                if(k == i)
                break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    void displayarr(int arr[], int size)
    {
        for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    int getgcd(int a, int b)
    {
        if(b == 0)
        return a;
        else
        return getgcd(b, a%b);
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = s.nextInt();
        s.close();
        ArrayrotationusingGCD a = new ArrayrotationusingGCD();
        a.rotate(arr, d, n);
        a.displayarr(arr, n);
    }
}