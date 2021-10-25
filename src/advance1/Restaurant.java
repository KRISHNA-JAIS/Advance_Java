package advance1;

import java.util.Scanner;

public class Restaurant {
    static String dname;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to display Dishes.\n" +
                "Press 2 to search Dish\n");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                Menu d=new Menu();
                d.show();
                break;
            case 2:
                Menu db=new Menu();
                db.show();
                Scanner s=new Scanner(System.in);
                System.out.println("Enter your Dish Id");
                int dishID=s.nextInt();
                int creationTime=10;
                if (dishID==1)
                {
                    Dish ds=new Dish(1,"Chill potato",creationTime);
                    ds.show();
                    break;
                }
                if (dishID==2)
                {
                    Dish ds=new Dish(2,"Paneer tikka",12);
                    ds.show();
                    break;
                }
                if (dishID==3)
                {
                    Dish ds=new Dish(3,"Springs",12);
                    ds.show();
                    break;
                }
                if (dishID==4)
                {
                    Dish ds=new Dish(4,"Fries",22);
                    ds.show();
                    break;
                }
                if (dishID==5)
                {
                    Dish ds=new Dish(5,"Masala Noodles",14);
                    ds.show();
                    break;
                }
                if (dishID==6)
                {
                    Dish ds=new Dish(6,"French fries",14);
                    ds.show();
                    break;
                }
                if (dishID==7)
                {
                    Dish ds=new Dish(7,"Paneer Maggie",14);
                    ds.show();
                    break;
                }
                if (dishID==8)
                {
                    Dish ds=new Dish(8,"Masala maggies",14);
                    ds.show();
                    break;
                }
                if (dishID==9)
                {
                    Dish ds=new Dish(9,"Fries",14);
                    ds.show();
                }
                if (dishID==10)
                {
                    Dish ds=new Dish(10,"Fried Noodles",14);
                    ds.show();
                }
                if (dishID==11)
                {
                    Dish ds=new Dish(11,"tikka",24);
                    ds.show();
                }
                else {
                    System.out.println("Your choice is not available :");
                }



        }
    }}
