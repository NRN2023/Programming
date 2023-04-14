import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int num;
        System.out.print("\nfor select your language press \n\n\t1 for bangla\n\t2 for hindi\n\t3 for urdu\n\n\t:");
        num =uInput.nextInt();
        switch(num){
            case 1:
            System.out.print("\nselected language is bangla\n");
            break;
            case 2:
            System.out.print("\nselected language is hindi\n");
            break;
            case 3:
            System.out.print("\nselected language is urdu\n");
            break;
            default:
            System.out.print("\nplease enter a valid keyword\nyour default language is english\nyou entered : "+num);
        }
        uInput.close();
    }
}
