import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        int num = 25;
        int sum = 0;
        int lastdigit = num%10;
        sum += sum*+lastdigit;
        num = num/10;
        lastdigit = num%10;
        sum += lastdigit;
        num = num/10;
        lastdigit = num%10;
        System.out.println(sum);
    }
    void great() {
        
        Scanner sc =new Scanner(System.in);
    }
    
}
