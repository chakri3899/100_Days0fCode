package strings;
import java.util.*;
public class AreAnagram {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        s.close();
        if(check(str1,str2))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }

    static boolean check(String str1, String str2)
    {
        HashMap<Character,Integer> temp1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> temp2 = new HashMap<Character,Integer>();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for(char c : arr1)
        {
            if(temp1.containsKey(c))
            {
                temp1.put(c,temp1.get(c)+1);
            }
            else
            {
                temp1.put(c,1);
            }
        }
        for(char c : arr2)
        {
            if(temp2.containsKey(c))
            {
                temp2.put(c,temp1.get(c)+1);
            }
            else
            {
                temp2.put(c,1);
            }
        }

        if(temp1.equals(temp2))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
