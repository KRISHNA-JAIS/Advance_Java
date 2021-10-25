package advance1;
public class Dish {
    int dishID;
    static String dishName;
    int creationTime;
    Dish(int dishID,String dishName,int creationTime)
    {
        super();
        this.dishID=dishID;
        this.dishName=dishName;
        this.creationTime=creationTime;
    }


    void show()
    {
        System.out.println("your Dish id is "+dishID);
        System.out.println("your dish name is "+dishName);
        System.out.println("creation time will be "+creationTime+" minutes");
    }
}
