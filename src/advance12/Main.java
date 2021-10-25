package advance12;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Employee array[];

    static {
        array = new Employee[1];
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/core12/Employee.txt");

        // Reading from the file

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        System.out.println("Employee Details Currently inside Employee.txt: ");
        while ((str = br.readLine()) != null) {
            String[] vartemp = str.trim().split(",");

            // Storing inside employee object

            Employee emp = new Employee(Integer.parseInt(vartemp[0]),vartemp[1],Integer.parseInt(vartemp[2]));
            array[0] = emp;
        }
        br.close();

        // Displaying the content of object

        System.out.println(array[0]);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the detail of another employee ");
        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the ID : ");
        int id = sc.nextInt();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        String text = id + "," + name + "," + age ;
        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.flush();
        fw.close();


        br = new BufferedReader(new FileReader(file));
        System.out.println("New employee details are : ");
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
    }
}
