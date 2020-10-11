import java.util.*;
public class Prefixsumarray {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++)
        arr1[i] = s.nextInt();
        int[] arr2 = new int[n];

        int sum = arr1[0];
        arr2[0] = arr1[0];
        for(int i = 1;i<n;i++)
        {
            sum = arr2[i-1]+ arr1[i];
            arr2[i] = sum;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
