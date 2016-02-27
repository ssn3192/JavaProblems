
public class P1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=9,b=80;
    String P= "Helo shivani";
         add(a,b); 
         printname(P);
		 System.out.println("Hello world");
	     mul(a,b);
	}
	
	public static void add(int a, int b)
	{
		int c;
		c= a+b;
		System.out.print("the sum is" +c);
	}
	
public static void printname(String P)
{
	 
	 System.out.println(P);
}
public static void mul(int s, int r)
{
	int z= s*r;
	System.out.println("result:" +z);
}

}
