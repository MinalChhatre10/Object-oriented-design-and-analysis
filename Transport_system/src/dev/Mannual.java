package dev;

public class Mannual extends Bus{
    private Conductor conductor;
    private int ind;

    public Mannual(int regNo, int ind) {
        super(regNo);

        this.ind = ind;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    @Override
    public void running() {
        System.out.println("Bus Information : ");
        this.displayBus();
        System.out.println("Conductor Name : " + this.conductor.getConductorName());

        System.out.println("Route Information : ");
        this.getRoutesList().get(ind).displayRoute();
    }
}
