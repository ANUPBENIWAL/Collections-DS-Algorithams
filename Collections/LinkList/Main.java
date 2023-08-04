package Collections.LinkList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("I20"); 
    cars.removeLast();
    System.out.println(cars);
    System.out.println(cars.getLast());
    }
    
}
