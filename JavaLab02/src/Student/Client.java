package Student;
public class Client{
    public static void main(String[] agrs) {
		Student studentA;
		Student studentB;
		
		studentA = new Student(0,"Tran Dang Kh",true);
		studentB = new Student(1,"Nguyen Van A",true);
		studentA.printInfo();
		studentB.printInfo();
		
		studentB.setName("Nguyen Van B");
        studentB.setID(2);
        studentB.setMale(true);
		studentB.printInfo();
	}

}