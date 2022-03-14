package Animal;

public class Dog extends Animal {
    private int weight;

    public Dog(int weight){
        this.weight = weight;
    }

    public Dog(String name, int weight){
        super(name);
        this.weight = weight;
    }
    

    @Override
    public String getAnimalName(){
        return "Gau";
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
