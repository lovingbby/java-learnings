package com.soundhar.oops;


class Engine{
    int engineModelNo;
    String engineName;
}

class Car{
    Engine e = new Engine();            // Aggregation
}

public class HasARelationship {
    public static void main(String[] args) {

    }
}

/*

1. Has-A relaationship is also known as composition or aggregation
2.There is no specific keyword to implement HAS-A relation, BUt most of the time we are depending on new keyword.
3. THe main advantage of Has-A relationship is reusability of the code.

Example:
        car has-a engine refference.

Differenrce between composition and aggregation?

1.Without exisiting container object if there is no chance of exsisiting contained object,
then container and contained objuect are strongly
associated and these strong association is nothing but composition

eg: University serveral departments without exisisisting university there is know chance of existing department hence
    university and department are strongly associated and these strong assocaiation is nothing but composition.
2.In composition container object holds directly contained objects. where as in aggregation container objects
refernce hold contained objects.

---------------
without exisiting container object if there is chance of exisisting contained object then container and contained object are
weakly associated and these weak association is nothing but aggregation.

eg.Department consists of several professors without existing depaerment there may be a chance of existing professor objects
Hence deparment and porffesor objects are weakly associated and these weak association is nothing but aggregation.

IS-A VS HAS-A

1. if we want total functionality of a class automitaically then we should go for IS-A relationship
    eg. parent class completyly required of  child class.
2. if we want part of the functionality then we should go for HAS-A relationship
    eg. if we parent class ha 10 methods and we wan t2 methods only in child class we create the reference in child and use it.
 */
