package strings;
import java.util.*;
public class StringFormatter {  
    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    } 
    
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        System.out.println(reverseWord(str));    
        }  
}  
