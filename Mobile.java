public class Mobile
{
	public void showDetails(String storeName,String brand,int price)
        {
          System.out.println("Store:"+storeName);
	  System.out.println("Brand:"+brand);
	  System.out.println("price:"+price);
        }
public static void main(String [] args)
{
	Mobile mobile=new Mobile();
        mobile.showDetails("Tech world","Apple",900);
	mobile.showDetails("Tech world","Samsung",1200);
}
}

