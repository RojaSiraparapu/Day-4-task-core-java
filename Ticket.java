public class Ticket
{
   public void getTicketInfo(String theaterName,String movieName,String seatNo)
   {
	System.out.println("Theater:"+ theaterName);
	System.out.println("Movie:"+ movieName);
	System.out.println("Seat:"+ seatNo);
    }
     public static void main(String [] args)
     {
         Ticket ticket=new Ticket();
        ticket.getTicketInfo("Galaxy Cinemas","Interstellar","A10");
        ticket.getTicketInfo("Galaxy Cinemas","Inception","B12");



     }
}

