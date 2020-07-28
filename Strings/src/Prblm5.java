import java.util.Scanner;
class Prblm5
{
   public static void main(String args[])
   {
      String str;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
if(str.length()<=2)
  {
    System.out.println("");
  }
  else
  {
    System.out.println(str.substring(1,str.length()-1));
  }
}
}
