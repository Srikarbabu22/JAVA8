package java8feauters.methodreferences;

import java.util.function.BiFunction;



interface MyInterface {
    //A method --  abstract method
    public void diaplay();
}



// ----> make reference to the abstract method and instance method.-->
//method reference to an instance method of an object - Object:: instanceMethod.



/*
* Second method
* Method reference to static method of the class.
*/
class Addition {
    static int add(int numberOne, int numberTwo) {
        return numberOne+numberTwo;
    }
}



public class Student {



   /*First Method
     * Method references is the short hand notation of lambda expression
     * to call a method.
     *
     * str -> System.out.println(str);
     * system.out::println
     *
     */
    //method reference to an instance method of an
    //object - Object:: instanceMethod.
    
    



   public void myMethod() {
        System.out.println("Instance Method");
        System.out.println("-I have been referened by the abstract-");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //create an object to class -Student
        Student object = new Student();
        
        //Method reference using the object of the class
        MyInterface ref=object::myMethod;
        
        //Calling the method of functional Interface
        ref.diaplay();
        
        //create an object to class addition
        BiFunction<Integer,Integer,Integer> addition = Addition::add;
        int sum=addition.apply(43, 100);
        System.out.println("Addition of given number is : " + sum);
    }



}
