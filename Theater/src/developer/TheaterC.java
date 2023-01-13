package developer;

import java.util.ArrayList;

public class TheaterC {
   private ArrayList <Seat> seats = new ArrayList<Seat>();

    public TheaterC(){
        for(rowno r : rowno.values()){
            for(int i =1 ;i<=30;i++){
                Seat st = new Seat(r,i);
                seats.add(st);
            }
        }


    }
    public void display(){

        int k=0;
        for(rowno r : rowno.values()){
            for(int i =1 ;i<=30;i++){
                System.out.print(seats.get(k).getterrow()+""+seats.get(k).getterseatno()+" ");
                k++;
            }

            System.out.println("\n");
        }
        }
}

