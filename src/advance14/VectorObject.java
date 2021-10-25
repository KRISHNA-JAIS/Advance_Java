package advance14;

import java.util.Scanner;
import java.util.Vector;

public class VectorObject {
    public static void main(String[] args) {
        int i,CaseNum;
        Scanner in = new Scanner(System.in);
        Vector<String> vec = new Vector<String>();
        Name obj = new Name();
        do
        {
            System.out.println("Enter 1 to Add the Names");
            System.out.println("Enter 2 to display total number of Names");
            System.out.println("Enter 3 to Exit");
            CaseNum = in.nextInt();
            switch (CaseNum)
            {
                case 1:
                    System.out.println("Enter the First Name");
                    String Name = in.next();
                    obj.name = Name;
                    System.out.println("Enter Surname");
                    String Surname = in.next();
                    obj.surname = Surname;
                    obj.vector();
                    break;

                case 2:
                    System.out.println("Total Names in vector is = "+ obj.Size());
                    break;

                case 3:
                    break;

            }
        }while(CaseNum != 3);
    }
}

class Name
{
    String name;
    String surname;
    Vector<String> vec = new Vector<String>();

    public void vector()
    {
        String str = name + " " + surname;
        vec.add(str);
    }

    public int Size()
    {
        return vec.size();
    }

}
