import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("enter first number : ");
        int x = uInput.nextInt();
        int a = x;
        System.out.print("enter second number : ");
        int b = uInput.nextInt();
        uInput.close();
        int c = 0;
        if( x%2==0 || b%2==0 ){
            System.out.println("you entered an even number please enter odd number ");

        }
        else{
            for(int i=x; i<=b; i=i+2){
                c = i+c;
                
    
            }
            System.out.printf("sum of odd numbers %d to %d is : %d",a,b,c);

        }
    }
}
