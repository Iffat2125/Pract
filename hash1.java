import java.util.HashMap;

public class hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
			    // Create a HashMap object called capitalCities
			    HashMap<String, String> capitalCities = new HashMap<String, String>();

			    // Add keys and values (Country, City)
			    capitalCities.put("England", "London");
			    capitalCities.put("Germany", "Berlin");
			    capitalCities.put("Norway", "Oslo");
			   capitalCities.put("USA", "Washington DC");
			    System.out.println(capitalCities);
			    System.out.println("Return: "   + capitalCities.get("England"));
			    System.out.println("Remove: "   + capitalCities.remove("England"));
			    System.out.println("Size: "   + capitalCities.size());
			    System.out.println("********************************** ");
			    for (String i : capitalCities.keySet()) {
			    	  System.out.println("Keys: "+i);
			    	}
			    System.out.println("********************************** ");
			    for (String i : capitalCities.values()) {
			    	  System.out.println("Values: " + i);
			    	}
			    System.out.println("********************************** ");
			    for (String i : capitalCities.keySet()) {
			    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
			    	}
	}

}
