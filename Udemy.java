public class Udemy
{
   public void getEnrollmentInfo(String platform,String course,String student)
   {
	System.out.println("Platform:"+ platform);
	System.out.println("course:"+ course);
	System.out.println("student:"+ student);
    }
     public static void main(String [] args)
     {
         Udemy udemy=new Udemy();
        udemy.getEnrollmentInfo("Udemy","Java programming","Alice");
        udemy.getEnrollmentInfo("Udemy","Webdevelopment","Bob");
     }
}
