public class Faculty
{
	public void showFacultyDetails(String universityName,String facultyName,String Department)
        {
          System.out.println("university:"+universityName);
	  System.out.println("faculty:"+facultyName);
	  System.out.println("Department:"+Department);
        }
public static void main(String [] args)
{
	Faculty faculty=new Faculty();
        faculty.showFacultyDetails("Stanford University","Dr.Robert Brown","computerscience");
	faculty.showFacultyDetails("Stanford University","Dr.LisaGreen","physics");
}
}
