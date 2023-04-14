import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner uinpiut = new Scanner(System.in);
        System.out.print("\nEnter a Integer Number : ");
        int a = uinpiut.nextInt();
        if (a%2==0){
            System.out.print("\nThe number you entered it is an Even Number\n");

        }
        else{
            System.out.print("\nThe number you entered it is an Odd Number\n");

        }
        uinpiut.close();
    }
}
