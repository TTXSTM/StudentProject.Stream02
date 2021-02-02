package banc.gb.compte;

import java.io.Serializable;

public class Account implements Serializable {
    private double balance;
    private double maximumOverdraft;
    private String identifiantClient;
    private String code;

    public Account(double balance, double maximumOverdraft, String identifiantClient, String code) {
        this.balance = balance;
        this.maximumOverdraft = maximumOverdraft;
        this.identifiantClient = identifiantClient;
        this.code = code;
    }

    public String getIdentifiantClient() {
        return identifiantClient;
    }

    public String getCode() {
        return code;
    }

    public void debit(double somme) throws NegatifDebitException {
        if(somme<0){
            throw new NegatifDebitException("Somme can not be "+somme);
        }
        balance+=somme;
    }

    public void credit(double somme) throws PositifCreditException {
        if(somme>0){
            throw new PositifCreditException();
        }
        balance+=somme;
    }

    public void checkBalance() {
        System.out.println("Your balance is "+balance+" $");
    }
}
