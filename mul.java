
public class mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5,row,column,result;
		for(row=1;row<size;row++)
		{
	      System.out.format("%4d",row);
	      
	}
		System.out.println();
		System.out.println("----");
		
		for(row=1 ;row<size;row++) {
			
			            // print left most column first
			
			            System.out.format("%4d |",row);
			
			            for(column=1;column<size;column++) {
			
			                System.out.format("%4d",row*column);
			
			            }
			
			            System.out.println();
		
			        }

			
		}
		

}
