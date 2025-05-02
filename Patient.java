public  class Patient
{
	public void printDetails(String hospitalName,String patientName,int age)
        {
          System.out.println("Hospital:"+hospitalName);
	  System.out.println("patient:"+patientName);
	  System.out.println("age:"+age);
        }
public static void main(String [] args)
{
	Patient patient=new Patient();
        patient.printDetails("Tech world","Apple",900);
	patient.printDetails("Tech world","Samsung",1200);
}
}
