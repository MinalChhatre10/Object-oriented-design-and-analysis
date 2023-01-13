package dev;

public class Books extends ReadingMaterial{
    private long ISBN_no;
    public Books(String Title, double price,long ISBN_no) {
        super(Title, price);
        this.ISBN_no=ISBN_no;
    }

    public void setISBN_no(long ISBN_no) {
        this.ISBN_no = ISBN_no;
    }

    public long getISBN_no() {
        return this.ISBN_no;
    }
    public void display(){
        long a=this.getISBN_no();
        System.out.println("ISBN No: "+a);
    }
}
