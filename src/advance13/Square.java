package advance13;

public class Square implements Runnable{
    int y;

    public Square(int y){
        this.y = y;
    }
    @Override
    public void run() {
        System.out.println("Square of the number = " + y*y);

    }
}