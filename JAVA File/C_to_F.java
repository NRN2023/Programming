import java.util.Scanner;

public class C_to_F 
{
    public static void main(String[] args) 
    {
        Scanner uinput = new Scanner(System.in);
        double celcias, faranhite;
        System.out.print("Please Enter The Value Of Celcias : ");
        celcias = uinput.nextDouble();
        faranhite = 1.8*celcias+32;
        System.out.print("The Calculated Faranhite is : "+faranhite);
        uinput.close();
    }
}
