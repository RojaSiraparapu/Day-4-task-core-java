public class Book
{
 public void displayInfo(String libraryName,String title,String author)
 {
   System.out.println("library Name:"+libraryName);
   System.out.println("title:"+title);
   System.out.println("author:"+author);
 }	 
public static void main(String [] args)
{
	Book book=new Book();
	book.displayInfo("City public Library","The Great Gatsby","F.Scott Fitzerld");
	book.displayInfo("City public Library","1984","George Orewekll");
}
}







