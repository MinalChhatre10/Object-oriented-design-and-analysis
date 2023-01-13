package User;
import Dev.Point;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Point p=new Point(10,10);
        System.out.println("after translation of X:"+p.translation_x(4));
        System.out.println("after translation of Y:"+p.translation_x(-6));
        System.out.println("after scaling of X:"+p.scaling_x(3));
        System.out.println("after scaling of Y:"+p.scaling_y(6));
        p.rotation_o(-120);
        p.rotation_o(60);

    }

}
