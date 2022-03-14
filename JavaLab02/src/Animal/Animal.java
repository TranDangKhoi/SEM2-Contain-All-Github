package Animal;

public abstract class Animal{
    private String name;
public Animal(){
    
}

public Animal(String name){
    this.name = name;
}



//getter , setter
public String getName(){
    return this.name;
}

public void setName(String name){
    this.name = name;
}

// implemented code thuc hon o lop con (lop ke thua)

public abstract String getAnimalName();
}