package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
