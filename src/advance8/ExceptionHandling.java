package advance8;

public class ExceptionHandling {

    public static void main(String[] args) {
        //  WAP showing try, multi-catch and finally blocks.
        try{
            int a[]=new int[10];
            a[10]=100/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception");
        }

        catch(Exception e)
        {
            System.out.println("Parent Exception");
        }

        finally
        {
            System.out.println("Finally Block");
        }
    }
}
