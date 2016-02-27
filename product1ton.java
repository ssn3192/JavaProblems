import java.util.Scanner;
public class product1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int number, i,product=1;
		System.out.println("enter the number");
		number=s.nextInt();
		for(i=1;i<=number;i++)
		{
		    product= product*i;
		}
		System.out.println(product);
	}
}
