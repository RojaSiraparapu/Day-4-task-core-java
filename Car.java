public class Car
{
   public void displayDetails(String showroom,String modelName,int price)
   {
	System.out.println(" showroom:"+showroom);
	System.out.println("model:"+modelName);
	System.out.println("price:"+ price);
    }
     public static void main(String [] args)
     {
        Car car=new Car();
        car.displayDetails("Elite Motors","Tesla Model S",80000);
        car.displayDetails("Elite Motors","BMW x5",75000);



     }
}

