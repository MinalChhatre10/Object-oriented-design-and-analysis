package dev;

public abstract class Shapes {

    private String boundry_col;
    private String fill_col;

    public Shapes(String boundry_col,String fill_col){
        this.boundry_col=boundry_col;
        this.fill_col=fill_col;
    }

    public void setBoundry_col(String boundry_col) {
        this.boundry_col = boundry_col;
    }

    public void setFill_col(String fill_col) {
        this.fill_col = fill_col;
    }

    public String getBoundry_col() {
        return boundry_col;
    }

    public String getFill_col() {
        return fill_col;
    }
    public abstract double area();
    public abstract double peri();
}
