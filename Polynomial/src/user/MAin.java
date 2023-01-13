package user;
import dev.Polynomial;
import dev.Terms;
import java.util.*;
public class MAin {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Polynomial p = new Polynomial();
         p.displaypoly();
        System.out.print("\n");
        System.out.println("Evaluation: ");
        System.out.print("Enter the value of x: ");
        double x= sc.nextDouble();
        p.calVal(x);
        System.out.print("\n");
        System.out.println("Displaying polynomial After Sorting: ");
        p.highPOW();


    }
}
