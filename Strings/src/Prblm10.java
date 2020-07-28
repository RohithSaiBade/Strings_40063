import java.util.Scanner;
class Prblm10
{
   public static void main(String args[])
   {
      String str;
      Scanner sc = new Scanner(System.in);
str = sc.nextLine();
int len = str.length();
int n=sc.nextInt();
  String W = "";
  
  for (int i = 0; i < n; i++) {
    W += str.substring(len - n, len);
  }
System.out.println(W);
}
}
