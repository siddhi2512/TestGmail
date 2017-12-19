
public class Javaobject {
	String mod;
	static int wheels =4;
	int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Javaobject jo = new Javaobject();
     jo.mod="Maruti";
     jo.price=2000;
     
     System.out.println("Car Model is :"+ jo.mod);
 	 System.out.println("Car has :" + wheels );
     
     jo.start();
     jo.accel();
	} 
     
    public void start() {
    	System.out.println("Car Model is :"+ mod);
    	System.out.println("Car has :" + wheels );
    	
    }
    
    public void accel() {
     
	}

}

