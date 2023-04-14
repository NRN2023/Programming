import java.util.Scanner;

public class FindLargeNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner uinput = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        a = uinput.nextInt();
        System.out.print("Enter The Second Number : ");
        b = uinput.nextInt();
        System.out.print("Enter The Third Number : ");
        c = uinput.nextInt();
        if(a>b && a>c){
            System.out.print("First Number is The biggest Number");
        }
        else if(b>a && b>c){
            System.out.print("Second Number is The biggest Number");
        }
        else{
            System.out.print("Third Number is the biggest Number");
        }
        uinput.close();
    
    }

    
}
