import java.util.Scanner;
public class checkpassfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int marks;
       System.out.println("enter the marks of the student");
       marks= s.nextInt();
         
       
             if(marks>=50)
             {
            	 System.out.println("Student pass the exam");
             }
             else
             {
            	 System.out.println("Student fail the exam");
             }
	
	}

}
