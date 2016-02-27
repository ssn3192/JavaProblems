
public class sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int number,sum=0;
		int lbound=1;
		int ubound=100;
		float average;
		
		for(number=lbound; number<= ubound; number++)
		{
			sum=sum+number;
		}
		  System.out.println("the sum is" +sum);
		  
		  average= sum/ubound;
		System.out.println(average);
	}

}
