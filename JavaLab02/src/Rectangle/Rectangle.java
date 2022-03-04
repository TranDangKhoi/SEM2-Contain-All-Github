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

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getArea(){ // Lấy diện tích hình chữ nhật
        return width*height;
    }

    public int getPerimeter(){ // Lấy chu vi hình chữ nhật
        return 2*(width+height);
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
