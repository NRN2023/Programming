import java.util.Scanner;

public class FindingFactorial {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int n;
        double b;
        System.out.print("enter the value you want : ");
        n = uInput.nextInt();
        b = 1;
        // if(n==0){
        //     System.out.println("factorial is : 1.00 of 0");
        // }
        for(int i = 1; i<=n; i++){
            b = i*b;
        }

        System.out.printf("factorial is : %.2f of %d",b,n);
        uInput.close();
    }
}