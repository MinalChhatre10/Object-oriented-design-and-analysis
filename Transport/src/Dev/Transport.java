package Dev;

import java.util.ArrayList;

public class Transport {
    private Buses bs;
    private Employees emp;
    ArrayList<Buses> buses = new ArrayList<Buses>();
    ArrayList<Employees> employees = new ArrayList<Employees>();

    public Employees getEmp() {
        return emp;
    }

    public Buses getBs() {
        return bs;
    }

    public void addBus(Buses bb){
        buses.add(bb);
    }
    public void addemp(Employees ee){
        employees.add(ee);
    }

    public void displayBus(){
        for(Buses b:buses){
            b.display();
        }
    }
    public void displayemp(){
        for(Employees e:employees){
            e.display();
        }
    }

}
