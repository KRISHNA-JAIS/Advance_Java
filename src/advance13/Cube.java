package advance13;
public class Cube implements Runnable{

    int x;

    public Cube(int x){
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println("Cube of the number " + x*x*x);
    }
}
