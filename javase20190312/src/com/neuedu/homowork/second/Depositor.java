package com.neuedu.homowork.second;

public class Depositor {
    private String id;
    private String name;
    private Double balance;
    public Depositor(){}
    public  Depositor(String id,String name,Double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Depositor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
