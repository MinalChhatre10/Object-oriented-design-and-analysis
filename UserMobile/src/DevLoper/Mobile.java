package DevLoper;
import DevLoper.User;
import User.Main;
public class Mobile {
    long num;
    User owner;

    public Mobile(long num){
        this.num=num;
    }

    public void setterm(User owner){
        this.owner = owner;
    }
    public User getter(){
        return owner;
    }
    public void assignUSer(User owner){
        //owner = u;
        this.setterm(owner);
        owner.setteru(this);
    }
    public void display(){
        System.out.println("Name: "+owner.name);
        System.out.println("Number: "+num);
    }
}
