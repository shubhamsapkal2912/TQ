
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class CheckedException {
	
	public static void main(String[] args) {
		
		// try catch---> handle yourself
		// JVM --> handle---> throws
		File f1= new File("/Users/shubham/Desktop/TQ/THEORY/20.exception_handling/Voting.java");
		System.out.println(f1.length());
		try
		{
		FileReader fr= new FileReader(f1);
		BufferedReader br= new BufferedReader(fr);
		
		// read first 2 line
		 for (int i = 0; i < 100; i++)
	            System.out.println(br.readLine());
		 br.close();
		 fr.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
