package inheritance;

public class Nokia1100 implements SymbianPhone {

   PreNokia1100 prototype;


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */

    public void display(){
       System.out.println("From Display Method");
    }

   @Override
   public void sendText() {

   }

   public void makeCall(){
       System.out.println("From makeCall Method");

    }


   }
