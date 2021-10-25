package advance7;

public class JavaHungry {
    public static void main(String args[])
    {
        // Write and explain the output of the following program?

        try
        {
            int arr[]= {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
        }

    }
}
