package Animal;

public class VNCat extends Cat {

    public VNCat(int age){
        super(age);
    }

    public VNCat(String name, int age) {
        super(name, age);
        
    }

    @Override // ghi de len phuong thuc cua thang cha (Cat)
    public String getAnimalName(){
        return "Meo meo from VN";
    }
    
}
