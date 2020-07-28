import java.util.Scanner;
class Prblm6
{
   public static void main(String args[])
   {
      String a,b;
      Scanner sc = new Scanner(System.in);
 
      
      a = sc.nextLine();
b = sc.nextLine();

 
int c=a.length();
  int d=b.length();
  if(c<d){
    System.out.println( a+b+a);
  }
  else
  {
    System.out.println( b+a+b);
  }
}
}
