import java.util.*;
public class InsertionSort {
    static void sorting(int[] arr, int n)
    {
        for(int i = 1;i<n;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        arr[i] = s.nextInt();
        sorting(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    
}
