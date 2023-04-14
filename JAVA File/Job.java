import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        char a, b;
        Scanner uInput=new Scanner(System.in);
        System.out.print("\nHave you done Masters ?\n\npress (y/Y) for yes or (n/N) for no : ");
        a=uInput.next().charAt(0);
        System.out.print("\nAre you proficient in English ?\n\npress (y/Y) for yes or (n/N) for no : ");
        b=uInput.next().charAt(0);

        if (a == 'y' || a == 'Y' && b=='y' || b=='Y'){
            System.out.print("\n--------------------------------\nCongratulations you have been granted permission for the interview\n--------------------------------\n");
        }
        else if (a == 'n' || a == 'N' && b=='n' || b=='N'){
            System.out.print("\n--------------------------------\nSorry you are not authorized\n--------------------------------\n");

        }
        else{
            System.out.print( "\n--------------------------------\nPlease enter a valid keyword\n--------------------------------\n");
        }
        uInput.close();


    }
}
