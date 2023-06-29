package com.soundhar.oops;


class Fruit{
    public void m1(){System.out.println("parent");}
}

class Apple extends Fruit{
    public void m2(){System.out.println("child");}
}

public class IsArealationship {
    public static void main(String[] args) {
//      1
        Fruit p= new Fruit();
        p.m1();                 // valid
     //   p.m2();               compile time error cannot find symbol symbol:m2() required: class Fruit

//      2
        Apple a = new Apple();
        a.m1();
        a.m2();                 // both are completely valid

 //     3
        Fruit b = new Apple();
        b.m1();
        //b.m2();                compile time error cannot find symbol symbol:m2() required: class Fruit
        //  ** Parent refernce variable can hold child object but here it can access only parent class method not child class methods.

 //     4
        //Apple c= new Fruit();
        //  ** child Class referncee can not hold the parent class object
    }
}




/*
IS-A RELATIONSHIP

is-a relationship is known as inhertance ,
By using EXTENT key word we can implement IS-A relationship
Main adavantage is reusability of code(we can use parents clss methods)

conclustion:

1.  whatever the methods parent has by default available to the child and hence on the child refernce we can call both parent
and child class methods.

2. whatever the methods child has by default not availabe to the parent and hence on the parent reference we cannt't call
child specific methods.

3.parent reference can be used to hold child object but using the refernce we cann't call child specific methods
but we can call the methods present in parent class.

4.Parent refernce can be use to hold the child object but child refernce can not be used to hold parent object.




Total java API is implemented based on inheritance concepts, the most common methods which are applicable for any java object
are defined in object class and  hence every class in java is the child class of object either directly or indirectly
so that object class methods by default availabe to every java class without rewriting due to this object acts as root
for all java classess.


thowable defines the most common methods which contain which are required for every exceptiona nd error class,
hence these class actss root to java exception heirarchy


                                MULTIPLE INHERITANCE:
A java class cann't extend more than one class at a time .
java won't support for multiple inheritance in classess

class A extends b,c{

}
 is invalid compile time error.


 note:

 1. if our class doesn't extend any other class then only our class is direct child of object
 class A is child of object

 2. if our class extends any other class , then out class is indirect child class of object.

 class A extends B  and class B is child of object ====> MULTILEVEL INHERITANCE

either directly or indirectly java wont provide support for multiple inheritance respected to classes.


WHY JAVA WON'T PROVIDE SUPORT FOR MULTIPLE INHERITANCE:

theren may be a chance of ambiquity problem. Hence java won't provide support for multiple inheritance.

class B{                                class c{
        m1();                                   m1();
}                                       }

class D extends B,C{
    d.m1()              ------------> here is the ambiquity which m1 method is called
}

 */
