public class Travel
{
   public String getBookingDetails(String agency,String destination,int traveller)
   {
  	return "agency: " + agency + ", destination: " + destination + ", traveller: " + traveller;
}
     public static void main(String [] args)
     {
        Travel travel=new Travel();
       System.out.println(travel.getBookingDetails("Wanderlust","Paris",2));
       System.out.println(travel.getBookingDetails("Wanderlust","Tokyo",3));
     }
}

