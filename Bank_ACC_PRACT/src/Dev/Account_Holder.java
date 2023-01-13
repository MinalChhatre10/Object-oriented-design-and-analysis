package Dev;

public class Account_Holder {
   private String first;
    private String last;

    public Account_Holder(String first,String last){
        this.first=first;
        this.last=last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
