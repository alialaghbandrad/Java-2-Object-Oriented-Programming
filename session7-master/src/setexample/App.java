package setexample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Address{
	String streetName;
	int buildingNo;
	public Address(String streetName, int buildingNo) {
		super();
		this.streetName = streetName;
		this.buildingNo = buildingNo;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", buildingNo=" + buildingNo + "]";
	}
	
	
	
}

public class App {
	
	public static void main(String[] args) {
		Set<Integer> setinteger = new HashSet<Integer>();
		
		//you don't have any duplicate value
		setinteger.add(1);
		setinteger.add(2);
		setinteger.add(2);
		setinteger.add(3);

		
		setinteger.forEach(member -> System.out.println(member));
		
		setinteger.remove(2);//remove the elements
		
		
		//using Map => it maps x-> y , it maps key ->value
		Map<String, String> mapValue = new HashMap<String, String>();	
		mapValue.put("J4M", "Longueuil");
		mapValue.put("J4M1", "Longueuil");
		mapValue.put("H3T", "NDG");
		
		
		Map<String, Address> mapAddress = new HashMap<String, Address>();
		mapAddress.put("12345", new Address("Main street", 23));
		mapAddress.put("78783", new Address("Not a main street", 20));
		
		for (Map.Entry<String, Address> entry : mapAddress.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		
		
		mapAddress.replace("12345", new Address("Main street", 23), new Address("Main street", 27));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
