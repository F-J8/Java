/*
* State affect behavior , behavior affects state.
*
* Objects Have STATE        and     BEHAVIOR represented by
*       instance variables          mathods.
*
* methods use instance variable values,
* Reminder: a class decribes what an object knows and what an object does
* A class is the blueprint how the JVM should make an objet of that type.
*
* A caller PASSES ARGUMENTS . A method Takes parameters. (page 74 it makes all sense)
*
* argument - a value like 2, Foo, or a reference to a DOG
* parameter is a local variable.
*
* If a method takes a parameter , you must pass it something when you call it.
*
* Java is pass-by-value That means pass-by-copy.
*
* java passes everything by value.
* getters and setters/accessors and mutators
* make the instance private and set public getters and setter
*
* instance variables vs. Local Variables
* Instance variables are declared inside a class bit not within a method.
* Local variables are declared within a method.
* Local variables must be initialized before use.
* local variables in methods need to be initialized int x = 0;
*  use == to compare two primitives or if two references are refering to the same object.
* use the equals() method to see if two different objects are equal.
* == cares only for the bits patter in the variable.
*
*
*start page 87
*
*
*
* */

class ElectricGuitar{
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;
    Foo a = new Foo();
    String getBrand(){
        return brand;
    }
    void setBrand(String aBrand){
        brand = aBrand;
    }
}

