package com.soundhar.oops;


class Accounts{
    private double balance;         // data hiding becoz data member is private

    public double getBalance() {            // below 2 methods are abstraction becoz they will be hiding from the end user;
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Accounts a = new Accounts();
        a.setBalance(2501.99);
        System.out.println(a.getBalance());

    }
}
/*
    the process of binding data and corresponding methods into a single unit is nothing but encapsulation.

    class student {
            data members
            +
            methods(behavoirs)
    }

    combination of data hiding and abstraction is know as encapsulation.
    Encapsulation = Data hiding + Abstraction;

        the main advantage of encapsulation is security but
        the main disadvantagee of encapsulation is it increases the length od the code and slows down the execution.
 */

/*

    Tightly Encapsulated class:
            A class is said to be Tightly encapsulated if and only if each and every variable declared as private;

            wheather class contains corresponding getter and setter methods are not and wheather these methods are declared as public
            are not , these we are not required to check.

 */