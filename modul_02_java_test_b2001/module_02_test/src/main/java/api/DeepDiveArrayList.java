package api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeepDiveArrayList {

    /**
     * @author Jahiudl Islam
     * ArrayList JDK 8 API documantation to be read and ArrayList source code to be viewed
     * Demonastrate your understanding on ArrayList after reading the document
     * You are free to document your understanding using comment
     *
     * */

    public static void main(String[] args) {
        GenericArrayList();
        ArrayList list = new ArrayList();
        //Add Values
        list.add(10);
        list.add("Cat");
        list.add(20.32);
        list.add(true);
        list.add(null);
        list.add("c");
        System.out.println(list.size());
        System.out.println(list);

        //fetch the from a list
        System.out.println("Third value of the list = "+list.get(2));

        //remove value from list
        System.out.println(list.remove(0));
        System.out.println(list.size());

        //getting all the values from the list using Loops
        for (int i = 0; i<list.size();i++){

            System.out.println(list.get(i));
            System.out.println("Inside for loop");
        }

        for(Object var:list){

            System.out.println(var);
            System.out.println("Inside for each loop");

        //using iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
      }

    }
    //using genericArraylist to store value
    public static void GenericArrayList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(500);
        int i = list.get(0);
        System.out.println(i);
    }


}
