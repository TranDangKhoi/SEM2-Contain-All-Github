package Rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        this.width=1;
        this.height=1;
    }

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void display(){
        for(int i = 1; i <= height; i++){
        for(int k = 1 ; k <= width; k++){
            System.out.print("#");
        }
        System.out.print("\n");
    }
    }
}
