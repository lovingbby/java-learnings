package com.soundhar.oops;


interface A{

}

interface B{

}


public interface MultipleInheritance extends  A,B{
}

/*

   1.multiple inheritance is not suppoorted with repect to classess.
   2.But it can be achieved by interface, interface can extends the anynumber of interface simultaneously.

why ambiquity won't be there in interfaceses?

interface p1{
m1();
}

interface p2{
m1();
}

interface c extends p1,p2{
m1();
}


implementation class will have which m1() method has to excute.


Even though multiple method declaration are available but , implementation is unique and hence theresis no chance of ambiquity problem
in interfaces.


Strictly speaking through interfaces we won't get any inheritance.



CYCLIC INHERITANCEA

cuyclic inheritance is not allowed in  java , ofcourse its not required
example:
class A extend A{
}
 and

 class A extends B{}
 class B extends A{}

 both will give compile time error cyclic inheritance not allowed in java.


 */