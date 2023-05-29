package com.soundhar.oops;


class Account{
    private double balance;
    public double getBalance(){
        //validation
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

}


public class DataHiding {
    public static void main(String[] args){
        Account data=new Account();
        data.setBalance(5000.99);
        System.out.println(data.getBalance());

        /*
        1.Data hiding
        2.Abstraction
        3.Encapsulation
        4.Tightly encapsulated class
        5.IS-A relationship
        6.HAS-A realtionship
        7.Method Signature
        8.Overloading
        9.Overriding
        10.static control flow
        11.Instantiate control flow
        12.Constructor
        13.Coupling
        14.Cohesion
        15.Type casting
         */

        /*
        Data Hiding:
        outside person can't as our internal data directly  or our internal data should not go out directly
        this oop feature is nothing but data hiding.
        After validation or authentication outside person can access our internal data.
        for example:
        1.after providing proper username and password we can able to access our gmail inbox information.
        2.Even though we are valide customer of the bank we can able to access our account information and we cannot access
        others account information

        ***
        By declaring data member as private we can implement the data hiding. becoz private cannot be accessed outside.

        the main advantage of data hiding is security.

        It is highly recommeded to declare the variable as private.

         */

        /*
        ABSTRACTION:
            Hiding internal implementation and just highlight the set of services what we are offering , is the concept of
            abstration.

            throught bank atm gui screen , bank people are highlighting the set of services what they are offering without
            highlighting internal implementation.

            advantage: 1.we can achieve security , bcoz we are not highlight our internal implementation
                       2.without affeting outside person we can able perform any type of changes in out internall system
                       and hence Enhancement will become easy.
                       3.improves Maintananace becomes very easy
                       4. improves easyness to use our system.

                       By using interfaces and abstract classes we can implement abstraction.

         */


    }
}
