import java.util.Scanner;

public class table {
    
    public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter no:");
int num=s.nextInt();
int i;
for(i=1; i<=10; i++){
    System.out.println(num+"*"+i+"="+num*i);
}
s.close();
    }
}

