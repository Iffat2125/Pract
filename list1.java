import java.util.ArrayList;

public class list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Alpha = new ArrayList<String>();
		Alpha.add("A");
		Alpha.add("B");
		Alpha.add("C");
		Alpha.add("D");
		Alpha.add("E");
		Alpha.add("F");
		Alpha.add("G");
		Alpha.add("H");
		Alpha.add("I");	
		Alpha.add("J");
		Alpha.set(8,"I- Ifat");
		Alpha.remove(1);
		Alpha.remove(1);
		Alpha.remove(1);
		Alpha.remove(1);
		Alpha.remove(1);
		
		for (int i = 0; i < Alpha.size(); i++) {
		      System.out.println(Alpha.get(i));

	}
		System.out.println(Alpha.size());
//		for (String i : Alpha) {
//		      System.out.println(i);
//		    }
//		//Alpha.clear();
	}
	
	
}
