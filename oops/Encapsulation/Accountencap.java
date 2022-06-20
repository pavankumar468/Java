package com.javapoint;
public class Accountencap {
    private long acc_id;
    private String name,email;
    private float amount;

    public void setAcc_id(long acc_id){
        this.acc_id = acc_id;
    }
    public long getAcc_id(){
        return acc_id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
    public float getAmount(){
        return amount;
    }

    

    
}
