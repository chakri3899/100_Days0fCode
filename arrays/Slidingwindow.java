import java.util.*;

public class Slidingwindow {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        arr[i] = s.nextInt();
        int k = s.nextInt();
        s.close();

        int max_sum = 0;
        for(int i = 0; i<k; i++)
        {
            max_sum += arr[i];
        }

        int window_sum = max_sum;
        for(int i = k; i<n; i++)
        {
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum,window_sum);
        }
        System.out.println(max_sum);
    }
}
