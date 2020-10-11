package strings;
import java.util.*;

public class Firstletter {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        String str1 = str.substring(0,1).toUpperCase() + str.substring(1); //capitalizing first letter of the given string
        System.out.println(str1);
    }
}
