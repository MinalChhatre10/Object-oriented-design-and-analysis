package Dev;

public abstract class Employees {
    private String bagde;
    private String name;

    public Employees(String bagde, String name){
        this.bagde=bagde;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getBagde() {
        return bagde;
    }

    public abstract void display();
}
