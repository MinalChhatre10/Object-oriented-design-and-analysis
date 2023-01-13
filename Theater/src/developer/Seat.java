package developer;
enum rowno{
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z

}
public class Seat {
    private int seatno;
    private rowno r;


   public Seat(rowno r , int seatno){
        this.r=r;
        this.seatno=seatno;
   }
   public rowno getterrow(){
       return r;
   }
    public int getterseatno(){
        return seatno;
    }

}
