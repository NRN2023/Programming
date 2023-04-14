import java.util.Scanner;
public class Tringle2{
    public static void main(String[] args) {
        int a,b,c;
        double s,area;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the value of a : ");
        a=input.nextInt();
        System.out.println("enter the value of b : ");
        b=input.nextInt();
        System.out.println("enter the value of c : ");
        c=input.nextInt();
        input.close();
        if (a+b>c && b+c>a && a+c>b){
            s=a+b+c/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area of tha tringle is : "+area);
        }
        else{
            System.out.println("tringle is not possible");
        }
    }
}