package week1.assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a, b=0,e;
		int d = 979;
		e = d;
		while (d>0) {
			
			a = d%10;
			b=(b*10)+a;
			d=d/10;
		}
		if (e==b) {
			
			System.out.println("palindrome number ");
			
		} else {
			
			System.out.println("not a palindrome number ");
		}
			
	}

}
