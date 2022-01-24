import java.util.Scanner;
public class practical1_3{
    public static void main(String[] args){
        System.out.println("Practical1:3");
        System.out.println("Conversion from Meter to feet");
        Scanner input = new Scanner(System.in);//constructor for input
        double meter;
        double feet;
        System.out.println("Enter value in Meter:");
        meter = input.nextDouble();
        feet = meter * 3.28084;
        System.out.println("feet :" +feet);

    }
}