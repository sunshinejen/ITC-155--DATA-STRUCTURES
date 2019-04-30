import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssignFour {

	public static void main(String[] args) {

		Map<String, String> nameMap = new HashMap<String, String>();

		// add key value pairs
		nameMap.put("Marty", "Stepp");
		nameMap.put("Stuart", "Reges");
		nameMap.put("Jessica", "Miller");
		nameMap.put("Amanda", "Camp");
		nameMap.put("Hal", "Perkins");

		Map<String, String> nameMap2 = new HashMap<String, String>();

		// add key value pairs
		nameMap2.put("Kendrick", "Perkins");
		nameMap2.put("Stuart", "Reges");
		nameMap2.put("Jessica", "Miller");
		nameMap2.put("Bruce", "Reges");
		nameMap2.put("Hal", "Perkins");

		
		
		System.out.println(isUnique(nameMap));// returns true
		System.out.println(isUnique(nameMap2));// returns false

	}

	public static boolean isUnique(Map<String, String> map) {
		Set<String> set = new HashSet<String>();

		for (String value : map.values()) {

			if (set.contains(value)) {
				//System.out.println("false");
				return false;
			}else {

			set.add(value);
		}
	}
		//System.out.println("true");
		return true;
	}

}
