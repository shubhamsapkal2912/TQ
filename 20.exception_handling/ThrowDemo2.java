

import java.io.IOException;

public class ThrowDemo2 {
	
	public static void main(String[] args) {
		
		try
		{
		throw new IOException();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
