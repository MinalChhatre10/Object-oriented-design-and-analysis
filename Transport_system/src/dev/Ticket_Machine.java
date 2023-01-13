package dev;

public class Ticket_Machine {
    private int TicketMNo;

    public Ticket_Machine(int TicketMNo){
        this.TicketMNo=TicketMNo;
    }

    public int getTicketMNo(){
        return this.TicketMNo;
    }

    public void setTicketMNo(int TicketMNo){
        this.TicketMNo = TicketMNo;
    }
}
