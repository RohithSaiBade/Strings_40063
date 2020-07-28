import java.util.Scanner;
class Prblm8
{
   public static void main(String args[])
   {
      String str;
      Scanner sc = new Scanner(System.in);
      str = sc.nextLine();
int i = str.indexOf("*");
String a=str.substring(0,i-1);
String b=str.substring(i+2,str.length());
System.out.println(a+b);
}
}
