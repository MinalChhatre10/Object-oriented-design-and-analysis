package Dev;

public class Automatic extends Buses{
    private Ticket_mach tm;
    private Driver d;

    public Automatic(String rto_reg,Driver d,Ticket_mach tm) {
        super(rto_reg);
        this.d=d;
        this.tm=tm;
    }

    @Override
    public void display() {
        System.out.println("Automatic");
        System.out.println("Bus RTO Registration no: "+this.getRto_reg());
        System.out.println("Driver name : "+this.d.getName());
        System.out.println("Ticket Machine no : "+this.tm.getMachine_no());
    }
}
