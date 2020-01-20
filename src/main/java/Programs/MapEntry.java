package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {

		Map<String, String> stud = new HashMap<String, String>();

		stud.put("Name", "sumit");
		stud.put("Branch", "IT");
		stud.put("City", "Ramtek");

		Set<Entry<String, String>> studEntry = stud.entrySet();

		for (Map.Entry<String, String> individual : studEntry) {

			System.out.println(individual.getKey() + " " + individual.getValue());
//			Branch IT
//			City Ramtek
//			Name sumit

		}
		System.out.println(stud);
        //{Branch=IT, City=Ramtek, Name=sumit}
	}

}
