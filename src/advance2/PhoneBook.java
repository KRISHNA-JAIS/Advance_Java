package advance2;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        int i, CaseNum;
        Scanner in = new Scanner(System.in);
        HashMap<String,Long> h = new HashMap<String,Long>();
        do {
            System.out.println("Press 1 for entry of name and number in PhoneBook");
            System.out.println("Press 2 for searching number in PhoneBook");
            System.out.println("Press 3 to Quit");
            CaseNum = in.nextInt();
            switch (CaseNum) {
                case 1:
                    System.out.println("Enter name");
                    String name = in.next();
                    System.out.println("Enter number");
                    long number = in.nextLong();
                    if (!(h.containsKey(name))) {
                        h.put(name, number);
                    } else {
                        System.out.println("Name is Already Present");
                    }
                    break;
                case 2:
                    System.out.println("Enter name tp search phone number");
                    String str = in.next();
                    long val = h.get(str);
                    System.out.println(val);
                    break;
                case 3:
                    break;
            }
        }while(CaseNum != 3);

    }

}
