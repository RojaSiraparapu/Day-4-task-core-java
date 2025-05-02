public class Order
{
	public void getOrderDetails(String restaurantName,String foodItem,int quantity)
        {
          System.out.println("restaurant:"+restaurantName);
	  System.out.println("item:"+foodItem);
	  System.out.println("quantity:"+quantity);
        }
public static void main(String [] args)
{
Order order=new Order();
        order.getOrderDetails("Spice garden","Paneer Butter Masala",2);
	order.getOrderDetails("Spice garden","Chiken Biryani",1);
}
}
