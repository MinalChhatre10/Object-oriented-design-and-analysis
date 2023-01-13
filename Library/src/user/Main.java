package user;

import dev.*;

public class Main {
    public static void main(String[] args){
        Library l1= new Library();

        Members m1=new Members("Ramesh");
        Members m2=new Members("Suresh");
        Members m3=new Members("Ram");
        Members m4=new Members("Minal");

        ReadingMaterial r1=new Books("Lord of the rings",300,3456643);
        ReadingMaterial r2=new Books("The Witch",200,43322643);
        ReadingMaterial r3=new Books("Catcher in the eye",500,555456643);

        ReadingMaterial r4=new Books("Sky is pink",350,322643);
        ReadingMaterial r5=new Books("The Lion",100,43322643);
        ReadingMaterial r6=new Books("Harry Poter",550,555452243);

        ReadingMaterial r7=new Magazine("Fashion Focus",40,3);
        ReadingMaterial r8=new Magazine("Soul Talk",70,6);
        ReadingMaterial r9=new Magazine("Fan Official",50,5);

        ReadingMaterial r10=new CDs("Semiconductor Menmory",100,120);
        ReadingMaterial r11=new CDs("Success",200,60);
        ReadingMaterial r12=new CDs("Data Structures",150,54);

        l1.addMembers(m1);
        l1.addMembers(m2);
        l1.addMembers(m3);
        l1.addMembers(m4);

        l1.addreadingMaterials(r1);
        l1.addreadingMaterials(r2);
        l1.addreadingMaterials(r3);
        l1.addreadingMaterials(r4);
        l1.addreadingMaterials(r5);
        l1.addreadingMaterials(r6);
        l1.addreadingMaterials(r7);
        l1.addreadingMaterials(r8);
        l1.addreadingMaterials(r9);
        l1.addreadingMaterials(r10);
        l1.addreadingMaterials(r11);
        l1.addreadingMaterials(r12);

        System.out.println("Reading Material : ");
        l1.displayMaterial();
        System.out.println("Members: ");
        l1.displayMembers();

        System.out.println("Issued Material and Checked in : ");
        m1.issueMEm(r1);
        m1.issueMEm(r2);
        System.out.println("Members: ");
        l1.displayMembers();
        l1.checkin(r1);
        l1.checkin(r2);
        System.out.println("Reading Material : ");
        l1.displayMaterial();

        System.out.println("Returned Material and Checked out : ");
        m1.returnMEm(r1);
        System.out.println("Members: ");
        l1.displayMembers();
        l1.checkout(r1);
        System.out.println("Reading Material : ");
        l1.displayMaterial();



    }
}
