package strings;
import java.util.*;
public class Reversestring {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        for(int j = a.length()-1; j>=0; j--)
        {
            System.out.println(a.charAt(j));
        }
        /*for(int i = 0; i<a.length(); i++)
        {
            int b = a.charAt(i);
            for(int j = a.length()-1; j>=0; j++)
            {
                if(i == j)
                break;
                b = a.charAt(j);
                break;
            }
        }
        System.out.println(a);*/
        

           
    
    }
}
