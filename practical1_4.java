import java.util.Scanner;
public class practical1_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//constructor for input
        System.out.println("Practical1:4");
        System.out.println("Conversion from weight to pound");
        System.out.println("Enter weight in pounds:");
        double pound;
        pound = input.nextDouble();

        System.out.println("Enter value height in inch:");
        double inch;
        inch = input.nextDouble();
        double BMI;
        //BMI = Weight (kg) / height^2 (m)
        BMI = (pound * 0.45359237 ) / ((inch * 0.0254)*(inch * 0.0254));
        System.out.println("BMI =" +BMI);

    }
}