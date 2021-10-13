import java.io.File;
import java.util.Date;

	public class Exe8 {
	       public static void main(String[] args) {
	       File file = new File("D:\\abcd.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("The file was last modified on:\n " + date);	   
	     }
	}


