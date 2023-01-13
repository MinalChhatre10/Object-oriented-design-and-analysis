package dev;

import java.util.ArrayList;
import java.util.*;
import java.math.*;
public class Polynomial {
    private ArrayList<Terms> term = new ArrayList<Terms>();

    private double constant;
    Scanner sc = new Scanner(System.in);
    public Polynomial(){
        System.out.println("Enter How many terms do you want: ");
        int n = sc.nextInt();
        System.out.println("Enter Coefficient and power: ");
        for(int i =0;i<n-1;i++){
            int k= i+1;
            System.out.println("Enter Coefficient and power for "+k+" term: ");
            double coef = sc.nextDouble();
            int power = sc.nextInt();
            Terms t = new Terms(coef,power);
            term.add(t);
        }
        System.out.println("Enter the constant: ");
        double co = sc.nextDouble();
        constant= co;
    }
    public void displaypoly(){
        System.out.println("Polynomial : ");
        int k=0;
        for(int i =0 ;i<term.size();i++){
            System.out.print(term.get(k).getterTermC()+"X^"+term.get(k).getterTermP()+" + ");
            k++;
        }
        System.out.print(constant);
    }
    public void calVal(double x){
        double var=x;
        double val=0;
        int k=0;
        for(int i =0 ;i<term.size();i++){
            System.out.print(term.get(k).getterTermC()+"X^"+term.get(k).getterTermP()+" + ");
            val=val+(term.get(k).getterTermC()*(Math.pow(var,term.get(k).getterTermP())));
            k++;
        }
        val=val+constant;
        System.out.print(constant);
        System.out.print("\n");
        System.out.print("VALUE: ");
        System.out.print(val);
    }
    public void highPOW(){
        double maxc;
        int maxp;

        for(int i =0 ;i<term.size();i++) {
            for (int j = 1; j < term.size()-i; j++) {
                if (term.get(i).getterTermP()<term.get(j).getterTermP()){
                    maxc = term.get(i).getterTermC();
                    term.get(i).setterTermC(term.get(j).getterTermC());
                    term.get(j).setterTermC(maxc);

                    maxp = term.get(i).getterTermP();
                    term.get(i).setterTermP(term.get(j).getterTermP());
                    term.get(j).setterTermP(maxp);
                }

            }
        }
        displaypoly();
    }

}

