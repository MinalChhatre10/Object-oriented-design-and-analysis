package Dev;

public class Driver extends Employees{
    private final String Designation="Driver";
    public Driver(String bagde, String name) {
        super(bagde, name);
    }

    @Override
    public void display() {
        System.out.println("Drivers");
        System.out.println("Bagde: "+this.getBagde());
        System.out.println("Name: "+this.getName());
        System.out.println("Designation: "+this.Designation);
    }

}
