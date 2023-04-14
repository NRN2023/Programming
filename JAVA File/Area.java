import java.util.Scanner;

public class Area 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double base, hight, area;
        System.out.print("enter the value of base : ");
        base = input.nextDouble();
        System.out.print("enter the value of hight : ");
        hight = input.nextDouble();
        area = 0.5*base*hight;
        System.out.print("the area of the triangle is : "+area);
        input.close();
    }

}
