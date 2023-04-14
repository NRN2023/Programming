import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        char c;
        Scanner uInput = new Scanner(System.in);
        System.out.print("\nDo you love JAVA ?\n\n\tno(n/N)     yes(y/Y)    : ");
        c = uInput.next().charAt(0);
        if(c=='y' || c=='Y'){
            System.out.print("\nWOW you are a java lover\n");
        }
        else if(c=='n' || c=='N'){
            System.out.print("\nOh you are not a java lover\n");

        }
        else{
            System.out.print("\nplease enter valid keyword\n");

        }
        uInput.close();
        
    }
}
