import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        int y;
       Scanner scanner= new Scanner(System.in);
        System.out.println("Enter x:");
        x= scanner.nextInt();
        System.out.println("Enter y:");
        y =scanner.nextInt();

        Calculator sum=(a,b)->x+y;
        Calculator sub=(a,b)->x-y;
        Calculator mul =(a,b)->x*y;
        Calculator div=(a,b)-> x/y;

        System.out.println("x+y = " + sum.calculator(x,y));
        System.out.println("x-y = " + sub.calculator(x,y));
        System.out.println("x*y = " + mul.calculator(x,y));
        System.out.println("x/y = " + div.calculator(x,y));


    }
}

