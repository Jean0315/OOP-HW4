package fcu.iecs.oop.password;

public class main {

	public static void main(String[] args) {
		PasswordEncorder s1 = new PasswordEncorder ();
		int a = 1;
		String word = "3x17";
		while(a == 1)
		{
			String ba = s1.aa();
			if(word.equals(ba)==true)
			{
				a = 0;
				break;
			}
			System.out.println(ba);
		}

	}

}
