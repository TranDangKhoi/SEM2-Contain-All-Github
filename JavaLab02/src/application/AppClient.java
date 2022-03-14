package application;
import Animal.Animal;
import Animal.Cat;

public class AppClient {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom",3);
        cat.setName("Muop");
        cat.getName();
        Cat cat1 = new Cat("Tam the",4);
        cat1.getName();

        Cat cat2 = (Cat)cat;
        cat2.getAnimalName();

        
        if(cat1 instanceof Cat){
            System.out.println("cat1 is instance of Cat");
        }
    }
}
