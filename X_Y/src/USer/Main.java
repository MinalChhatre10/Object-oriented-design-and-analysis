package USer;

import dev.Point;

public class Main {
    public static void main(String[] args){
        Point p1= new Point(10,10);
        p1.translation_x(4);
        p1.display();
        p1.translation_y(-6);
        p1.display();

        p1.scaling_x(3);
        p1.display();
        p1.scaling_y(6);
        p1.display();

        p1.rotation_O(60);
        p1.rotation_O(-120);

    }
}
