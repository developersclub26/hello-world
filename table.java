import java.util.Scanner;
public class table {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");// Matematical tables 
    int num = sc.nextInt();// based on input it gives the tables
    {
        for(int i=1; i<=10;i++)
        {
            System.out.println(num +"x" +i+"="+(num*i));
        }
        
    }
    sc.close(); 
 }  
}
