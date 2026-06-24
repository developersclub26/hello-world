import java.util.Scanner;//importing the input method to the source code

public class name { // this is the main method in this source code
    
    public static void main(String[] args) { //
       Scanner sc = new Scanner(System.in);//starting element for starting for input methods
       System.out.print("Enter your name: "); //User Enter the Name
       String peru = sc.nextLine(); //opeartion to take a input 
       System.out.print("Enter your Age: ");//User Enter the Age
       int age = sc.nextInt();//opeartion to take a input
       System.out.print("Enter your height: ");//User Enter the height
       double height = sc.nextDouble();//opeartion to take a input
       System.out.println("Hello, "+ peru +"!"); //it prints name with hello 
       System.out.println("Age, " + age );//it prints the age
       System.out.println("Height, " + height +" Meters");//it prints the height
       
        // same example for product of two values different in veraibles
        System.out.print("Enter the value1: ");//input first value
       
        int value1 = sc.nextInt();//function to read the value
        System.out.print("Enter the Value2: ");//input second value
        int value2 = sc.nextInt();//fuction to read the value
        System.out.println("This is the product value "+ value1 * value2 );//this will print the product of two numbers
        //example of name with the santance
        System.out.print("Enter the name: ");//User Enter the Name
        String nam = sc.nextLine();//opeartion to take a input 
        System.out.println("This is my name" + nam); //it prints name with this is my name + user input
       
        sc.close();//close tag for input methods
       
    }
}
