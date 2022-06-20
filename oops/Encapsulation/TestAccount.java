package com.javapoint;
public class TestAccount {
    public static void main(String[] args) {
        Accountencap s = new Accountencap();
        s.setAcc_id(7560504000L);
        s.setName("Sonoo Jaiswal");
        s.setEmail("sonoojaiswal@javatpoint.com");
        s.setAmount(500000f);
        System.out.println(s.getAcc_id()+" "+s.getAmount()+"  "+ s.getEmail()+"  "+s.getName());
    }
}
