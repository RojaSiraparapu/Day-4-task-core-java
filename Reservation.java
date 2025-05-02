public class Reservation
{
   public String getReservationDetails(String hotelName,String guestName,int nights)
   {
  	return "hotel: " + hotelName + ", guestname: " + guestName + ", nights: " + nights;
}
     public static void main(String [] args)
     {
        Reservation reservation=new Reservation();
       System.out.println(reservation.getReservationDetails("Grand palace","David",3));
       System.out.println(reservation.getReservationDetails("Grand palace","Maria",2));
     }
}

