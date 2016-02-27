import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		  i= s.nextInt();
		  oddeven(i);
	}
  public static void oddeven(int n)	
  {
	if(n%2==0)
	  {
		  System.out.println("EVEN NUMBER");
		  
	  }
	  else
	  {
		  System.out.println("ODD NUMBER");
			  
	  }
	
  }

}
