import java.util.LinkedList;

public class linked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	   System.out.println("At Second position" + cars.get(2)); ;
//	    cars.addFirst("VERNA");
	    cars.addLast("SWIFT");
	    System.out.println(cars);
	  cars.addLast("I20");
	  System.out.println("At 1 position is : " + cars.get(0));
	  System.out.println("First Postion is :" + cars.getFirst());
	  System.out.println("Last Postion is :" + cars.getLast());
	  System.out.println("Removed" + cars.removeLast());
	}

}
