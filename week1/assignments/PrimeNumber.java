package week1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int i,a=0,f=0;    
		  int n=3;  
		  a=n/2;   
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");     
		  }else{
		   for(i=2;i<=a;i++){
		    if(n%i==0){
		     System.out.println(n+" is not prime number");   
		     f=1;
		     break;
		    }
		   }      
		   if(f==0)  { System.out.println(n+" is prime number"); }
		  }
	}

}
