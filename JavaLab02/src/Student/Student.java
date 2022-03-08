package Student;

public class Student {
    private int id;
    private String name;
    private boolean gender;

    public Student(){
        this.id = -1;
        this.name = "Bla";
        this.gender = true;
    }

    public Student(int id,String name,boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isMale(){
        return this.gender;
    }

    public void setMale(boolean gender){
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("ID       Name       Gender");
        System.out.printf("%d     %s   %b",id,name,gender);
    }

    
}


