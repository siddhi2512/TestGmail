
public class Constructor {
 String name;
 int age;
   
Constructor() {
	System.out.println("Constructor called off");
}
Constructor(String n, int a) {
	System.out.println("Name is"+n+ "and age is"+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Constructor co = new Constructor();
      Constructor co1 = new Constructor("Siddhi",28);
      
      
	}

}