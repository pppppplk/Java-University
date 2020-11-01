package com.company;

public class FixedPayment {

    public String NameFP;
    public int fixed_monthly_payment, idFP;

    public FixedPayment(String NameFP, int fixed_monthly_payment, int idFP){
        this.NameFP = NameFP;
        this.fixed_monthly_payment = fixed_monthly_payment;
        this.idFP = idFP;
    }

    double average_monthly_salary(){
        return fixed_monthly_payment;

    }
    String GetName() {

        return this.NameFP;
    }


    String GetType() {
        return "Fixed Payment";
    }
}
