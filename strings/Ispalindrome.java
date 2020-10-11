package strings;
import java.util.*;

public class Ispalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        sc.close();
        int i = 0;
        int j = a.length()-1;
        boolean f = true;
        while(i < j)
        {
            if(a.charAt(i) != a.charAt(j))
            {
                f = false;
                break;
            }
            i++;
            j--;
        }
        if(f == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        
    }
}
