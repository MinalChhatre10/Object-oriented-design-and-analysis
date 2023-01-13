package user;
import dev.*;

public class Main {
    public static void main(String[] args){
        Stop s1_start= new Stop("Katraj");
        Stop s1_end= new Stop("Chichwad");

        Route r1 = new Route(4);

        r1.setStart(s1_start);
        r1.setend(s1_end);

        r1.addStops("Dhankawadi");
        r1.addStops("Bibwadi");
        r1.addStops("Swargate");

        Mannual m1 = new Mannual(1, 0);
        Driver d1=new Driver("Suresh");
        m1.setDriver(d1);
        Conductor c = new Conductor("Mangesh");
        m1.setConductor(c);
        m1.addRoute(r1);
        m1.running();


//        New route 2
        System.out.println("\n\n\n");
        Stop s2_start= new Stop("Baner");
        Stop s2_end= new Stop("Dehuroad");

        Route r2 = new Route(5);

        r2.setStart(s2_start);
        r2.setend(s2_end);

        r2.addStops("Hinjewadi");
        r2.addStops("Wakad");
        r2.addStops("Tathawade");
        r2.addStops("Mukai Chowk");

        Automatic a1 = new Automatic(2, 0);
        Driver d2=new Driver("Suresh");
        Ticket_Machine TM = new Ticket_Machine(101);
        a1.setTM(TM);
        a1.setDriver(d2);

        a1.addRoute(r2);
        a1.running();
    }
}
