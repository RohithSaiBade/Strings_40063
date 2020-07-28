import java.util.Scanner;
public class Prblm9 { 
  
    
  public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
      
String s1=sc.nextLine();
String s2=sc.nextLine();
        StringBuilder result = new StringBuilder(); 
  
     
        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
  
          
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
           
            if (i < s2.length()) 
                result.append(s2.charAt(i)); 
        } 
  
        System.out.println(result.toString());

}
} 
