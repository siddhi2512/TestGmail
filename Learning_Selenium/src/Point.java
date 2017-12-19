
public class Point {
	int x;
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.x=10;
		p.y=20;
		System.out.println("Value of x is "+" "+ p.x +" "+"Value of y is"+" "+ p.y);
		p.swapvalue(p);
		System.out.println(" Swapped Value of x is "+" "+ p.x +" "+"Value of y is"+" "+ p.y);
		
     
	}
    public void swapvalue(Point t) {
    	int temp=t.x;
    	t.x=t.y;
    	t.y=temp;
    	
    }
    
}

