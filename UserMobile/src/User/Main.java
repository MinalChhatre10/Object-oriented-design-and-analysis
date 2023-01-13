package User;
import DevLoper.Mobile;
import DevLoper.User;
public class Main {

    public static void main(String args[]){
//        User Minal = new User("Minal Chhatre");
//        long num1= 84840639;
//        Mobile num = new Mobile(num1);
//        Minal.setter(num);
//        System.out.println(Minal.getter());
//        Minal.display();
//        num.setter(Minal);
//        System.out.println(num.getter());
//          num.display();
//        Mobile num2 = new Mobile(76521);
//        Minal.assignMobile(num2);
//     //   Minal.display();
//        num2.display();
//        User Kishor = new User("Kishor");
//        num2.assignUSer(Kishor);
//        num2.display();

        User Minal = new User("Minal Chhatre");
        User Kishor = new User("Kishor");
        long num11= 84840639;
        long num22= 34738493;
        Mobile num1 = new Mobile(num11);
        Mobile num2 = new Mobile(num22);
        Minal.assignMobile(num1);
        Kishor.assignMobile(num2);

        User mansi = new User("mansi");
        User shreya = new User("shreya");
        long num33= 98480639;
        long num44= 4738493;
        Mobile num3 = new Mobile(num33);
        Mobile num4 = new Mobile(num44);

        num3.assignUSer(mansi);
        num4.assignUSer(shreya);

        Minal.display();
        Kishor.display();
        num3.display();
        num4.display();
    }
}
