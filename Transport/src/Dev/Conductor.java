package Dev;

public class Conductor extends Employees{
    private final String Designation="Conductor";
    public Conductor(String bagde, String name) {
        super(bagde, name);
    }

    @Override
    public void display() {
        System.out.println("Conductors");
        System.out.println("Bagde: "+this.getBagde());
        System.out.println("Name: "+this.getName());
        System.out.println("Designation: "+this.Designation);
    }

}
