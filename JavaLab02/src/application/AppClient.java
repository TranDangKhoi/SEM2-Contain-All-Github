package application;
import Animal.Animal;
import Animal.Cat;
import Animal.Dog;

public class AppClient {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom",3);
        cat.setName("Muop");
        cat.getName();
        
        Cat cat1 = new Cat("Tam the",4);
        

        Cat cat2 = (Cat)cat;
        
        System.out.println("Name of cat1 is:" + cat1.getAnimalName());
    }
}
