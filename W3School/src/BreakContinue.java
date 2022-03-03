public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("This is a 'continue;' example ");
        for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
        }     
    System.out.println("This is a 'continue;' example ");
    for (int j = 0; j < 10; j++) {
        
      if (j == 4) {
        break;
      }
      System.out.println(j);
        }     
    }      
}
