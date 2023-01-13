package user;
import developer.Machine;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        int ch;
        Machine ve= new Machine();
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Insert coins: ");
            int coin = sc.nextInt();
            ve.insert(coin);
            System.out.println("Press 0 to insert more coins: ");
            ch=sc.nextInt();
        }while(ch==0);
    }
}
