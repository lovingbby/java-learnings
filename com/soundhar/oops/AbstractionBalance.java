package com.soundhar.oops;



abstract class Balance{
    abstract void getBalance();
    void accountName() {
        System.out.println("soundhar account holder");
    }
}

class ICIC extends Balance{
    @Override
    void getBalance() {
        System.out.println("icic bank");
    }
}

class IndianBank extends Balance{
    @Override
    void getBalance() {
        System.out.println("IndianBank bank");
    }
}

public class AbstractionBalance {
    public static void main(String[] args) {

     Balance b= new ICIC();
     Balance i= new IndianBank();
     b.getBalance();
     i.getBalance();
     b.accountName();
     i.accountName();
    }
}
