package dev;

public class Automatic extends Bus{
    private Ticket_Machine TM;
    private int ind;

    public Automatic(int regNo, int ind) {
        super(regNo);

        this.ind = ind;
    }

    public void setTM(Ticket_Machine TM) {
        this.TM = TM;
    }

    public Ticket_Machine getTM() {
        return TM;
    }

    @Override
    public void running() {
        System.out.println("Bus Information : ");
        this.displayBus();
        System.out.println("Ticket Machine No. : " + TM.getTicketMNo());

        System.out.println("Route Information : ");
        this.getRoutesList().get(ind).displayRoute();
    }
}
