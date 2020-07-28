import java.util.Scanner;
class Prblm3{
public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String a="";
        System.out.println("Enter the string");       
        String abc= sc.nextLine();
        int lenght =abc.length();
        if(lenght<=1){
            a=abc;
}
else{
            for (int i=0;i<lenght;i++){
                a=a+abc.charAt(0)+abc.charAt(1);
            }
        }
        System.out.print(a);
   

    }

}
