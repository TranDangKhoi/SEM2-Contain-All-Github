package Animal;

public class Cat extends Animal {
    private int age;
    public Cat(int age){
        super(); // goi den constructor cua Animal
        this.age = age;
    }

    public Cat(String name, int age){
        super(name); // goi den lop cha va su dung constructor cua lop cha
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void catchMouse(){
        // do something
    }
    
    @Override
    public String getAnimalName(){
        return "Jerry";
    }
}
