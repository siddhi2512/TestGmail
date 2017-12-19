
public class Javafunction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumAll(10,10);
		findSum(100);
	}
		
	public static void sumAll(int a, int b) {
		int Total=0;
		
		Total=a+b;
		System.out.println("Value of sum is:"+Total);
		
	}	
	//function with return type
		
	public static int findSum(int n){
		
	    int sum=0;
	    for(int i=0;i<=n;i++) {
	    	sum=sum+n;
	    }
	    System.out.println("Sum of value "+n+"is:"+sum);
	    	return sum;
	    	
	    }
	}
	

		
	


