import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
	   // cars.add("Mazda");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	  // cars.add("Mazda");
	    System.out.println(cars);
	   if (cars.contains("Mazda"))
	   {
		   System.out.println("Yes it contains: "  + cars.remove("Mazda"));
		   
	   } 
	   else {
		   System.out.println("No it doesn't contains: " +cars.remove("Mazda"));
		   cars.clear();
		   System.out.println("Size:  "+	cars.size());
	}
	}
	

}
