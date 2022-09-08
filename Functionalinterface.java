package java8feauters.methodreferences;

import java.util.function.IntBinaryOperator;



//default interface
interface Myinterface {
  
  //default method
  default void newMethod() {
      System.out.println("Newly added default method.");
  }
  
  //Abstract method
  public void existingMethod(String str);
}



//Inheritance concept
class Example implements Myinterface {
  
  @Override
  public void existingMethod(String str) {
      
  }
  
}



//creating our own functional interfaces.
interface MyFunctionalinterface {
  
  //single abstract method.
  public int addMethod(int a, int b);
}



public class Functionalinterface {



 public static void main(String[] args) {
      // TODO Auto-generated method stub
      //Lambda Operation
      MyFunctionalinterface sum=(a,b) -> a+b;
      System.out.println("Result = " + sum.addMethod(12, 100));
      
      //predefined functions interface
      //lambda expression
      System.out.println("--Peinted by the predefined interface--");
      IntBinaryOperator add=(a,b) -> a+b;
      System.out.println("Result = " + add.applyAsInt(12, 100));
      
      //Creating an object to the class Example
      Example instance=new Example();
      //Calling the default method of interface
      instance.existingMethod("Java 8 is easy to learn");



 }



}
