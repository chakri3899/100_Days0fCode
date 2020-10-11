package collections;
import java.util.*;

public class CharactersinString {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();

        HashMap<Character,Integer> temp = new HashMap<Character,Integer>();
        char[] arr = str.toCharArray();
        for(char c : arr)
        {
            if(temp.containsKey(c))
            {
                temp.put(c,temp.get(c)+1);
            }
            else
            {
                temp.put(c,1);
            }
        }
        for(Character i : temp.keySet())
        {
            System.out.println(i + " " + temp.get(i));
        }
        /*for (Map.Entry entry : temp.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } */
    }
}
