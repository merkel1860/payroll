package core.model;

import core.tools.Utils;

public class Employee extends Person{
    private int idEmployee;
    private int socialSecurity;
    private String affectation;


    public Employee() {
        this.idEmployee = Utils.pseudoRandomGenerator();
    }

    public Employee(String fname, String lname,
                    String gender, int socialSecurity,
                    String affectation) {
        super(fname, lname, gender);
        this.socialSecurity = socialSecurity;
        this.affectation = affectation;
        this.idEmployee = Utils.pseudoRandomGenerator();
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public int getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(int socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getAffectation() {
        return affectation;
    }

    public void setAffectation(String affectation) {
        this.affectation = affectation;
    }
}
