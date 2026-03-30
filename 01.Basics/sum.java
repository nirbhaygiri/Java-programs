import java.util.Scanner;
public class sum {
    public static void main(String[] args){
int a,b,sum;
System.out.print("Enter two numbers :");
Scanner s=new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();
  
  sum=a+b;
  System.out.print("sum :"+sum);
  s.close();
}
}
