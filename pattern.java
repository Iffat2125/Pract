import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" Enter the digit ");
      Scanner sc = new Scanner(System.in);
      int count= sc.nextInt();
		//int count= 5;6
      //Pattern 1 
//      for(int i = 0; i<=count; i++)
//      {
//    	  for(int j=1; j<=i; j++)
//    	  {
//    		  System.out.print(" * ");
//    	  }
//    	  System.out.println( );
//      }
      
     // Pattern 2
      for(int i = count; i>=count; i--)
        {
     	  for(int j=i; j<=i; j++)
     	  {
      		  System.out.print(" * ");
     	  }
      	  System.out.println( );
       }
	}

}
