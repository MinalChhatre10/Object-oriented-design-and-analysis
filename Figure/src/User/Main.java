package User;

import dev.Circle;
import dev.Figure;
import dev.Shapes;
import dev.Triangle;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Figure f1 = new Figure();
        Figure f2 = new Figure();

        Shapes c1 = new Circle("red","blue",4);
        Shapes t1  = new Circle("blue","red",6);

        Shapes c2= new Triangle("pink","yellow",3,3,4);
        Shapes t2 = new Triangle("yellow","pink",2,3,4);

        f1.addShapes(c1);
        f1.addShapes(t1);

        f2.addShapes(c2);
        f2.addShapes(t2);

        f1.area(c1);
        f1.area(t1);
        f1.area(c2);
        f1.area(t2);
    }
}