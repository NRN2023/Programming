import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        int addition = a+b;
        System.out.println("addition is : "+addition );
        int substraction = a-b;
        System.out.println("substraction is : "+substraction);
        double multiplication = a*b;
        System.out.println("multiplication is : "+multiplication);
        double divition = a/b;
        System.out.println("divition is : "+ divition);
        double modulas = a%b;
        System.out.println("modulas is : "+modulas);
        input.close();


    }
}