package collections;
import java.util.*;
public class Colours{
    public static void main(String args[])
    {
        ArrayList<String> cols = new ArrayList<String> ();
        cols.add("Red");
        cols.add("Green");
        cols.add("Yellow");
        cols.add("Violet");
        cols.add("Orange");
        cols.add("Blue");
        System.out.println(cols);
        System.out.println("size of the list: "+ cols.size());
        Iterator<String> it = cols.iterator();
        while(it.hasNext())
        System.out.print(it.next()+" ");
        System.out.println();
        System.out.println("Index of Yellow: " + cols.indexOf("Yellow")); //to find index of yellow
        cols.set(cols.indexOf("Blue"),"White"); //to change blue to white
        System.out.println(cols);
        cols.remove("Green"); //to remove green from the list
        System.out.println(cols);
        System.out.println("Check if orange is there or not: " + cols.contains("Orange")); //to find if orange is present in the list
        System.out.println("Check if pink is there or not: " + cols.contains("Pink")); //to find if pink is present in the list
        cols.clear(); //to delete all elements from the list 
        System.out.println("Empty List: "+ cols);
    }
}