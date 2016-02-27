import java.util.Scanner;
public class arraysum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n,i,total = 0;
		
		Scanner s= new Scanner(System.in);
	      //first array
		System.out.print("Enter the number of elements");
	    int a= s.nextInt();
	    int array[]= new int[a];
	    System.out.println("the following elements are:");
	    for(i=0;i<a;i++)
	    {
	    	  array[i]= s.nextInt();
	    	  
	    }
	       // second array
	    System.out.print("Enter the number of elements for second array");
	    int b= s.nextInt();
	    int array1[]= new int[b];
	    System.out.println("the following elements are:");
	    for(i=0;i<b;i++)
	    {
	    	  array1[i]= s.nextInt();
	    	  
	    }
	    int sum=0;
	    for(i=0;i<a;i++)
	    {
	    	  sum= sum+array[i];
	    }
		  System.out.println("Sum of first array" +sum);
		
		  int sum1=0;
		    for(i=0;i<b;i++)
		    {
		    	  sum1= sum1+array1[i];
		    }
			  System.out.println("sum of second array" +sum1);
			  
			  for(i=0;i<a;i++)
			  {
				  total= sum + sum1;
			  }
			  System.out.println("the sum of both the array:" +total);
				   
	
	}
       
}
