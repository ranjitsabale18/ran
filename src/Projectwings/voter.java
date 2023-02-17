package Projectwings;

public class voter {
	
	public static void main(String[] args) {
		
	String str= isValidVoter(20)? "Valid Voter": "Invalid Voter";
	 System.out.println(str);
	}

	public static boolean isValidVoter(int age) {
		
		if (age >= 18)
		{ 
			return true;
		}
		else
		{ 
			return false;
		}
}
	
}