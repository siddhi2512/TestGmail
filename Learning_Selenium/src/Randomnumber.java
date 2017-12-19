public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printrandomnumber(50);
		
		//System.out.println(a);
		
	}
		
	public static int printrandomnumber(int n){
	
	   double  d = Math.random() *n;
	   
	   int a =(int)d;
	   
	   System.out.println(a);
	     return a;
	   

	}

}
