public class TypeCasting {
    public static void main(String[] args) {
        // Narrowing Casting
        double myDouble = 123.456d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        // Widening Casting
        int yourInt = 69;
        double yourDouble = yourInt;
        System.out.println(yourDouble);
        System.out.print(yourInt);
    }
}
