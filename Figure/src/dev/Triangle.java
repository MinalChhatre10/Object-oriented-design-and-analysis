package dev;

public class Triangle extends Shapes{
    //semi-perimeter of triangle ABC = s = (a + b + c)/2
    //Area of triangle = √[s(s – a)(s – b)(s – c)]
    private int s1,s2,s3;
    public Triangle(String boundry_col, String fill_col,int s1,int s2,int s3) {
        super(boundry_col, fill_col);
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }
    public double area(){
        double s = (this.s1+this.s2+this.s3)/2;
        return Math.sqrt(s*(s-this.s1)*(s-this.s2)*(s-this.s3));
    }

    public double peri(){
        return this.s1+this.s2+this.s3;
    }
}
