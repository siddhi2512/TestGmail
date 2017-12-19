
public class Javaarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String X[][] = new String[3][4];
		
		//row 1 
		 X[0][0]="A";
		 X[0][1]="B";
		 X[0][2]="C";
		 X[0][3]="D";
		
		 //row2
		 
		 X[1][0]="A1";
		 X[1][1]="B1";
		 X[1][2]="C1";
		 X[1][3]="D1";
		 
		 //row 3
		 X[2][0]="A2";
		 X[2][1]="B2";
		 X[2][2]="C3";
		 X[2][3]="D4";
		 
		 
		 
		 int rownum =X.length;
		 int colnum=X[0].length;
		 
		 System.out.println(rownum);
		 System.out.println(colnum);
		 
		 for(int i=0;i<rownum;i++ ) {
			 for(int j=0;j<colnum;j++) {
				 System.out.print(X[i][j]+"--");
			 }
				 
				 System.out.println();
			 
		 }
		 
		 
		 int y[] = new int[5];
		 
		    y[0]=1;
		    y[1]=2;
		    y[2]=3;
		    y[3]=4;
		    y[4]=5;
		    
		    
		   int Alenght=y.length;
		   System.out.println("Array length is"+Alenght);
		   
		   int sum=0;
		   
		   for(int a=0; a<Alenght ;a++) {
			   System.out.println(y[a]);
			   sum = sum+y[a];
			   
		   }
		   
		   System.out.println("Sum of total array value is--"+sum);
		    
		    
		    
		 
		 
		 
		
		
		

	}

}
