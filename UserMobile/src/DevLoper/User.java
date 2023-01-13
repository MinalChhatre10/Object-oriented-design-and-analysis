package DevLoper;
import DevLoper.Mobile;
import User.Main;
public class User {
    String name;
    Mobile no;
    public User(String name){
        this.name=name;
    }

    public void setteru(Mobile no){
       this.no=no;
    }
    public long getter(){
        return no.num;
    }
    public void assignMobile(Mobile no){
        //m.owner=this;
        this.setteru(no);
        no.setterm(this);
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Number: "+no.num);
    }
}
